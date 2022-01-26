package draw.litho.drawables.impl;

import draw.litho.drawables.ILithoElement;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.awt.*;

public class SandMediumParticle implements ILithoElement {

    private final Rectangle rect = new Rectangle(10, 10);

    @Override
    public void Draw(Canvas canvas) {
        var radius = 2;
        var x = rect.x;
        var y = rect.y;
        var height = rect.height;
        var width = rect.width;

        var gc = canvas.getGraphicsContext2D();
        SetupGraphicContext(gc);

        gc.fillOval(
                x + width/2f - radius/2f,
                y + height/2f - radius/2f,
                radius,
                radius
        );
    }

    @Override
    public void setPoint(Point point) {
        rect.setLocation(point);
    }

    @Override
    public Rectangle getRect() {
        return new Rectangle(rect);
    }

    private void SetupGraphicContext(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
    }
}
