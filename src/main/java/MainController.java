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
import javafx.scene.control.*;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
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
    void initialize(){
        printing.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Main main = new Main();
                try {
                    Thread thread = new Thread(new SaveData());
                    thread.start();
                    main.printList();
                } catch (PrinterException e) {
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
