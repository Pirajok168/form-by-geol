package controller;

import java.net.URL;
import java.util.ResourceBundle;

import View.Single;
import data.FourthList;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class FourthListController {


    @FXML
    private TextArea table1_1_0;

    @FXML
    private TextArea table1_1_1;

    @FXML
    private TextArea table1_1_2;

    @FXML
    private TextArea table1_2_0;

    @FXML
    private TextArea table1_2_1;

    @FXML
    private TextArea table1_2_2;

    @FXML
    private TextArea table2_1_0;

    @FXML
    private TextArea table2_1_1;

    @FXML
    private TextArea table2_1_2;

    @FXML
    private TextArea table2_1_3;

    @FXML
    private TextArea table2_1_4;

    @FXML
    private TextArea table2_2_0;

    @FXML
    private TextArea table2_2_1;

    @FXML
    private TextArea table2_2_2;

    @FXML
    private TextArea table2_2_3;

    @FXML
    private TextArea table2_2_4;

    @FXML
    private TextArea table2_3_0;

    @FXML
    private TextArea table2_3_1;

    @FXML
    private TextArea table2_3_2;

    @FXML
    private TextArea table2_3_3;

    @FXML
    private TextArea table2_3_4;

    @FXML
    private TextArea table2_4_0;

    @FXML
    private TextArea table2_4_1;

    @FXML
    private TextArea table2_4_2;

    @FXML
    private TextArea table2_4_3;

    @FXML
    private TextArea table2_4_4;

    private FourthList fourthList = Single.getFourthList();

    private void init(){

    }

    @FXML
    void initialize() {
        init();
        table1_1_0.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table1_1_0.getText();
            fourthList.setTable1_1_0(value == null ? "" : value);
        });

        table1_1_1.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table1_1_1.getText();
            fourthList.setTable1_1_1(value == null ? "" : value);
        });

        table1_1_2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table1_1_2.getText();
            fourthList.setTable1_1_2(value == null ? "" : value);
        });

        table1_2_0.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table1_2_0.getText();
            fourthList.setTable1_2_0(value == null ? "" : value);
        });

        table1_2_1.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table1_2_1.getText();
            fourthList.setTable1_2_1(value == null ? "" : value);
        });

        table1_2_2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table1_2_2.getText();
            fourthList.setTable1_2_2(value == null ? "" : value);
        });

        table2_1_0.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_1_0.getText();
            fourthList.setTable2_1_0(value == null ? "" : value);
        });

        table2_1_1.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_1_1.getText();
            fourthList.setTable2_1_1(value == null ? "" : value);
        });

        table2_1_2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_1_2.getText();
            fourthList.setTable2_1_2(value == null ? "" : value);
        });

        table2_1_3.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_1_3.getText();
            fourthList.setTable2_1_3(value == null ? "" : value);
        });

        table2_1_4.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_1_4.getText();
            fourthList.setTable2_1_4(value == null ? "" : value);
        });

        table2_2_0.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_2_0.getText();
            fourthList.setTable2_2_0(value == null ? "" : value);
        });

        table2_2_1.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_2_1.getText();
            fourthList.setTable2_2_1(value == null ? "" : value);
        });

        table2_2_2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_2_2.getText();
            fourthList.setTable2_2_2(value == null ? "" : value);
        });

        table2_2_3.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_2_3.getText();
            fourthList.setTable2_2_3(value == null ? "" : value);
        });

        table2_2_4.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_2_4.getText();
            fourthList.setTable2_2_4(value == null ? "" : value);
        });

        table2_3_0.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_3_0.getText();
            fourthList.setTable2_3_0(value == null ? "" : value);
        });

        table2_3_1.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_3_1.getText();
            fourthList.setTable2_3_1(value == null ? "" : value);
        });

        table2_3_2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_3_2.getText();
            fourthList.setTable2_3_2(value == null ? "" : value);
        });

        table2_3_3.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_3_3.getText();
            fourthList.setTable2_3_3(value == null ? "" : value);
        });

        table2_3_4.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_3_4.getText();
            fourthList.setTable2_3_4(value == null ? "" : value);
        });

        table2_4_0.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_4_0.getText();
            fourthList.setTable2_4_0(value == null ? "" : value);
        });

        table2_4_1.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_4_1.getText();
            fourthList.setTable2_4_1(value == null ? "" : value);
        });

        table2_4_2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_4_2.getText();
            fourthList.setTable2_4_2(value == null ? "" : value);
        });

        table2_4_3.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_4_3.getText();
            fourthList.setTable2_4_3(value == null ? "" : value);
        });

        table2_4_4.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_4_4.getText();
            fourthList.setTable2_4_4(value == null ? "" : value);
        });
    }

}
