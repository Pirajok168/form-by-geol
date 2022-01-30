package draw.litho.drawables.impl;

import draw.litho.drawables.LithoElement;
import javafx.scene.canvas.GraphicsContext;

import java.awt.*;
import java.awt.geom.Point2D;

public class Rubbish extends LithoElement {
    public Rubbish() {
        rectangle = new Rectangle(10, 10);
    }

    @Override
    protected void Draw(GraphicsContext gc, Rectangle canvasRect) {
        var margin = 1;//1.2;
        var len = rectangle.width - margin * 2;
        var height = Math.sqrt(Math.pow(len, 2) - Math.pow(len / 2f, 2));

        var centerX = rectangle.x + rectangle.width / 2f;
        var centerY = rectangle.y + rectangle.height / 2f;

        var pointA = new Point2D.Double(
                centerX - len / 2f,
                centerY + height / 2f
        );

        var pointB = new Point2D.Double(
                centerX + len / 2f,
                centerY + height / 2f
        );

        var pointC = new Point2D.Double(
                centerX,
                centerY - height / 2f
        );

        gc.beginPath();
        gc.moveTo(pointA.x, pointA.y);
        gc.lineTo(pointB.x, pointB.y);
        gc.lineTo(pointC.x,pointC.y);
        gc.lineTo(pointA.x,pointA.y);
        gc.stroke();
    }
}
