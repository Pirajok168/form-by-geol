package draw.litho.drawables.impl;

import draw.litho.drawables.LithoElement;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;

import java.awt.*;
import java.awt.geom.Point2D;

public class Clay extends LithoElement {

    public Clay() {
        rectangle = new Rectangle(25, 11);//new Rectangle(25, 15);
    }

    @Override
    protected void Draw(GraphicsContext gc, Rectangle canvasRect) {

        var margin = 2.5;
        var width = rectangle.width - margin * 2;
        var height = rectangle.height - margin * 2;

        var pointA = new Point2D.Double(
                rectangle.x + margin,
                rectangle.y + margin + height / 2f
        );
        var pointABezier = new Point2D.Double(
                rectangle.x + margin + width / 2,
                rectangle.y + margin - height
        );
        var pointB = new Point2D.Double(
                rectangle.x + margin + width,
                rectangle.y + margin + height / 2f
        );
        var pointBBezier = new Point2D.Double(
                rectangle.x + margin + width / 2,
                rectangle.y + margin + height * 2
        );

        gc.beginPath();
        gc.moveTo(pointA.x, pointA.y);
        gc.bezierCurveTo(
                pointABezier.x,
                pointABezier.y,
                pointBBezier.x,
                pointBBezier.y,
                pointB.x,
                pointB.y
        );
        gc.stroke();
    }
}
