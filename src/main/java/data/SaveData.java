package data;

import View.Single;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SaveData implements Runnable{
    private List<String> list1 = Single.getFirstList().getFirstListForSave();
    private List<String> list2 = Single.getFirstList().getTableSave();
    private List<String> list3 = Single.getFourthList().getSmallTable();
    private List<TableRow> list4 = Single.getSecondList().getTableRows();
    private List<String> list5 = Single.getFourthList().getSmallTableTwo();




    @Override
    public void run() {
        try {
            Path path = Path.of("temp.txt");

            BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.TRUNCATE_EXISTING);
            for (String value : list1){
                writer.write(value + "\n");
            }
            writer.close();

            path = Path.of("temp2.txt");
            writer = Files.newBufferedWriter(path, StandardOpenOption.TRUNCATE_EXISTING);
            for (String value : list2){
                writer.write(value + "\n");
            }
            writer.close();

            path = Path.of("temp3.txt");
            writer = Files.newBufferedWriter(path, StandardOpenOption.TRUNCATE_EXISTING);
            for (TableRow value : list4){
                String val = value.toString();
                writer.write(value + "\n");
            }
            writer.close();

            path = Path.of("temp4.txt");
            writer = Files.newBufferedWriter(path, StandardOpenOption.TRUNCATE_EXISTING);
            for (String value : list3){
                value = value.replace("\n","\\n");
                writer.write(value + "\n");
            }
            writer.close();

            path = Path.of("temp5.txt");
            writer = Files.newBufferedWriter(path, StandardOpenOption.TRUNCATE_EXISTING);
            for (String value : list5){
                value = value.replace("\n","\\n");
                writer.write(value + "\n");
            }
            writer.close();





        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
