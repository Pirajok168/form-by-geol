import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.function.Consumer;

import data.SaveData;
import data.entities.Borehole;
import data.entities.DrillingLine;
import data.util.HibernateSessionFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.*;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.jetbrains.annotations.NotNull;
import printing.Main;

public class MainController {


    @FXML
    private ScrollPane contentPane;
    @FXML
    private ListView<LeftTabs> listView;

    @FXML
    private MenuItem printing;

    //private final Model model = Single.getModelFirstList();
    //private final FirstListController firstListController = new FirstListController();
    //private final SecondListController secondListController = new SecondListController();
    //private final ThirdController thirdController = new ThirdController();

    private final ObservableList<LeftTabs> leftTabsList = FXCollections.observableArrayList(Arrays.asList(LeftTabs.Documentation, LeftTabs.Result, LeftTabs.Table, LeftTabs.LastTable, LeftTabs.Akt));

    @FXML
    private TextField borehole;

    @FXML
    private Button btnAddBorehole;

    @FXML
    private Button btnAddLine;

    @FXML
    private TextField drillingLine;

    @FXML
    private Accordion listLines;

    private void createElement(@NotNull DrillingLine drillingLine, Consumer<Borehole> event) {
        ListView<String> boreholesList = new ListView<>();
        boreholesList.minHeight(400);

        try (var session = HibernateSessionFactory.getSession()) {
            var transaction = session.beginTransaction();
            var boreholes = drillingLine.getBoreholes();
            transaction.commit();

            if (boreholes != null && !boreholes.isEmpty())
                boreholes.forEach(bh -> boreholesList.getItems().add(bh.getTitle()));
        }

        boreholesList
                .getSelectionModel()
                .selectedIndexProperty()
                .addListener((observableValue, oldNum, newNum) -> {
                    try (var session = HibernateSessionFactory.getSession()) {
                        var transaction = session.beginTransaction();
                        var boreholesQuerry = session.createQuery("from Borehole where drillingLine = :dl", Borehole.class);
                        boreholesQuerry.setParameter("dl", drillingLine);
                        event.accept(boreholesQuerry.list().get(newNum.intValue()));
                    }
                });

        TextField boreholeTitile = new TextField();
        boreholeTitile.setPromptText("Введите номер скважины");

        Button addBoreholeButton = new Button("Добавить скважину");
        addBoreholeButton.setDisable(true);
        addBoreholeButton
                .setOnAction(actionEvent -> {

                    var newBoreHoleTitle = boreholeTitile.getText();
                    boreholeTitile.clear();

                    try (var session = HibernateSessionFactory.getSession()) {
                        var transaction = session.beginTransaction();

                        session.persist(Borehole.builder()
                                .drillingLine(drillingLine)
                                .title(newBoreHoleTitle)
                                .build());

                        var getNewDLQuerry = session.createQuery("from Borehole where drillingLine = :drillingLine and title = :title order by id desc", Borehole.class);
                        getNewDLQuerry.setParameter("drillingLine", drillingLine);
                        getNewDLQuerry.setParameter("title", newBoreHoleTitle);

                        var newBoreholeAttached = getNewDLQuerry.list().get(0);
                        transaction.commit();

                        boreholesList
                                .getItems()
                                .add(newBoreholeAttached.getTitle());
                    }
                });

        boreholeTitile.textProperty().addListener((observableValue, oldVal, newVal) -> {
            if (newVal.isBlank() || newVal.isEmpty())
                addBoreholeButton.setDisable(true);
            else
                addBoreholeButton.setDisable(false);
        });

        HBox boreholeAddFuncView = new HBox(boreholeTitile, addBoreholeButton);
        boreholeAddFuncView.setAlignment(Pos.CENTER);

        VBox existBoreholesCollectionView = new VBox(boreholeAddFuncView, boreholesList);

        TitledPane drillingLinePane = new TitledPane();
        drillingLinePane.setText(String.format("Буровая линия: %s", drillingLine.getTitle()));
        drillingLinePane.minHeight(400);
        drillingLinePane.setContent(existBoreholesCollectionView);

        listLines.getPanes().add(drillingLinePane);
    }

    private void createElement(DrillingLine drillingLine) {
        createElement(drillingLine, bh -> {
            var alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle(String.format("Буровая линия: %s", bh.getTitle()));
            alert.setHeaderText(bh.toString());
            alert.showAndWait();
        });
    }

    @FXML
    void addLine(ActionEvent event) {
        try (var session = HibernateSessionFactory.getSession()) {
            var transaction = session.beginTransaction();

            session.persist(DrillingLine
                    .builder()
                    .title(drillingLine.getText())
                    .build());

            var getNewDLQuerry = session.createQuery("from DrillingLine where title = :title order by id desc", DrillingLine.class);
            getNewDLQuerry.setParameter("title", drillingLine.getText());

            var newDrillingLineAttached = getNewDLQuerry.list().get(0);
            transaction.commit();

            createElement(newDrillingLineAttached);
        }
        drillingLine.clear();
    }

    @FXML
    void initialize() {

        drillingLine.textProperty().addListener((observableValue, oldVal, newVal) -> {
            if (newVal.isBlank() || newVal.isEmpty())
                btnAddLine.setDisable(true);
            else
                btnAddLine.setDisable(false);
        });
        try (var session = HibernateSessionFactory.getSession()) {
            session.beginTransaction();
            session
                    .createQuery("from DrillingLine", DrillingLine.class)
                    .list()
                    .forEach(this::createElement);
        }

        printing.setOnAction(actionEvent -> {
            Main main = new Main();
            try {
                Thread thread = new Thread(new SaveData());
                thread.start();
                main.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        listView.setCellFactory((a) -> new CellContoller());

        listView.setItems(leftTabsList);

        listView.getSelectionModel().selectedItemProperty().addListener((observableValue, oldVal, newVal) -> {
            String path = switch (newVal) {
                case Result -> "tabs/second.fxml";
                case Documentation -> "tabs/sample.fxml";
                case Table -> "tabs/third.fxml";
                case Akt -> "tabs/fourth_akt_1.fxml";
                case LastTable -> "tabs/fourth.fxml";
            };

            Parent newRoot;

            try {
                newRoot = FXMLLoader.load(
                        Objects.requireNonNull(
                                getClass().getResource(path)
                        )
                );

                contentPane.setContent(newRoot);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        listView.getSelectionModel().select(0);

    }


}
