package draw.litho.drawables.impl;

import draw.litho.drawables.LithoElement;
import javafx.scene.canvas.GraphicsContext;

import java.awt.*;

public class Granite extends LithoElement {

    public Granite() {
        rectangle = new Rectangle(20, 20);
    }

    @Override
    protected void Draw(GraphicsContext gc, Rectangle canvasRect) {
        var margin = 2.5;

        gc.strokeLine(
                rectangle.x + margin,
                rectangle.y + rectangle.height / 2f,
                rectangle.x + rectangle.width - margin,
                rectangle.y + rectangle.height / 2f);

        gc.strokeLine(
                rectangle.x + rectangle.width / 2f,
                rectangle.y + margin,
                rectangle.x + rectangle.width / 2f,
                rectangle.y + rectangle.height - margin
        );
    }
}
