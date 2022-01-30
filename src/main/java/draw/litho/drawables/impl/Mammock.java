package draw.litho.drawables.impl;

import draw.litho.drawables.LithoElement;
import javafx.scene.canvas.GraphicsContext;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.*;
import java.util.List;

public class Mammock extends LithoElement {

    protected List<Point2D.Double> Points;

    public Mammock() {
        rectangle = new Rectangle(40, 22);

        Points = NormalisePoints(
                List.of(
                        new Point2D.Double(2.79086, 7.75014),
                        new Point2D.Double(4.9318, 10.85628),
                        new Point2D.Double(8.64566, 10.28827),
                        new Point2D.Double(13.91259, 10.41141),
                        new Point2D.Double(12.99902, 7.82958),
                        new Point2D.Double(16.37525, 7.11461),
                        new Point2D.Double(14.19063, 4.33418),
                        new Point2D.Double(10, 4),
                        new Point2D.Double(8.70921, 5.56551),
                        new Point2D.Double(5.21381, 4.73138)
                ), 2);
    }

    protected List<Point2D.Double> NormalisePoints(@NotNull List<Point2D.Double> Points, double margin) {
        double rawX = Points.stream().map(aDouble -> aDouble.x).min(Comparator.naturalOrder()).get();
        double rawY = Points.stream().map(aDouble -> aDouble.y).min(Comparator.naturalOrder()).get();

        double rawWidth = Points.stream().map(aDouble -> aDouble.x).max(Comparator.naturalOrder()).get() - rawX;
        double rawHeight = Points.stream().map(aDouble -> aDouble.y).max(Comparator.naturalOrder()).get() - rawY;

        var width = rectangle.width - margin * 2;
        var height = rectangle.height - margin * 2;

        var result = new ArrayList<Point2D.Double>();
        for (var point : Points) {
            result.add(new Point2D.Double(
                    margin + (point.x - rawX) * width / rawWidth,
                    margin + (point.y - rawY) * height / rawHeight
            ));
        }
        result.add(result.get(0));
        return result;
    }


    @Override
    protected void Draw(GraphicsContext gc, Rectangle canvasRect) {


        gc.beginPath();
        boolean firstRun = true;
        for (var point : Points) {
            if (firstRun)
                gc.moveTo(
                        rectangle.x + point.x,
                        rectangle.y + point.y
                );
            else
                gc.lineTo(
                        rectangle.x + point.x,
                        rectangle.y + point.y
                );
            firstRun = false;
        }
        gc.stroke();
    }
}
