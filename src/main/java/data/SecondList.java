package data;

import java.util.ArrayList;

public class SecondList {
    private ArrayList<TableRow> tableRows = new ArrayList<>();

    public ArrayList<TableRow> getTableRows() {
        return tableRows;
    }

    public void addItemRow(TableRow row){
        tableRows.add(row);
    }

}
