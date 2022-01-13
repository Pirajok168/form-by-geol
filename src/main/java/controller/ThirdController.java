package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import View.Single;
import data.SecondList;
import data.TableRow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class ThirdController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea _1;

    @FXML
    private TextArea _10;

    @FXML
    private TextArea _11;

    @FXML
    private TextArea _12;

    @FXML
    private TextArea _13;

    @FXML
    private TextArea _14;

    @FXML
    private TextArea _15;

    @FXML
    private TextArea _16;

    @FXML
    private TextArea _17;

    @FXML
    private TextArea _2;

    @FXML
    private TextArea _3;

    @FXML
    private TextArea _4;

    @FXML
    private TextArea _5;

    @FXML
    private TextArea _6;

    @FXML
    private TextArea _7;

    @FXML
    private TextArea _8;

    @FXML
    private TextArea _9;

    @FXML
    private VBox container;

    @FXML
    private ScrollPane contentPane;

    @FXML
    private Pane firstList;

    @FXML
    private GridPane table;

    private SecondList secondList = Single.getSecondList();

    private int row = 0;

    private List<TextArea> list;

    @FXML
    void addRow(ActionEvent event) {
        TableRow tableRow = new TableRow(row,  _1.getText(),  _2.getText(),  _3.getText(),  _4.getText(),  _5.getText(),  _6.getText(),
                 _7.getText(),  _8.getText(),  _9.getText(),  _10.getText(),  _11.getText(),  _12.getText(),  _13.getText(),
                 _14.getText(),  _15.getText(),  _16.getText(),  _17.getText()
        );
        secondList.addItemRow(tableRow);
        for (int i = 0; i < 17; i++) {
            TextArea textArea = new TextArea();
            String str =list.get(i).getText();
            textArea.setText(str);
            textArea.setEditable(false);
            table.add(textArea ,i ,row);
        }
        row++;
    }

    private List<String> transformationToString(TableRow item){
        List<String> list = new ArrayList<>(Arrays.asList(item.get_1(), item.get_2(),item.get_3(),item.get_4(),item.get_5()
                ,item.get_6(),item.get_7(),item.get_8(),item.get_9(),item.get_10(),item.get_11(),item.get_12(),item.get_13()
                ,item.get_14(),item.get_15(),item.get_16(),item.get_17()));
        return list;
    }

    private void downloadRow(){
       List<TableRow> rows = secondList.getTableRows();

       if (rows.size() == 0){
           return;
       }
        for (int i = 0; i < rows.size(); i++) {
            List<String> items = transformationToString(rows.get(i));
            for (int j = 0; j < 17; j++) {
                TextArea textArea = new TextArea();
                String str =items.get(j);
                textArea.setText(str);
                textArea.setEditable(false);
                table.add(textArea ,j ,row);
            }
            row++;
        }
        System.out.println("2");
    }

    @FXML
    void initialize() {
        list = new ArrayList<>(Arrays.asList(_1,_2 ,_3
                ,_4,_5,_6,_7,_8,_9,_10
                ,_11,_12,_13,_14,_15,_16,_17));

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                downloadRow();
            }
        });
        thread.start();
        System.out.println("1");
    }

}
