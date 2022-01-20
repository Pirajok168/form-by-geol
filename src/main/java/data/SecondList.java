package data;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SecondList {
    private ArrayList<TableRow> tableRows = new ArrayList<>();

    public ArrayList<TableRow> getTableRows() {
        return tableRows;
    }

    public void addItemRow(TableRow row){
        tableRows.add(row);
    }

    public SecondList(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader("temp3.txt"));

                    while ((line = bufferedReader.readLine()) != null ){
                        TableRow tableRow = new TableRow();
                        String strs[] = line.split("&");
                        tableRow.set_1(strs[0].replace("\\n", "\n"));
                        tableRow.set_2(strs[1].replace("\\n", "\n"));
                        tableRow.set_3(strs[2].replace("\\n", "\n"));
                        tableRow.set_4(strs[3].replace("\\n", "\n"));
                        tableRow.set_5(strs[4].replace("\\n", "\n"));
                        tableRow.set_6(strs[5].replace("\\n", "\n"));
                        tableRow.set_7(strs[6].replace("\\n", "\n"));
                        tableRow.set_8(strs[7].replace("\\n", "\n"));
                        tableRow.set_9(strs[8].replace("\\n", "\n"));
                        tableRow.set_10(strs[9].replace("\\n", "\n"));
                        tableRow.set_11(strs[10].replace("\\n", "\n"));
                        tableRow.set_12(strs[11].replace("\\n", "\n"));
                        tableRow.set_13(strs[12].replace("\\n", "\n"));
                        tableRow.set_14(strs[13].replace("\\n", "\n"));
                        tableRow.set_15(strs[14].replace("\\n", "\n"));
                        tableRow.set_16(strs[15].replace("\\n", "\n"));
                        tableRow.set_17(strs[16].replace("\\n", "\n"));
                        tableRow.set_18(strs[17].replace("\\n", "\n"));

                        tableRows.add(tableRow);
                    }
                    bufferedReader.close();
                } catch (IOException e){
                    e.printStackTrace();
                }


            }
        });
        thread.start();
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
