package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Second {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    Parent root2;
    @FXML
    private AnchorPane listTwo;
    @FXML
    private VBox container;

    @FXML
    private BorderPane contentPane;

    public Parent get(){
        return root2;
    }




    @FXML
    void onClickToFirstList(MouseEvent event) throws IOException {
        Parent newRoot = FXMLLoader.load(getClass().getResource("main.fxml"));
        //container.getScene().setRoot(newRoot);
        contentPane.setCenter(newRoot);
    }

    @FXML
    void initialize() {

    }

}
