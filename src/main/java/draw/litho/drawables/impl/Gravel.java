package draw.litho.drawables.impl;

import draw.litho.drawables.LithoElement;
import javafx.scene.canvas.GraphicsContext;

import java.awt.*;

public class Gravel extends LithoElement {
    public Gravel() {
        rectangle = new Rectangle(10, 10);
    }

    @Override
    protected void Draw(GraphicsContext gc, Rectangle canvasRect) {
        var diam = 4;

        gc.strokeOval(
                rectangle.x + rectangle.width / 2f - diam / 2f,
                rectangle.y + rectangle.height / 2f - diam / 2f,
                diam,
                diam
        );
    }
}
