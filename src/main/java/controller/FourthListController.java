package controller;

import java.net.URL;
import java.util.List;
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

        int i = 0;
        table1_1_0.setText(fourthList.getTable1_1_0());

        table1_1_1.setText(fourthList.getTable1_1_1());

        table1_1_2.setText(fourthList.getTable1_1_2());

        table1_2_0.setText(fourthList.getTable1_2_0());

        table1_2_1.setText(fourthList.getTable1_2_1());

        table1_2_2.setText(fourthList.getTable1_2_2());


        table2_1_0.setText(fourthList.getTable2_1_0());

        table2_1_1.setText(fourthList.getTable2_1_1());

        table2_1_2.setText(fourthList.getTable2_1_2());

        table2_1_3.setText(fourthList.getTable2_1_3());

        table2_1_4.setText(fourthList.getTable2_1_4());

        table2_2_0.setText(fourthList.getTable2_2_0());

        table2_2_1.setText(fourthList.getTable2_2_1());

        table2_2_2.setText(fourthList.getTable2_2_2());

        table2_2_3.setText(fourthList.getTable2_2_3());

        table2_2_4.setText(fourthList.getTable2_2_4());

        table2_3_0.setText(fourthList.getTable2_3_0());

        table2_3_1.setText(fourthList.getTable2_3_1());

        table2_3_2.setText(fourthList.getTable2_3_2());

        table2_3_3.setText(fourthList.getTable2_3_3());

        table2_3_4.setText(fourthList.getTable2_3_4());

        table2_4_0.setText(fourthList.getTable2_4_0());

        table2_4_1.setText(fourthList.getTable2_4_1());

        table2_4_2.setText(fourthList.getTable2_4_2());

        table2_4_3.setText(fourthList.getTable2_4_3());

        table2_4_4.setText(fourthList.getTable2_4_4());

        String value = table1_1_0.getText();
        fourthList.setTable1_1_0(value == null ? " " : value);
        value = table1_1_1.getText();
        fourthList.setTable1_1_1(value == null ? " " : value);
        value = table1_1_2.getText();
        fourthList.setTable1_1_2(value == null ? " " : value);
        value = table1_2_0.getText();
        fourthList.setTable1_2_0(value == null ? " " : value);
        value = table1_2_1.getText();
        fourthList.setTable1_2_1(value == null ? " " : value);
        value = table1_2_2.getText();
        fourthList.setTable1_2_2(value == null ? " " : value);
        value = table2_1_0.getText();
        fourthList.setTable2_1_0(value == null ? " " : value);
        value = table2_1_1.getText();
        fourthList.setTable2_1_1(value == null ? " " : value);
        value = table2_1_2.getText();
        fourthList.setTable2_1_2(value == null ? " " : value);
        value = table2_1_3.getText();
        fourthList.setTable2_1_3(value == null ? " " : value);
        value = table2_1_4.getText();
        fourthList.setTable2_1_4(value == null ? " " : value);
        value = table2_2_0.getText();
        fourthList.setTable2_2_0(value == null ? " " : value);
        value = table2_2_1.getText();
        fourthList.setTable2_2_1(value == null ? " " : value);
        value = table2_2_2.getText();
        fourthList.setTable2_2_2(value == null ? " " : value);
        value = table2_2_3.getText();
        fourthList.setTable2_2_3(value == null ? " " : value);
        value = table2_2_4.getText();
        fourthList.setTable2_2_4(value == null ? " " : value);
        value = table2_3_0.getText();
        fourthList.setTable2_3_0(value == null ? " " : value);
        value = table2_3_1.getText();
        fourthList.setTable2_3_1(value == null ? " " : value);
        value = table2_3_2.getText();
        fourthList.setTable2_3_2(value == null ? " " : value);
        value = table2_3_3.getText();
        fourthList.setTable2_3_3(value == null ? " " : value);
        value = table2_3_4.getText();
        fourthList.setTable2_3_4(value == null ? " " : value);
        value = table2_4_0.getText();
        fourthList.setTable2_4_0(value == null ? " " : value);
        value = table2_4_1.getText();
        fourthList.setTable2_4_1(value == null ? " " : value);
        value = table2_4_2.getText();
        fourthList.setTable2_4_2(value == null ? " " : value);
        value = table2_4_3.getText();
        fourthList.setTable2_4_3(value == null ? " " : value);
        value = table2_4_4.getText();
        fourthList.setTable2_4_4(value == null ? " " : value);
    }

    @FXML
    void initialize() {
        init();
        table1_1_0.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table1_1_0.getText();
            fourthList.setTable1_1_0(value == null ? " " : value);
        });

        table1_1_1.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table1_1_1.getText();
            fourthList.setTable1_1_1(value == null ? " " : value);
        });

        table1_1_2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table1_1_2.getText();
            fourthList.setTable1_1_2(value == null ? " " : value);
        });

        table1_2_0.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table1_2_0.getText();
            fourthList.setTable1_2_0(value == null ? " " : value);
        });

        table1_2_1.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table1_2_1.getText();
            fourthList.setTable1_2_1(value == null ? " " : value);
        });

        table1_2_2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table1_2_2.getText();
            fourthList.setTable1_2_2(value == null ? " " : value);
        });

        table2_1_0.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_1_0.getText();
            fourthList.setTable2_1_0(value == null ? " " : value);
        });

        table2_1_1.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_1_1.getText();
            fourthList.setTable2_1_1(value == null ? " " : value);
        });

        table2_1_2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_1_2.getText();
            fourthList.setTable2_1_2(value == null ? " " : value);
        });

        table2_1_3.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_1_3.getText();
            fourthList.setTable2_1_3(value == null ? " " : value);
        });

        table2_1_4.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_1_4.getText();
            fourthList.setTable2_1_4(value == null ? " " : value);
        });

        table2_2_0.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_2_0.getText();
            fourthList.setTable2_2_0(value == null ? " " : value);
        });

        table2_2_1.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_2_1.getText();
            fourthList.setTable2_2_1(value == null ? " " : value);
        });

        table2_2_2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_2_2.getText();
            fourthList.setTable2_2_2(value == null ? " " : value);
        });

        table2_2_3.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_2_3.getText();
            fourthList.setTable2_2_3(value == null ? " " : value);
        });

        table2_2_4.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_2_4.getText();
            fourthList.setTable2_2_4(value == null ? " " : value);
        });

        table2_3_0.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_3_0.getText();
            fourthList.setTable2_3_0(value == null ? " " : value);
        });

        table2_3_1.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_3_1.getText();
            fourthList.setTable2_3_1(value == null ? " " : value);
        });

        table2_3_2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_3_2.getText();
            fourthList.setTable2_3_2(value == null ? " " : value);
        });

        table2_3_3.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_3_3.getText();
            fourthList.setTable2_3_3(value == null ? " " : value);
        });

        table2_3_4.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_3_4.getText();
            fourthList.setTable2_3_4(value == null ? " " : value);
        });

        table2_4_0.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_4_0.getText();
            fourthList.setTable2_4_0(value == null ? " " : value);
        });

        table2_4_1.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_4_1.getText();
            fourthList.setTable2_4_1(value == null ? " " : value);
        });

        table2_4_2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_4_2.getText();
            fourthList.setTable2_4_2(value == null ? " " : value);
        });

        table2_4_3.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_4_3.getText();
            fourthList.setTable2_4_3(value == null ? " " : value);
        });

        table2_4_4.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = table2_4_4.getText();
            fourthList.setTable2_4_4(value == null ? " " : value);
        });
    }

}
