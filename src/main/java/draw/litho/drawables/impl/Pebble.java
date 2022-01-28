package draw.litho.drawables.impl;

import draw.litho.drawables.LithoElement;
import javafx.scene.canvas.GraphicsContext;

import java.awt.*;

public class Pebble extends LithoElement {
    public Pebble() {
        rectangle = new Rectangle(12, 9);
    }

    @Override
    protected void Draw(GraphicsContext gc, Rectangle canvasRect) {
        var margin = 1.5;
        gc.strokeOval(
                rectangle.x + margin,
                rectangle.y + margin,
                rectangle.width - margin * 2,
                rectangle.height - margin * 2
        );
    }
}
