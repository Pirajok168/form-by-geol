import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.Size2DSyntax;
import javax.print.attribute.standard.MediaPrintableArea;
import javax.print.attribute.standard.MediaSize;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.OrientationRequested;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.*;
import java.util.List;

//15 12
public class Main {
    private static int linesPerPage = 20;
    private static List<String> data = new ArrayList<>();
    private static List<String> data2 = new ArrayList<>();

    public static void init(){
        data.add("Долина реки ___________ правого (левого) притока ___________ в системе ___________________");
        data.add("_____________ ручья");
        data.add("Тип россыпи (русловая, долинная, террасовая, увальная и др.) _______________________________");
        data.add("Линия № _______ ");
        data.add("На расстоянии от устья ____________ м, от линии № ___________ (вниз, вверх) ______________ м");
        data.add("Азимут буровой линии (магнитный, истинный) ___________________________________________");
        data.add("Скважина № __________");
        data.add("Расположена на правой (левой) стороне от русла на расстоянии от него _____________________ м,");
        data.add("От скважины № ________ вправо (влево) _____________________ м _________________________");
        data.add("Скважина начала ___________________________________ Окончена  _________________________");
        data.add("Высотная отметка устья скважины ________________, координаты: х-, у- _____________________");
        data.add("Пройдено в мерзлоте от ____________ до ____________, от ____________ до __________________");
        data.add("Пройдено в талом грунте от ________ до ____________ , от ____________ до __________________");
        data.add("Общая глубина скважины _________ м, глубина обсада __________________________________ м.");
        data.add("Состав пород плотика ________________________________, пройдено по ним _______________ м");
        data.add("Скважина пройдена (добита), остановлена (недобита) на глубине __________________________ м.");
        data.add("Уровень воды в скважине (от поверхности): встречный _________ м, установившийся ________  м");
        data.add("Диаметр бурения на глубину ____________________ м __________________________________ мм");
        data.add("Буровой станок ____________________: промывка ___________ лотком ______________________");
        data.add("Геолог ________________________________, маркшейдер __________________________________");

        data2.add("Глубина выемки");
        data2.add("(мощность массы)");
        data2.add("Мощность торфов");
        data2.add("Мощность песков (пласта)");
        data2.add("Среднее содержание Au");
        data2.add("Вертикальный запас Au");
        data2.add("Лимитность по кондициям");
        data2.add("________ года");
    }

    public void printList(String text) throws PrinterException {
        init();
        Printable printable = new Printable() {
            @Override
            public int print(Graphics g, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
                    return NO_SUCH_PAGE;
                }
                Graphics2D g2d = (Graphics2D)g;
                g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

                g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                /**тут первая страница*/
                g2d.drawString("Участок "+ text, 10, 10);
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
                    if (Objects.equals(data.get(i), "Линия № _______ ")
                            ||  Objects.equals(data.get(i), "Скважина № __________")){
                        g2d.setFont(new Font("Times New Roman", Font.BOLD, 12));
                        g2d.drawString(data.get(i),200,  y);
                        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                        y += 23;
                    }else{
                        g2d.drawString(data.get(i),10, y );
                        y += 18;
                    }
                }
                g2d.drawString("Результаты подсчета по скважине", 140, y + 30);
                y = y + 40;
                g2d.drawLine(10, y,  (int)pageFormat.getImageableWidth(), y );
                g2d.setFont(new Font("Times New Roman", Font.PLAIN, 10));
                g2d.drawString("Проба Au _______", 30, y+20);
                g2d.drawString("Борт. содержание Au x.ч _______ м???", 11, y+28);
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

                /**тут вторая страница*/
                /*int start = 10;
                int retreat = 10;
                g2d.drawString("Геолог______________", start, retreat);
                g2d.drawString("Дата______________", 200, retreat);
                retreat += 15;
                g2d.drawString("Линия № ____________ Скважина № ________ ", start, retreat);
                retreat += 10;
                g2d.drawLine(start,  retreat, (int) pageFormat.getImageableWidth(), retreat);
                retreat = 95;
                g2d.drawLine(start,  retreat, (int) pageFormat.getImageableWidth(), retreat);
                retreat += 15;
                g2d.drawLine(start,  retreat, (int) pageFormat.getImageableWidth(), retreat);
                retreat += 20;
                for (int i = 0; i < 31; i++) {
                    g2d.drawLine(start,  retreat, (int) pageFormat.getImageableWidth(), retreat);
                    retreat += 20;
                }
                start += 70;
                int startC = start-35;
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
                g2d.drawString("Линия № ____________ Скважина № ________ ", 10, retreat);*/


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

        attrs.add(new MediaPrintableArea(
                20,
                20,
                MediaSize.ISO.A4.getX( Size2DSyntax.MM ) - 28,
                MediaSize.ISO.A4.getY( Size2DSyntax.MM ) - 28,
                Size2DSyntax.MM
        ));

        printerJob.setPrintable(printable);
        if (printerJob.printDialog()){
            printerJob.print(attrs);
        }
    }

    public static void main(String[] args) throws PrinterException {
        init();
        Printable printable = new Printable() {
            @Override
            public int print(Graphics g, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
                    return NO_SUCH_PAGE;
                }
                Graphics2D g2d = (Graphics2D)g;
                g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

                g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                /**тут первая страница*/
                g2d.drawString("Участок ____________", 10, 10);
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
                    if (Objects.equals(data.get(i), "Линия № _______ ")
                            ||  Objects.equals(data.get(i), "Скважина № __________")){
                        g2d.setFont(new Font("Times New Roman", Font.BOLD, 12));
                        g2d.drawString(data.get(i),200,  y);
                        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                        y += 23;
                    }else{
                        g2d.drawString(data.get(i),10, y );
                        y += 18;
                    }
                }
                g2d.drawString("Результаты подсчета по скважине", 140, y + 30);
                y = y + 40;
                g2d.drawLine(10, y,  (int)pageFormat.getImageableWidth(), y );
                g2d.setFont(new Font("Times New Roman", Font.PLAIN, 10));
                g2d.drawString("Проба Au _______", 30, y+20);
                g2d.drawString("Борт. содержание Au x.ч _______ м???", 11, y+28);
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

                /**тут вторая страница*/
                /*int start = 10;
                int retreat = 10;
                g2d.drawString("Геолог______________", start, retreat);
                g2d.drawString("Дата______________", 200, retreat);
                retreat += 15;
                g2d.drawString("Линия № ____________ Скважина № ________ ", start, retreat);
                retreat += 10;
                g2d.drawLine(start,  retreat, (int) pageFormat.getImageableWidth(), retreat);
                retreat = 95;
                g2d.drawLine(start,  retreat, (int) pageFormat.getImageableWidth(), retreat);
                retreat += 15;
                g2d.drawLine(start,  retreat, (int) pageFormat.getImageableWidth(), retreat);
                retreat += 20;
                for (int i = 0; i < 31; i++) {
                    g2d.drawLine(start,  retreat, (int) pageFormat.getImageableWidth(), retreat);
                    retreat += 20;
                }
                start += 70;
                int startC = start-35;
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
                g2d.drawString("Линия № ____________ Скважина № ________ ", 10, retreat);*/


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

        attrs.add(new MediaPrintableArea(
                20,
                20,
                MediaSize.ISO.A4.getX( Size2DSyntax.MM ) - 28,
                MediaSize.ISO.A4.getY( Size2DSyntax.MM ) - 28,
                Size2DSyntax.MM
        ));

        printerJob.setPrintable(printable);
        if (printerJob.printDialog()){
            printerJob.print(attrs);
        }
    }

    /*public static void main(String[] args) {
        MyPrintableTable mpt = new MyPrintableTable();
        PrinterJob job = PrinterJob.getPrinterJob();
        PageFormat pageFormat = job.defaultPage();
        pageFormat = job.pageDialog(pageFormat);
        job.setPrintable(mpt, pageFormat);
        job.printDialog();
        try {
            job.print();
        } catch (PrinterException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }*/
}
