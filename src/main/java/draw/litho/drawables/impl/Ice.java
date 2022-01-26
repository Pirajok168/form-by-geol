package draw.litho.drawables.impl;

import draw.litho.drawables.ILithoElement;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.awt.*;

public class Ice implements ILithoElement {

    private final Rectangle rect = new Rectangle(40, 20);

    @Override
    public void setPoint(Point point) {
        rect.setLocation(point);
    }

    @Override
    public Rectangle getRect() {
        return new Rectangle(rect);
    }

    @Override
    public void Draw(Canvas canvas) {
        var margin = 5;

        var x = rect.x;
        var y = rect.y;
        var height = rect.height - margin * 2;
        var width = rect.width - margin * 2;

        var gc = canvas.getGraphicsContext2D();
        SetupGraphicContext(gc);

        gc.strokeLine(
                x + margin + width / 2f,
                y + margin,
                x + margin + width / 2f,
                y + height + margin
        );

        gc.strokeLine(
                x + margin,
                y + margin + height,
                x + margin + width,
                y + margin + height
        );
    }

    private void SetupGraphicContext(GraphicsContext gc) {
        gc.setFill(Color.WHITE);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1);
    }
}
