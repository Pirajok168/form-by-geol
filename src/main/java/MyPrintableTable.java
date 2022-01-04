import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;

public class MyPrintableTable implements Printable {
    private int linesPerPage = 20;
    private List<String> sTable = new ArrayList<String>();
    {
        for (int i = 0; i < 100; i++) {
            sTable.add("Line" + i);
        }
    }

    public int print(Graphics g, PageFormat pf, int pageIndex) {
        if (pageIndex * linesPerPage >= sTable.size())
            return NO_SUCH_PAGE;
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(new Font("Serif", Font.PLAIN, 16));
        g2.setPaint(Color.black);
        int x = 100;
        int y = 100;
        for (int i = linesPerPage * pageIndex; i < sTable.size()
                && i < linesPerPage * (pageIndex + 1); i++) {
            g2.drawString(sTable.get(i).toString(), x, y);
            y += 20;
        }
        return PAGE_EXISTS;
    }
}
