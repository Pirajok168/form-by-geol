import java.awt.print.PrinterException;
import java.io.IOException;
import java.util.Arrays;

import View.Model;
import View.Single;
import controller.FirstListController;
import controller.SecondListController;
import controller.ThirdController;
import data.SaveData;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.*;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import printing.Main;

public class MainController {


    @FXML
    private ScrollPane contentPane;
    @FXML
    private ListView<LeftTabs> listView;

    @FXML
    private MenuItem printing;




    private Model model = Single.getInstance().getModelFirstList();
    private FirstListController firstListController = new FirstListController();
    private SecondListController secondListController = new SecondListController();
    private ThirdController thirdController = new ThirdController();

    private ObservableList<LeftTabs> leftTabsList = FXCollections.observableArrayList(Arrays.asList(LeftTabs.Documentation
            , LeftTabs.Result, LeftTabs.Table, LeftTabs.LastTable, LeftTabs.Akt ));


    @FXML
    private TextField borehole;

    @FXML
    private Button btnAddBorehole;

    @FXML
    private Button btnAddLine;

    @FXML
    private TextField line;

    @FXML
    private Accordion listLines;


    @FXML
    void addLine(ActionEvent event) {
        ObservableList<String> books = FXCollections.observableArrayList();
        VBox content = new VBox();
        HBox content2 = new HBox();
        Button button = new Button("Добавить скважину");
        ListView<String> listBorehole = new ListView<>();
        listBorehole.minHeight(400);
        listBorehole.setItems(books);
        TextField textField = new TextField();

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                books.add(textField.getText());
            }
        });

        textField.setPromptText("Введите номер скважины");

        content2.setAlignment(Pos.CENTER);
        content2.getChildren().addAll(textField, button);
        content.getChildren().addAll(content2, listBorehole);


        TitledPane titledPane = new TitledPane();
        titledPane.setText(line.getText());
        titledPane.minHeight(400);
        titledPane.setContent(content);
        listLines.getPanes().add(titledPane);
    }




    @FXML
    void initialize(){
        printing.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Main main = new Main();
                try {
                    Thread thread = new Thread(new SaveData());
                    thread.start();
                    main.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        listView.setCellFactory((a)-> new CellContoller());

        listView.setItems(leftTabsList);

        listView.getSelectionModel().selectedItemProperty().addListener((observableValue, oldVal, newVal) -> {
            String path = "";

            switch (newVal){
                case Result:
                    path="tabs/second.fxml";
                    break;
                case Documentation:
                    path="tabs/sample.fxml";
                    break;
                case Table:
                    path="tabs/third.fxml";
                    break;
                case Akt:
                    path="tabs/fourth_akt_1.fxml";
                    break;
                case LastTable:
                    path="tabs/fourth.fxml";
                    break;
            }
            Parent newRoot = null;
            try {
                newRoot = FXMLLoader.load(getClass().getResource(path));
                contentPane.setContent(newRoot);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        listView.getSelectionModel().select(0);

    }




}
