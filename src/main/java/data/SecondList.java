package data;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class SecondList {
    private ArrayList<TableRow> tableRows = new ArrayList<>();

    public ArrayList<TableRow> getTableRows() {
        return tableRows;
    }

    public void addItemRow(TableRow row){
        tableRows.add(row);
    }


    private String data;
    private String geolog;
    private String line;
    private String well;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getGeolog() {
        return geolog;
    }

    public void setGeolog(String geolog) {
        this.geolog = geolog;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getWell() {
        return well;
    }

    public void setWell(String well) {
        this.well = well;
    }
}
