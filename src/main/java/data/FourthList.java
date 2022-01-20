package data;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourthList {
    private String table1_1_0;
    private String table1_1_1;
    private String table1_1_2;
    private String table1_2_0;
    private String table1_2_1;
    private String table1_2_2;
    private String table2_1_0;
    private String table2_1_1;
    private String table2_1_2;
    private String table2_1_3;
    private String table2_1_4;
    private String table2_2_0;
    private String table2_2_1;
    private String table2_2_2;
    private String table2_2_3;
    private String table2_2_4;
    private String table2_3_0;
    private String table2_3_1;
    private String table2_3_2;
    private String table2_3_3;
    private String table2_3_4;
    private String table2_4_0;
    private String table2_4_1;
    private String table2_4_2;
    private String table2_4_3;
    private String table2_4_4;


    private String akt1;
    private String akt2;
    private String day;
    private String day2;
    private String depth;
    private String depth2;
    private String driller;
    private String driller2;
    private String geolog;
    private String geolog2;
    private String master;
    private String master2;
    private String month;
    private String month2;
    private String numberAkt;
    private String numberAkt2;
    private String year;
    private String year2;


    public String getAkt1() {
        return akt1;
    }

    public String getAkt2() {
        return akt2;
    }

    public String getDay() {
        return day;
    }

    public String getDay2() {
        return day2;
    }

    public String getDepth() {
        return depth;
    }

    public String getDepth2() {
        return depth2;
    }

    public String getDriller() {
        return driller;
    }

    public String getDriller2() {
        return driller2;
    }

    public String getGeolog() {
        return geolog;
    }

    public String getGeolog2() {
        return geolog2;
    }

    public String getMaster() {
        return master;
    }

    public String getMaster2() {
        return master2;
    }

    public String getMonth() {
        return month;
    }

    public String getMonth2() {
        return month2;
    }

    public String getNumberAkt() {
        return numberAkt;
    }

    public String getNumberAkt2() {
        return numberAkt2;
    }

    public String getYear() {
        return year;
    }

    public String getYear2() {
        return year2;
    }

    public void setAkt1(String akt1) {
        this.akt1 = akt1;
    }

    public void setAkt2(String akt2) {
        this.akt2 = akt2;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setDay2(String day2) {
        this.day2 = day2;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public void setDepth2(String depth2) {
        this.depth2 = depth2;
    }

    public void setDriller(String driller) {
        this.driller = driller;
    }

    public void setDriller2(String driller2) {
        this.driller2 = driller2;
    }

    public void setGeolog(String geolog) {
        this.geolog = geolog;
    }

    public void setGeolog2(String geolog2) {
        this.geolog2 = geolog2;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public void setMaster2(String master2) {
        this.master2 = master2;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setMonth2(String month2) {
        this.month2 = month2;
    }

    public void setNumberAkt(String numberAkt) {
        this.numberAkt = numberAkt;
    }

    public void setNumberAkt2(String numberAkt2) {
        this.numberAkt2 = numberAkt2;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setYear2(String year2) {
        this.year2 = year2;
    }

    public String getTable1_1_0() {
        return table1_1_0;
    }

    public String getTable1_1_1() {
        return table1_1_1;
    }

    public String getTable1_1_2() {
        return table1_1_2;
    }

    public String getTable1_2_0() {
        return table1_2_0;
    }

    public String getTable1_2_1() {
        return table1_2_1;
    }

    public String getTable1_2_2() {
        return table1_2_2;
    }

    public String getTable2_1_0() {
        return table2_1_0;
    }

    public String getTable2_1_1() {
        return table2_1_1;
    }

    public String getTable2_1_2() {
        return table2_1_2;
    }

    public String getTable2_1_3() {
        return table2_1_3;
    }

    public String getTable2_1_4() {
        return table2_1_4;
    }

    public String getTable2_2_0() {
        return table2_2_0;
    }

    public String getTable2_2_1() {
        return table2_2_1;
    }

    public String getTable2_2_2() {
        return table2_2_2;
    }

    public String getTable2_2_3() {
        return table2_2_3;
    }

    public String getTable2_2_4() {
        return table2_2_4;
    }

    public String getTable2_3_0() {
        return table2_3_0;
    }

    public String getTable2_3_1() {
        return table2_3_1;
    }

    public String getTable2_3_2() {
        return table2_3_2;
    }

    public String getTable2_3_3() {
        return table2_3_3;
    }

    public String getTable2_3_4() {
        return table2_3_4;
    }

    public String getTable2_4_0() {
        return table2_4_0;
    }

    public String getTable2_4_1() {
        return table2_4_1;
    }

    public String getTable2_4_2() {
        return table2_4_2;
    }

    public String getTable2_4_3() {
        return table2_4_3;
    }

    public String getTable2_4_4() {
        return table2_4_4;
    }


    public List<String> downloadData3 = new ArrayList<>();
    public FourthList(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String line;
                    BufferedReader bufferedReader = new BufferedReader(new FileReader("temp4.txt"));
                    line = bufferedReader.readLine();
                    table1_1_0=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table1_1_1=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table1_1_2=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table1_2_0=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table1_2_1=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table1_2_2=line.replace("\\n", "\n");
                    bufferedReader.close();



                    bufferedReader = new BufferedReader(new FileReader("temp5.txt"));
                    line = bufferedReader.readLine();
                    table2_1_0=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table2_1_1=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table2_1_2=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table2_1_3=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table2_1_4=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table2_2_0=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table2_2_1=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table2_2_2=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table2_2_3=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table2_2_4=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table2_3_0=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table2_3_1=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table2_3_2=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table2_3_3=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table2_3_4=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table2_4_0=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table2_4_1=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table2_4_2=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table2_4_3=line.replace("\\n", "\n");
                    line = bufferedReader.readLine();
                    table2_4_4=line.replace("\\n", "\n");
                    bufferedReader.close();

                    bufferedReader = new BufferedReader(new FileReader("temp6.txt"));

                    line = bufferedReader.readLine();
                    year=line;
                    line = bufferedReader.readLine();
                    month=line;
                    line = bufferedReader.readLine();
                    day=line;
                    line = bufferedReader.readLine();
                    numberAkt=line;
                    line = bufferedReader.readLine();
                    depth=line;
                    line = bufferedReader.readLine();
                    akt1=line.replace("\\n", "\n");;
                    line = bufferedReader.readLine();
                    geolog=line;
                    line = bufferedReader.readLine();
                    driller=line;
                    line = bufferedReader.readLine();
                    master=line;
                    line = bufferedReader.readLine();
                    year2=line;
                    line = bufferedReader.readLine();
                    month2=line;
                    line = bufferedReader.readLine();
                    day2=line;
                    line = bufferedReader.readLine();
                    numberAkt2=line;
                    line = bufferedReader.readLine();
                    depth2=line;
                    line = bufferedReader.readLine();
                    akt2=line.replace("\\n", "\n");;
                    line = bufferedReader.readLine();
                    geolog2=line;
                    line = bufferedReader.readLine();
                    driller2=line;
                    line = bufferedReader.readLine();
                    master2=line;
                    bufferedReader.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }

    public List<String> getSmallTable(){
        List<String> list = new ArrayList<>(Arrays.asList(table1_1_0, table1_1_1, table1_1_2, table1_2_0, table1_2_1, table1_2_2));
        return list;
    }

    public List<String> getSmallTableTwo(){
        List<String> list = new ArrayList<>(Arrays.asList(
            table2_1_0,
            table2_1_1,
            table2_1_2,
            table2_1_3,
            table2_1_4,
            table2_2_0,
            table2_2_1,
            table2_2_2,
            table2_2_3,
            table2_2_4,
            table2_3_0,
            table2_3_1,
            table2_3_2,
            table2_3_3,
            table2_3_4,
            table2_4_0,
            table2_4_1,
            table2_4_2,
            table2_4_3,
            table2_4_4
        ));
        return list;
    }




    public void setTable1_1_0(String table1_1_0) {
        this.table1_1_0 = table1_1_0;
    }

    public void setTable1_1_1(String table1_1_1) {
        this.table1_1_1 = table1_1_1;
    }

    public void setTable1_1_2(String table1_1_2) {
        this.table1_1_2 = table1_1_2;
    }

    public void setTable1_2_0(String table1_2_0) {
        this.table1_2_0 = table1_2_0;
    }

    public void setTable1_2_1(String table1_2_1) {
        this.table1_2_1 = table1_2_1;
    }

    public void setTable1_2_2(String table1_2_2) {
        this.table1_2_2 = table1_2_2;
    }

    public void setTable2_1_0(String table2_1_0) {
        this.table2_1_0 = table2_1_0;
    }

    public void setTable2_1_1(String table2_1_1) {
        this.table2_1_1 = table2_1_1;
    }

    public void setTable2_1_2(String table2_1_2) {
        this.table2_1_2 = table2_1_2;
    }

    public void setTable2_1_3(String table2_1_3) {
        this.table2_1_3 = table2_1_3;
    }

    public void setTable2_1_4(String table2_1_4) {
        this.table2_1_4 = table2_1_4;
    }

    public void setTable2_2_0(String table2_2_0) {
        this.table2_2_0 = table2_2_0;
    }

    public void setTable2_2_1(String table2_2_1) {
        this.table2_2_1 = table2_2_1;
    }

    public void setTable2_2_2(String table2_2_2) {
        this.table2_2_2 = table2_2_2;
    }

    public void setTable2_2_3(String table2_2_3) {
        this.table2_2_3 = table2_2_3;
    }

    public void setTable2_2_4(String table2_2_4) {
        this.table2_2_4 = table2_2_4;
    }

    public void setTable2_3_0(String table2_3_0) {
        this.table2_3_0 = table2_3_0;
    }

    public void setTable2_3_1(String table2_3_1) {
        this.table2_3_1 = table2_3_1;
    }

    public void setTable2_3_2(String table2_3_2) {
        this.table2_3_2 = table2_3_2;
    }

    public void setTable2_3_3(String table2_3_3) {
        this.table2_3_3 = table2_3_3;
    }

    public void setTable2_3_4(String table2_3_4) {
        this.table2_3_4 = table2_3_4;
    }

    public void setTable2_4_0(String table2_4_0) {
        this.table2_4_0 = table2_4_0;
    }

    public void setTable2_4_1(String table2_4_1) {
        this.table2_4_1 = table2_4_1;
    }

    public void setTable2_4_2(String table2_4_2) {
        this.table2_4_2 = table2_4_2;
    }

    public void setTable2_4_3(String table2_4_3) {
        this.table2_4_3 = table2_4_3;
    }

    public void setTable2_4_4(String table2_4_4) {
        this.table2_4_4 = table2_4_4;
    }




}
