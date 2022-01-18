package printing;

import View.Single;
import data.FirstList;
import data.FourthList;
import data.SecondList;
import data.TableRow;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.Size2DSyntax;
import javax.print.attribute.standard.MediaPrintableArea;
import javax.print.attribute.standard.MediaSize;
import javax.print.attribute.standard.MediaSizeName;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.*;
import java.util.List;



//15 12
public class Main {
    private  int linesPerPage = 20;
    private  List<String> data = new ArrayList<>();
    private  List<String> data2 = new ArrayList<>();
    private  FirstList firstList =  Single.getFirstList();
    private  FirstList table = Single.getFirstList();
    private SecondList secondList = Single.getSecondList();
    private FourthList fourthList = Single.getFourthList();

    private void init(){

        data.add("Долина реки#правого (левого) притока#в системе#");
        data.add("ручья");
        data.add("Тип россыпи (русловая, долинная, террасовая, увальная и др.)#");
        data.add("Линия № #");
        data.add("На расстоянии от устья#м, от линии №#(вниз, вверх)#м");
        data.add("Азимут буровой линии (магнитный, истинный)#");
        data.add("Скважина №#");
        data.add("Расположена на правой (левой) стороне от русла на расстоянии от него#м,");
        data.add("От скважины №#вправо (влево)#м#");
        data.add("Скважина начала#Окончена #");
        data.add("Высотная отметка устья скважины#, координаты: х-, у-#");
        data.add("Пройдено в мерзлоте от#до#, от#до#");
        data.add("Пройдено в талом грунте от#до#, от#до#");
        data.add("Общая глубина скважины#м, глубина обсада#м.");
        data.add("Состав пород плотика#, пройдено по ним#м");
        data.add("Скважина пройдена (добита), остановлена (недобита) на глубине#м.");
        data.add("Уровень воды в скважине (от поверхности): встречный#м, установившийся#м");
        data.add("Диаметр бурения на глубину#м#мм");
        data.add("Буровой станок#: промывка#лотком#");
        data.add("Геолог#, маркшейдер#");

        data2.add("Глубина выемки");
        data2.add("(мощность массы)");
        data2.add("Мощность торфов");
        data2.add("Мощность песков (пласта)");
        data2.add("Среднее содержание Au");
        data2.add("Вертикальный запас Au");
        data2.add("Лимитность по кондициям");
        String format = table.getLimit() + " года";
        data2.add(format);
    }
    private int countLine = 0;
    private int length2 = 10;
    private int cellCnt = 0;
    private int indent;
    private Map<TextAttribute, Integer> fontAttributes = new HashMap<TextAttribute, Integer>();


    private void replace(String str, int x, int y,Graphics2D g2d, PageFormat pageFormat, int flag ){

        fontAttributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        FontMetrics metrics = g2d.getFontMetrics(new Font("Times New Roman", Font.PLAIN, 12));
        String nS[] = str.split("#");
        List<String> list = firstList.getFirstList();
        for (int i = 0; i < nS.length; i++) {
            String n = "";
            switch (flag){
                case 0:
                    if (nS[i].equals("м")|| nS[i].equals("мм") || nS[i].equals("м.") || nS[i].equals("м,")){
                        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                        g2d.drawString(nS[i],  length2,  y);
                        break;
                    }
                    try {
                        n = list.get(countLine+1) + " ";
                        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                        g2d.drawString(nS[i],  length2,  y);

                        this.length2 += metrics.stringWidth(nS[i]);
                        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12).deriveFont(fontAttributes));
                        g2d.drawString(n ,  length2 + 2,  y);
                        this.length2 += metrics.stringWidth(n);
                        countLine++;
                    } catch (Exception e) {
                        System.out.println(nS[i]);
                    }
                    break;
                case 1:
                    if (nS[i].equals("м")|| nS[i].equals("мм") || nS[i].equals("м.") || nS[i].equals("м,")){
                        g2d.setFont(new Font("Times New Roman", Font.BOLD, 14));
                        g2d.drawString(nS[i],  length2,  y);
                        break;
                    }
                    try {
                        n = list.get(countLine+1) + " ";
                        g2d.setFont(new Font("Times New Roman", Font.BOLD, 14));
                        g2d.drawString(nS[i],  x,  y);
                        int length = nS[i].length() * 8;
                        g2d.setFont(new Font("Times New Roman", Font.BOLD, 14).deriveFont(fontAttributes));
                        g2d.drawString(n ,  length+x,  y);
                        countLine++;
                    } catch (Exception e) {
                        System.out.println(nS[i]);
                    }
                    break;
            }




        }
        length2 = 10;
    }

    private void replaceTable(int x, int y, Graphics2D g2d){
        List<String> list = table.getFirstListTable();
        int x2 = 220;
        int y2 = y;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                String val = list.get(cellCnt) +" ";
                g2d.drawString( val, x2, y2);
                x2 += 50;
                cellCnt++;
            }
            x2 = 220;
            y2 += 35;
        }
    }

    private List<String> transformationToString(TableRow item){
        List<String> list = new ArrayList<>(Arrays.asList(item.get_1(), item.get_2(),item.get_3(),item.get_4(),item.get_5()
                ,item.get_6(),item.get_7(),item.get_8(),item.get_9(),item.get_10(),item.get_11(),item.get_12(),item.get_13()
                ,item.get_14(),item.get_15(),item.get_16(),item.get_17(), item.get_18()));
        return list;
    }

    private void drawString(String value, int x, int y, Graphics2D g2d, SizeCells size, int countRow){
        FontMetrics metrics = g2d.getFontMetrics(new Font("Times New Roman", Font.PLAIN, size.getSizeTextCells()));
        int length = metrics.stringWidth(value);
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, size.getSizeTextCells()));
        String strs[] = value.split("\n| ");
        int i = 0;
        int _x = x-3;
        int _y = y-3;
        int maxLength = size.getSizeCells();
        for (int j = 0; j < countRow; j++) {
            int lengthRow = 0;
            do {
                if (i>=strs.length) break;
                String val = strs[i];
                lengthRow += 2;
                g2d.drawString(val, _x +lengthRow, _y);
                lengthRow += metrics.stringWidth(val);
                i++;
                if (i>=strs.length) break;
            }while (metrics.stringWidth(strs[i]) + lengthRow < maxLength);
            if (i>=strs.length) break;
            _y += size.defaultSize();
            lengthRow = _x;
        }
        indent = _y;
    }

    private void bigTable(int x, int y, Graphics2D g2d){
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        List<TableRow> rows = secondList.getTableRows();
        int x2 = x-30;
        int y2 = y+3;
        for (int i = 0; i < rows.size() ; i++) {
            List<String> items = transformationToString(rows.get(i));
            for (int j = 0; j < 7; j++) {
                if (j==0){
                    String val = items.get(j) + " ";
                    drawString(val, x2, y2, g2d, new BigTableCells(65),4);
                    //g2d.drawString(val, x2, y2);
                    x2+=65;
                }else if (j==1){
                    String val = items.get(j) + " ";
                    drawString(val, x2, y2, g2d, new BigTableCells(20),4);
                    //g2d.drawString(val, x2+2, y2);
                    x2 += 41;
                }else if(j==5){
                    String val = items.get(j) + " ";
                    drawString(val, x2, y2, g2d, new BigTableCells(220),4);
                    //g2d.drawString(val, x2, y2);
                    x2 += 220;
                    val = items.get(j+1) + " ";
                    drawString(val, x2, y2, g2d, new BigTableCells(110),4);
                    break;
                }else{
                    String val = items.get(j) + " ";
                    drawString(val, x2, y2, g2d, new BigTableCells(40),4);
                    //g2d.drawString(val, x2, y2);
                    x2+=41;
                }
            }
            y2+=21;
            x2 = x-30;
        }
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12));
    }

    private void bigTable2(int x, int y, Graphics2D g2d){

        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 8));
        List<TableRow> rows = secondList.getTableRows();
        int x2 = x;
        int y2 = y+85;
        for (int i = 0; i < rows.size() ; i++) {
            List<String> items = transformationToString(rows.get(i));
            for (int j = 7; j < 18; j++) {
                if (j==7){
                    String val = items.get(j) + " ";
                    drawString(val, x2, y2, g2d, new BigTableCells(30),4);
                    x2+=33;
                } else if(j==8) {
                    String val = items.get(j) + " ";
                    drawString(val, x2, y2, g2d, new BigTableCells(30),4);
                    x2+=30;
                }else  if(j==15){
                    String val = items.get(j) + " ";
                    drawString(val, x2, y2, g2d, new BigTableCells(100),4);
                    x2+=100;
                } else  if(j==16){
                    String val = items.get(j) + " ";
                    drawString(val, x2, y2, g2d, new BigTableCells(60),4);
                    x2+=60;
                    val = items.get(j+1) + " ";
                    drawString(val, x2, y2, g2d, new BigTableCells(80),4);
                }
                else {
                    String val = items.get(j) + " ";
                    drawString(val, x2, y2, g2d, new BigTableCells(40),4);
                    x2+=40;
                }

            }
            y2+=21;
            x2 = x;
        }
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 10));
    }

    private void smallTableOne(int x, int y, Graphics2D g2d){
        List<String> table = fourthList.getSmallTable();
        int _x = x;
        int _y = y+28;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                String val = table.get(j) + "1";
                drawString(val, _x, _y, g2d, new BigTableCells(180),4);
                _x += 183;
            }
            _y += 30;
            _x = x;
        }
    }

    private void smallTableTwo(int x, int y, Graphics2D g2d){
        List<String> table = fourthList.getSmallTableTwo();
        int _x = x+2;
        int _y = 215;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                String val = table.get(j) + "1";
                drawString(val, _x, _y, g2d, new BigTableCells(110),4);
                _x += 110;
            }
            _y += 30;
            _x = x+2;
        }
    }

    private void firstListPrint(Graphics g, PageFormat pageFormat, int pageIndex){
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        AffineTransform defaultAt = g2d.getTransform();
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        g2d.drawString("Участок "+ firstList.getFirstList().get(0) + " ", 10, 10);
        System.out.println( (int) pageFormat.getImageableWidth());
        System.out.println((int)pageFormat.getImageableHeight());
        g2d.setFont(new Font("Times New Roman", Font.BOLD, 14));

        g2d.drawString("ЖУРНАЛ",200,  30);
        g2d.drawString("ДОКУМЕНТАЦИИ СКВАЖИН",140,  50);

        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        int y = 70;
        for (int i = linesPerPage * pageIndex; i < data.size()
                && i < linesPerPage * (pageIndex + 1); i++) {
            //System.out.println(data.get(i) + " " + data.get(i).length());

            if (Objects.equals(data.get(i), "Линия № #")
                    ||  Objects.equals(data.get(i), "Скважина №#")){

                if(data.get(i).contains("#")){
                    replace(data.get(i), 200, y, g2d, pageFormat, 1);
                }else {
                    g2d.drawString(data.get(i),200,  y);
                }
                y += 23;
            }else{
                if(data.get(i).contains("#")){
                    replace(data.get(i), 10, y, g2d, pageFormat, 0);
                }else {
                    g2d.drawString(data.get(i),10,  y);
                }

                //g2d.drawString(data.get(i),10, y );
                y += 18;
            }
        }
        fontAttributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        g2d.drawString("Результаты подсчета по скважине", 140, y + 30);
        y = y + 40;
        g2d.drawLine(10, y,  (int)pageFormat.getImageableWidth(), y );
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        g2d.drawString("Проба Au ", 30, y+20);
        FontMetrics metrics = g2d.getFontMetrics(new Font("Times New Roman", Font.PLAIN, 10));
        int lenght = metrics.stringWidth("Проба Au");
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 10).deriveFont(fontAttributes));
        String val = table.getProbaAi() + " ";
        g2d.drawString(val,lenght+35, y+20);
        //"мг/м^2""
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        g2d.drawString("Борт. содержание Au x.ч ", 11, y+28);
        lenght =  metrics.stringWidth("Борт. содержание Au x.ч ");
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 10).deriveFont(fontAttributes));
        val =table.getContent() + " ";
        g2d.drawString(val, lenght+13, y+28);
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        g2d.drawString("Един", 180, y+28);
        g2d.drawString("Измер", 175, y+38);
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        g2d.drawLine(10, y,  10, (int)pageFormat.getImageableHeight()-12 );
        g2d.drawLine((int)pageFormat.getImageableWidth(), y,  (int)pageFormat.getImageableWidth(), (int)pageFormat.getImageableHeight()-12 );

        g2d.drawLine(10, y+35, 170, y+35);
        g2d.drawLine(210, y+35, (int)pageFormat.getImageableHeight()-12, y+35);
        g2d.drawString("Наименование показателей", 20, y+50);
        g2d.drawLine(10, y+35+25, (int)pageFormat.getImageableWidth(), y+35+25);
        g2d.drawString("м", 185, y+35+25+20);

        int y2 = y+35+25+35;
        g2d.drawString("м", 185, y2+20);
        g2d.drawString("м", 185, y2+55);
        g2d.drawString("м", 185, y2+55);
        g2d.drawString("мг/м?", 175, y2+90);
        g2d.drawString("мг/м?", 175, y2+125);
        int it = 0;
        for (int i = 0; i < 6; i++) {
            g2d.drawLine(10, y2, (int)pageFormat.getImageableWidth(), y2);
            g2d.drawString(data2.get(it), 30, y2-20);
            if (it==0 || it==6){
                it++;
                g2d.drawString(data2.get(it), 30, y2-10);
            }
            it++;
            y2 += 35;
        }

        int y3 =  y+35+15;
        g2d.drawLine(170, y, 170, (int)pageFormat.getImageableHeight()-12);

        g2d.drawLine(210, y, 210, (int)pageFormat.getImageableHeight()-12);

        g2d.drawString("Для раздельной", 220, y3-35);
        g2d.drawString("добычи (на ?)", 220, y3-20);
        g2d.drawString("шлих", 220, y3);
        replaceTable(210, y3+35, g2d);
        g2d.drawLine(260, y+35, 260, (int)pageFormat.getImageableHeight()-12);
        g2d.drawString("х.ч", 275, y3);
        g2d.drawLine(310, y, 310, (int)pageFormat.getImageableHeight()-12);
        g2d.drawString("Для сплошной", 320, y3-35);
        g2d.drawString("выемки (на массу)", 315, y3-20);
        g2d.drawString("шлих", 320, y3);
        g2d.drawLine(360, y+35, 360, (int)pageFormat.getImageableHeight()-12);
        g2d.drawString("х.ч", 375, y3);
        g2d.drawLine(410, y, 410, (int)pageFormat.getImageableHeight()-12);
        g2d.drawString("Для сплошной", 420, y3-35);
        g2d.drawString("выемки (на массу)", 420, y3-20);
        g2d.drawString("шлих", 420, y3);
        g2d.drawLine(460, y+35, 460, (int)pageFormat.getImageableHeight()-12);
        g2d.drawString("х.ч", 475, y3);
    }

    private void secondListPrint(Graphics g, PageFormat pageFormat, int pageIndex){
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        AffineTransform defaultAt = g2d.getTransform();
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        int start = 10;
        int retreat = 10;
        String format = "Геолог " + secondList.getGeolog();
        g2d.drawString(format, start, retreat);
        format = "Дата " + secondList.getData();
        g2d.drawString(format, 200, retreat);
        retreat += 15;
        format = "Линия № " + secondList.getLine() + " Скважина № " + secondList.getWell();
        g2d.drawString(format, start, retreat);
        retreat += 10;
        g2d.drawLine(start,  retreat, (int) pageFormat.getImageableWidth(), retreat);
        retreat = 95;
        g2d.drawLine(start,  retreat, (int) pageFormat.getImageableWidth(), retreat);
        retreat += 15;
        g2d.drawLine(start,  retreat, (int) pageFormat.getImageableWidth(), retreat);
        retreat += 21;
        for (int i = 0; i < 31; i++) {
            g2d.drawLine(start,  retreat, (int) pageFormat.getImageableWidth(), retreat);
            retreat += 21;
        }
        start += 70;
        int startC = start-35;
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 8));
        g2d.drawString("Месяц, число,", startC-30,50);
        g2d.drawString("смена, ", startC-30,60);
        g2d.drawString("бурильщик, ", startC-30,70);
        g2d.drawString("промывальщик, ", startC-30,80);
        g2d.drawString("геолог.", startC-30,90);

        g2d.drawString("Пройдено, м.", startC+40,50);
        g2d.drawString("от", startC+40,70);
        g2d.drawString("до", startC+80,70);

        g2d.drawString("Диаметр", startC+120, 50);
        g2d.drawString("бур-я мм", startC+120, 60);
        g2d.drawString("Длина", startC+120, 70);
        g2d.drawString("рейса. м", startC+120, 80);

        g2d.drawString("литологи-", startC + 160, 50);
        g2d.drawString("ческий", startC + 160, 60);
        g2d.drawString("разрез", startC + 160, 70);

        g2d.drawString("Описание разреза (название пород, цвет, зернистость)", startC + 200, 50);
        g2d.drawString("размеры, петрограф состав, <>, глинистость, ", startC + 200, 60);
        g2d.drawString("каменистость, льдистость, характеристика шлихов, ", startC + 200, 70);
        g2d.drawString("Отметка о мерзлоте, леденистости % галиках и водоносности", startC + 200, 80);
        g2d.drawString("уровень воды", startC + 200, 90);

        g2d.drawString("Категория пород по ", startC + 420, 50);
        g2d.drawString("буримости, % валунистости ", startC + 420, 60);

        bigTable(startC,40+65+10, g2d);
        for (int i = 0; i < 6; i++) {
            if (i==1){
                g2d.drawString(i+1 + "", startC, 40 +65);
                startC +=45;
                g2d.drawLine(start,  55, start, (int) pageFormat.getImageableHeight());
                g2d.drawLine(start-40, 55, start+40, 55);
            }else if(i==5){
                startC +=85;
                g2d.drawString(i+1 + "", startC, 40 +65);
                g2d.drawLine(start +180,  35, start +180, (int) pageFormat.getImageableHeight());
                g2d.drawString(7 + "", start +210, 40 +65);
            }else {
                g2d.drawString(i+1 + "", startC, 40+65);
                startC +=45;
                g2d.drawLine(start,  35, start, (int) pageFormat.getImageableHeight());

            }
            start += 40;
        }
        g2d.drawString("Линия № ____________ Скважина № ________ ", 10, retreat);
    }

    private void thirdListPrint(Graphics g, PageFormat pageFormat, int pageIndex){

        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        AffineTransform defaultAt = g2d.getTransform();
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        int start = 10;
        int retreat = 35;
        bigTable2(start, retreat, g2d);
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 8));

        g2d.drawString("Интервал", start, 50);
        g2d.drawString("опробования", start, 60);
        g2d.drawString("от", start, 90);
        g2d.drawString("до", start+35, 90);

        g2d.drawString("Номер", start+62, 50);
        g2d.drawString("Пробы", start+62, 60);

        g2d.drawString("Объём", start+102, 50);
        g2d.drawString("Пробы", start+102, 60);
        g2d.drawString("геор, м", start+102, 70);
        g2d.drawString("факт", start+102, 80);

        g2d.drawString("Полевое", start+142, 50);
        g2d.drawString("определ.", start+142, 60);
        g2d.drawString("(ПС ЗН)", start+142, 70);
        g2d.drawString("вес Au)", start+142, 80);


        g2d.drawString("Вес", start+182, 50);
        g2d.drawString("мелкого", start+182, 60);
        g2d.drawString("золота мг", start+182, 70);

        g2d.drawString("Число и", start+222, 50);
        g2d.drawString("вес само-", start+222, 60);
        g2d.drawString("родков мг", start+222, 70);

        g2d.drawString("Общий вес", start+262, 50);
        g2d.drawString("золота в ", start+262, 60);
        g2d.drawString("пробе мг", start+262, 70);

        g2d.drawString("Характеристики", start+302, 50);
        g2d.drawString("золота", start+302, 60);

        g2d.drawString("Среднее", start+402, 40);
        g2d.drawString("содержание", start+402, 50);
        g2d.drawString("золота по", start+402, 60);
        g2d.drawString("интегралу", start+402, 70);
        g2d.drawString("опробования", start+402, 80);
        g2d.drawString("мг/м^3 Шлик", start+402, 90);

        g2d.drawString("Расчет средн. показат.", start+462, 40);
        g2d.drawString("по пласту. Мощнст", start+462, 50);
        g2d.drawString("интервалу м. Верт.запас", start+462, 60);
        g2d.drawString("по интерву мг/м^3 Средне-", start+462, 70);
        g2d.drawString("завыш.содержание по пла-", start+462, 80);
        g2d.drawString("сту. Вертик запас по пласту", start+462, 90);

        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        g2d.drawLine(start,  retreat, (int) pageFormat.getImageableWidth(), retreat);
        retreat = 95;
        g2d.drawLine(start,  retreat, (int) pageFormat.getImageableWidth(), retreat);
        retreat += 15;
        g2d.drawLine(start,  retreat, (int) pageFormat.getImageableWidth(), retreat);
        g2d.drawLine(start,  retreat, (int) pageFormat.getImageableWidth(), retreat);
        retreat += 21;
        for (int i = 0; i < 31; i++) {
            g2d.drawLine(start,  retreat, (int) pageFormat.getImageableWidth(), retreat);
            retreat += 21;
        }



        g2d.drawLine(start+30,  75, start+30, (int) pageFormat.getImageableHeight());
        g2d.drawLine(start, 75, start+60, 75);
        g2d.drawLine(start+30,  75, start+30, (int) pageFormat.getImageableHeight());
        g2d.drawString("8", start+15,105);
        g2d.drawString("9", start+45,105);
        start += 60;
        int startC = start+15;
        int index = 10;
        for (int i = 0; i < 9; i++) {
            //g2d.drawString(i+1 + "", startC, 40+65);
            if (i==7){
                start += 60;
                g2d.drawLine(start,  35, start, (int) pageFormat.getImageableHeight());
                start += 40;
                startC += 60;
                g2d.drawString(index + "", startC,105);
            }else if(i==8){
                start += 20;
                g2d.drawLine(start,  35, start, (int) pageFormat.getImageableHeight());
                start += 40;
                startC += 80;
                g2d.drawString(index + "", startC,105);
            }else {
                g2d.drawLine(start,  35, start, (int) pageFormat.getImageableHeight());
                start += 40;

                g2d.drawString(index + "", startC,105);
                startC += 40;
            }
            index++;
        }
    }

    private void fourthListPrint(Graphics g, PageFormat pageFormat, int pageIndex){
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        AffineTransform defaultAt = g2d.getTransform();
        FontMetrics metrics = g2d.getFontMetrics(new Font("Times New Roman", Font.PLAIN, 12));
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        int start = 10;
        int retreat = 35;
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 10));
        g2d.drawLine(start, 10, (int)pageFormat.getImageableWidth(), 10);
        g2d.drawString("Контроль", start+2, 18);
        g2d.drawLine(start, 25, (int)pageFormat.getImageableWidth(), 25);
        g2d.drawLine(start, 10, start, 115);
        g2d.drawLine(start+181, 10, start+181, 115);
        g2d.drawLine(start+362, 10, start+362, 115);
        g2d.drawLine(start + 540, 10, 550, 115);
        smallTableOne(start, retreat, g2d);
        int loop = 55;
        for (int i = 0; i < 3; i++) {
            g2d.drawLine(start, loop, (int) pageFormat.getImageableWidth(), loop);
            loop += 30;
        }
        g2d.drawString("Дата контроля", start+2, 38);
        g2d.drawString("Что контролировать, объём пробы:", start+185, 38);
        g2d.drawString("Способ промывки", start+185, 48);
        g2d.drawString("Результаты промывки", start+365, 38);

        g2d.drawString("Контроль произвёл________________", start+250, 135);
        g2d.drawString("___________", start+250, 155);
        g2d.drawString("________________", start+320, 155);
        g2d.setFont(new Font("Times New Roman", Font.BOLD, 12));
        g2d.drawString("Характеристика самородков", start+190, 175);
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 10));

        g2d.drawLine(start, 185, (int)pageFormat.getImageableWidth(), 185);
        g2d.drawLine(start, 205, (int)pageFormat.getImageableWidth(), 205);
        loop=235;
        smallTableTwo(start, retreat, g2d );
        for (int i = 0; i < 4; i++) {
            g2d.drawLine(start, loop, (int)pageFormat.getImageableWidth(), loop);
            loop += 30;
        }
        loop = start;
        g2d.drawString("Интервал, м", start+10,195);
        g2d.drawString("Кол-во самородков", start+120,195);
        g2d.drawString("Вес самородков", start+230,195);
        g2d.drawString("Размеры в 3-х изм", start+340,195);
        g2d.drawString("Краткая характеристика", start+446,195);

        for (int i = 0; i < 6; i++) {
            g2d.drawLine(loop, 185, loop, 325);
            loop += 110;
        }
        g2d.setFont(new Font("Times New Roman", Font.BOLD, 12));
        g2d.drawString("АКТ", start+200, 340);
        g2d.drawString("на завершенную (добитую скважину)", start+180, 350);
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12));

        String format = "20" + fourthList.getYear() + " г." + fourthList.getMonth() + " " + fourthList.getDay() + " ";
        g2d.drawString(format, start, 365);

        format = "Настоящий акт составлен в том, что №  " + fourthList.getNumberAkt();
        g2d.drawString(format, start, 380);

        format="остановлена, закрыта по контрольному замеру на глубине  "+ fourthList.getDepth() +"  м в связи";
        g2d.drawString(format, start, 395);

        drawString(fourthList.getAkt1(), start, 415, g2d, new BigTableCells(loop-110, 10,15), 10);
        retreat = indent + 20;

        format = "геолог " + fourthList.getGeolog() + " бурильщик " + fourthList.getDriller() + " бур мастер "+ fourthList.getMaster();
        drawString(format, start, retreat, g2d , new BigTableCells(loop-110, 10, 15), 2);


        g2d.setFont(new Font("Times New Roman", Font.BOLD, 12));
        g2d.drawString("АКТ", start+200, retreat+20);
        g2d.drawString("на вынужденную остановку скважины", start+180, retreat+35);
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12));

        format = "20" + fourthList.getYear2() + " г." + fourthList.getMonth2() + " " + fourthList.getDay2() + " ";
        g2d.drawString(format, start, retreat+50);

        format = "Настоящий акт составлен в том, что №  " + fourthList.getNumberAkt2() + " остановлена на глубине " + fourthList.getDepth2();
        g2d.drawString(format, start, retreat+65);


        drawString(fourthList.getAkt2(), start, retreat+75, g2d, new BigTableCells(loop-110, 10,15), 10);
        retreat = indent + 20;
        format = "геолог " + fourthList.getGeolog2() + " бурильщик " + fourthList.getDriller2() + " бур мастер "+ fourthList.getMaster2();
        drawString(format, start, retreat, g2d , new BigTableCells(loop-110, 10, 15), 2);
    }

    public  void printList() throws PrinterException {
        init();
        Printable printable = new Printable() {
            @Override
            public int print(Graphics g, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex >= 4) {
                    return NO_SUCH_PAGE;
                }

                if (pageIndex == 0){
                    firstListPrint(g, pageFormat, pageIndex);
                }else if (pageIndex==1){
                    secondListPrint(g,pageFormat, pageIndex);
                }else if(pageIndex==2){
                    thirdListPrint(g, pageFormat, pageIndex);
                }else{
                    fourthListPrint(g, pageFormat, pageIndex);
                }


                length2 = 10;
                countLine = 0;
                cellCnt = 0;
                return PAGE_EXISTS;
            }
        };
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        /*PageFormat pageFormat = printerJob.defaultPage();
        pageFormat = printerJob.pageDialog(pageFormat);*/

        PrintRequestAttributeSet attrs = new HashPrintRequestAttributeSet();
        attrs.add(MediaSizeName.ISO_A4);

        //Ориентация
        //attrs.add(OrientationRequested.LANDSCAPE);


        //было - 28 и 20 20
        attrs.add(new MediaPrintableArea(
                20,
                20,
                MediaSize.ISO.A4.getX( Size2DSyntax.MM )-10,
                MediaSize.ISO.A4.getY( Size2DSyntax.MM ) -10,
                Size2DSyntax.MM
        ));

        printerJob.setPrintable(printable);
        if (printerJob.printDialog()){
            printerJob.print(attrs);
        }
    }




}
