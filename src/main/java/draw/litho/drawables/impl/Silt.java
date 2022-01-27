package draw.litho.drawables.impl;

import draw.litho.util.LithoElement;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.awt.*;

public class Silt extends LithoElement {
    public Silt() {
        rectangle = new Rectangle(10, 10);
    }

    @Override
    protected void Draw(GraphicsContext gc, Rectangle canvasRect) {
        var margin = 1.2;

        gc.strokeLine(
                rectangle.x + margin,
                rectangle.y + rectangle.height / 2f,
                rectangle.x + rectangle.width - margin * 2,
                rectangle.y + rectangle.height / 2f
        );
    }
}
