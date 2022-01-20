package controller;

import View.Single;
import data.SecondList;
import data.TableRow;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextArea;

import javax.swing.event.ChangeEvent;

import java.util.List;

public class FocusListener implements ChangeListener<Boolean>{

    private TextArea text;
    private int column;
    private int row;
    private List<TableRow> secondList = Single.getSecondList().getTableRows();

    public FocusListener(TextArea text, int column, int row){
        this.text = text;
        this.column = column;
        this.row = row;
    }

    @Override
    public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
        TableRow tableRow = secondList.get(row);
        switch (column){
            case 0 ->{
                tableRow.set_1(text.getText());
            }
            case 1 ->{
                tableRow.set_2(text.getText());
            }
            case 2 ->{
                tableRow.set_3(text.getText());
            }
            case 3 ->{
                tableRow.set_4(text.getText());
            }
            case 4 ->{
                tableRow.set_5(text.getText());
            }
            case 5 ->{
                tableRow.set_6(text.getText());
            }
            case 6 ->{
                tableRow.set_7(text.getText());
            }
            case 7 ->{
                tableRow.set_8(text.getText());
            }
            case 8 ->{
                tableRow.set_9(text.getText());
            }
            case 9 ->{
                tableRow.set_10(text.getText());
            }
            case 10 ->{
                tableRow.set_11(text.getText());
            }
            case 11 ->{
                tableRow.set_12(text.getText());
            }
            case 12 ->{
                tableRow.set_13(text.getText());
            }
            case 13 ->{
                tableRow.set_14(text.getText());
            }
            case 14 ->{
                tableRow.set_15(text.getText());
            }
            case 15 ->{
                tableRow.set_16(text.getText());
            }
            case 16 ->{
                tableRow.set_17(text.getText());
            }
            case 17 ->{
                tableRow.set_18(text.getText());
            }

        }

    }
}