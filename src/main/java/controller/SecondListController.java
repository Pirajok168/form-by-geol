package controller;

import java.net.URL;
import java.util.ResourceBundle;

import View.Model;
import View.Single;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class SecondListController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private VBox container;

    @FXML
    private TextField content;

    @FXML
    private BorderPane contentPane;

    @FXML
    private TextField dressing;

    @FXML
    private TextField dressing10;

    @FXML
    private TextField dressing11;

    @FXML
    private TextField dressing12;

    @FXML
    private TextField dressing13;

    @FXML
    private TextField dressing14;

    @FXML
    private TextField dressing15;

    @FXML
    private TextField dressing16;

    @FXML
    private TextField dressing17;

    @FXML
    private TextField dressing2;

    @FXML
    private TextField dressing3;

    @FXML
    private TextField dressing4;

    @FXML
    private TextField dressing5;

    @FXML
    private TextField dressing6;

    @FXML
    private TextField dressing7;

    @FXML
    private TextField dressing8;

    @FXML
    private TextField dressing9;

    @FXML
    private Pane firstList;

    @FXML
    private TextField h_сh;

    @FXML
    private TextField h_сh10;

    @FXML
    private TextField h_сh11;

    @FXML
    private TextField h_сh12;

    @FXML
    private TextField h_сh13;

    @FXML
    private TextField h_сh14;

    @FXML
    private TextField h_сh15;

    @FXML
    private TextField h_сh16;

    @FXML
    private TextField h_сh17;

    @FXML
    private TextField h_сh18;

    @FXML
    private TextField h_сh2;

    @FXML
    private TextField h_сh3;

    @FXML
    private TextField h_сh4;

    @FXML
    private TextField h_сh5;

    @FXML
    private TextField h_сh6;

    @FXML
    private TextField h_сh7;

    @FXML
    private TextField h_сh8;

    @FXML
    private TextField h_сh9;

    @FXML
    private TextField limit;

    @FXML
    private TextField probaAi;
    private Model model = Single.getInstance().getModelFirstList();

    public void setDataSecondList() {

        model.setDataSecondList( dressing.getText(),  dressing10.getText(),  dressing11.getText(),
                 dressing12.getText(),  dressing13.getText(),  dressing14.getText(),  dressing15.getText(),
                 dressing16.getText(),  dressing17.getText(),  dressing2.getText(),  dressing3.getText(),
                 dressing4.getText(),  dressing5.getText(),  dressing6.getText(),  dressing7.getText(),
                 dressing8.getText(),  dressing9.getText(),  h_сh.getText(),
                 h_сh10.getText(),  h_сh11.getText(),  h_сh12.getText(),  h_сh13.getText(),
                 h_сh14.getText(),  h_сh15.getText(),  h_сh16.getText(),  h_сh17.getText(),  h_сh18.getText(),
                 h_сh2.getText(),  h_сh3.getText(),  h_сh4.getText(),  h_сh5.getText(),  h_сh6.getText(),
                 h_сh7.getText(),  h_сh8.getText(),  h_сh9.getText(),  limit.getText(),  probaAi.getText());
    }
}
