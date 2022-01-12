import java.awt.print.PrinterException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import View.ModelFirstList;
import View.Single;
import controller.Second;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;

import printing.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class MainController {


    @FXML
    private ScrollPane contentPane;



    private ModelFirstList modelFirstList = Single.getInstance().getModelFirstList();

    private ObservableList<LeftTabs> leftTabsList = FXCollections.observableArrayList(Arrays.asList(LeftTabs.Documentation, LeftTabs.Result, LeftTabs.Table ));

    @FXML
    private ListView<LeftTabs> listView;

    @FXML
    void onClickToSecondList(MouseEvent event) throws IOException {
        Parent newRoot = FXMLLoader.load(getClass().getResource("second.fxml"));
        //container.getScene().setRoot(newRoot);
        contentPane.setContent(newRoot);
    }



    @FXML
    void initialize(){
        

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
