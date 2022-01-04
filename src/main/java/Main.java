import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.*;
import java.util.List;


public class Main {
    private static int linesPerPage = 20;
    private static List<String> data = new ArrayList<>();


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
    }

    public static void main(String[] args) throws PrinterException {
        init();
        Printable printable = new Printable() {
            @Override
            public int print(Graphics g, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
                    return NO_SUCH_PAGE;
                }
                System.out.println(pageFormat.getImageableX());
                System.out.println(pageFormat.getImageableY());
                Graphics2D g2d = (Graphics2D)g;
                g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

                g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                g2d.drawString("Участок ____________", 50, 50);

                g2d.setFont(new Font("Times New Roman", Font.BOLD, 14));

                g2d.drawString("ЖУРНАЛ",240,  90);
                g2d.drawString("ДОКУМЕНТАЦИИ СКВАЖИН",180,  110);


                g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12));

                int y = 150;
                for (int i = linesPerPage * pageIndex; i < data.size()
                        && i < linesPerPage * (pageIndex + 1); i++) {
                    //System.out.println(data.get(i) + " " + data.get(i).length());
                    if (Objects.equals(data.get(i), "Линия № _______ ")
                            ||  Objects.equals(data.get(i), "Скважина № __________")){
                        g2d.setFont(new Font("Times New Roman", Font.BOLD, 14));
                        g2d.drawString(data.get(i),240,  y);
                        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                    }else{
                        g2d.drawString(data.get(i),50, y );
                    }
                    y += 20;
                }

                g2d.drawLine(50, y,  (int)pageFormat.getImageableWidth()-40, y );
                g2d.drawLine(50, y,  50, y+250 );
                g2d.drawLine((int)pageFormat.getImageableWidth()-40, y,  (int)pageFormat.getImageableWidth()-40, y+250 );
                g2d.drawLine(50, y+250,  (int)pageFormat.getImageableWidth()-40, y+250 );


                return PAGE_EXISTS;
            }
        };
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        /*PageFormat pageFormat = printerJob.defaultPage();
        pageFormat = printerJob.pageDialog(pageFormat);*/
        printerJob.setPrintable(printable);
        if (printerJob.printDialog()){
            printerJob.print();
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
