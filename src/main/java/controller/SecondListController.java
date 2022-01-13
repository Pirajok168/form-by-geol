package controller;

import java.net.URL;
import java.util.ResourceBundle;

import View.Model;
import View.Single;
import data.FirstList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class SecondListController {



    @FXML
    private TextField content;

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
    private TextField dressing18;

    @FXML
    private TextField probaAi;
    private Model model = Single.getInstance().getModelFirstList();
    private FirstList firstList = Single.getInstance().getFirstList();



    private void initModel(){
        String value = "";
        value = probaAi.getText();
        firstList.setProbaAi(value == null ? "" : value);
        value = content.getText();
        firstList.setContent(value == null ? "" : value);
        value = dressing.getText();
        firstList.setDressing(value == null ? "" : value);
        value = h_сh.getText();
        firstList.setH_сh(value == null ? "" : value);
        value = dressing2.getText();
        firstList.setDressing2(value == null ? "" : value);
        value = h_сh2.getText();
        firstList.setH_сh2(value == null ? "" : value);
        value = dressing3.getText();
        firstList.setDressing3(value == null ? "" : value);
        value = h_сh3.getText();
        firstList.setH_сh3(value == null ? "" : value);
        value = dressing4.getText();
        firstList.setDressing4(value == null ? "" : value);
        value = h_сh4.getText();
        firstList.setH_сh4(value == null ? "" : value);
        value = dressing5.getText();
        firstList.setDressing5(value == null ? "" : value);
        value = h_сh5.getText();
        firstList.setH_сh5(value == null ? "" : value);
        value = dressing6.getText();
        firstList.setDressing6(value == null ? "" : value);
         value = h_сh6.getText();
        firstList.setH_сh6(value == null ? "" : value);
         value = dressing7.getText();
        firstList.setDressing7(value == null ? "" : value);
         value = h_сh7.getText();
        firstList.setH_сh7(value == null ? "" : value);
         value = dressing8.getText();
        firstList.setDressing8(value == null ? "" : value);
         value = h_сh8.getText();
        firstList.setH_сh8(value == null ? "" : value);
         value = dressing9.getText();
        firstList.setDressing9(value == null ? "" : value);
         value = h_сh9.getText();
        firstList.setH_сh9(value == null ? "" : value);
         value = dressing10.getText();
        firstList.setDressing10(value == null ? "" : value);
         value = h_сh10.getText();
        firstList.setH_сh10(value == null ? "" : value);
         value = dressing11.getText();
        firstList.setDressing11(value == null ? "" : value);
         value = h_сh11.getText();
        firstList.setH_сh11(value == null ? "" : value);
         value = dressing12.getText();
        firstList.setDressing12(value == null ? "" : value);
         value = h_сh12.getText();
        firstList.setH_сh12(value == null ? "" : value);
         value = dressing13.getText();
        firstList.setDressing13(value == null ? "" : value);
         value = h_сh13.getText();
        firstList.setH_сh13(value == null ? "" : value);
         value = dressing14.getText();
        firstList.setDressing14(value == null ? "" : value);
         value = h_сh14.getText();
        firstList.setH_сh14(value == null ? "" : value);
         value = dressing15.getText();
        firstList.setDressing15(value == null ? "" : value);
         value = h_сh15.getText();
        firstList.setH_сh15(value == null ? "" : value);
         value = limit.getText();
        firstList.setLimit(value == null ? "" : value);
         value = dressing16.getText();
        firstList.setDressing16(value == null ? "" : value);
         value = h_сh16.getText();
        firstList.setH_сh16(value == null ? "" : value);
         value = dressing17.getText();
        firstList.setDressing17(value == null ? "" : value);
         value = h_сh17.getText();
        firstList.setH_сh17(value == null ? "" : value);
         value = dressing18.getText();
        firstList.setDressing18(value == null ? "" : value);
         value = h_сh18.getText();
        firstList.setH_сh18(value == null ? "" : value);
    }



    @FXML
    void initialize(){
        initModel();
        probaAi.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = probaAi.getText();
            firstList.setProbaAi(value == null ? "" : value);
        });

        content.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = content.getText();
            firstList.setContent(value == null ? "" : value);
        });

        dressing.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = dressing.getText();
            firstList.setDressing(value == null ? "" : value);
        });

        h_сh.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = h_сh.getText();
            firstList.setH_сh(value == null ? "" : value);
        });

        dressing2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = dressing2.getText();
            firstList.setDressing2(value == null ? "" : value);
        });

        h_сh2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = h_сh2.getText();
            firstList.setH_сh2(value == null ? "" : value);
        });

        dressing3.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = dressing3.getText();
            firstList.setDressing3(value == null ? "" : value);
        });

        h_сh3.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = h_сh3.getText();
            firstList.setH_сh3(value == null ? "" : value);
        });

        dressing4.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = dressing4.getText();
            firstList.setDressing4(value == null ? "" : value);
        });

        h_сh4.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = h_сh4.getText();
            firstList.setH_сh4(value == null ? "" : value);
        });

        dressing5.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = dressing5.getText();
            firstList.setDressing5(value == null ? "" : value);
        });

        h_сh5.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = h_сh5.getText();
            firstList.setH_сh5(value == null ? "" : value);
        });

        dressing6.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = dressing6.getText();
            firstList.setDressing6(value == null ? "" : value);
        });

        h_сh6.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = h_сh6.getText();
            firstList.setH_сh6(value == null ? "" : value);
        });

        dressing7.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = dressing7.getText();
            firstList.setDressing7(value == null ? "" : value);
        });

        h_сh7.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = h_сh7.getText();
            firstList.setH_сh7(value == null ? "" : value);
        });

        dressing8.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = dressing8.getText();
            firstList.setDressing8(value == null ? "" : value);
        });

        h_сh8.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = h_сh8.getText();
            firstList.setH_сh8(value == null ? "" : value);
        });

        dressing9.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = dressing9.getText();
            firstList.setDressing9(value == null ? "" : value);
        });

        h_сh9.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = h_сh9.getText();
            firstList.setH_сh9(value == null ? "" : value);
        });

        dressing10.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = dressing10.getText();
            firstList.setDressing10(value == null ? "" : value);
        });

        h_сh10.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = h_сh10.getText();
            firstList.setH_сh10(value == null ? "" : value);
        });

        dressing11.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = dressing11.getText();
            firstList.setDressing11(value == null ? "" : value);
        });

        h_сh11.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = h_сh11.getText();
            firstList.setH_сh11(value == null ? "" : value);
        });

        dressing12.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = dressing12.getText();
            firstList.setDressing12(value == null ? "" : value);
        });

        h_сh12.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = h_сh12.getText();
            firstList.setH_сh12(value == null ? "" : value);
        });

        dressing13.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = dressing13.getText();
            firstList.setDressing13(value == null ? "" : value);
        });

        h_сh13.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = h_сh13.getText();
            firstList.setH_сh13(value == null ? "" : value);
        });

        dressing14.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = dressing14.getText();
            firstList.setDressing14(value == null ? "" : value);
        });

        h_сh14.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = h_сh14.getText();
            firstList.setH_сh14(value == null ? "" : value);
        });

        dressing15.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = dressing15.getText();
            firstList.setDressing15(value == null ? "" : value);
        });

        h_сh15.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = h_сh15.getText();
            firstList.setH_сh15(value == null ? "" : value);
        });

        limit.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = limit.getText();
            firstList.setLimit(value == null ? "" : value);
        });

        dressing16.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = dressing16.getText();
            firstList.setDressing16(value == null ? "" : value);
        });

        h_сh16.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = h_сh16.getText();
            firstList.setH_сh16(value == null ? "" : value);
        });

        dressing17.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = dressing17.getText();
            firstList.setDressing17(value == null ? "" : value);
        });

        h_сh17.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = h_сh17.getText();
            firstList.setH_сh17(value == null ? "" : value);
        });

        dressing18.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = dressing18.getText();
            firstList.setDressing18(value == null ? "" : value);
        });

        h_сh18.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = h_сh18.getText();
            firstList.setH_сh18(value == null ? "" : value);
        });


    }
}
