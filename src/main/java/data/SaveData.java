package data;

import globals.Globals;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class SaveData implements Runnable{
    private List<String> list1 = Globals.getFirstList().getFirstListForSave();
    private List<String> list2 = Globals.getFirstList().getTableSave();
    private List<String> list3 = Globals.getFourthList().getSmallTable();
    private List<TableRow> list4 = Globals.getSecondList().getTableRows();
    private List<String> list5 = Globals.getFourthList().getSmallTableTwo();




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
