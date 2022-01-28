package draw.litho.drawables.impl;

import draw.litho.drawables.LithoElement;
import javafx.scene.canvas.GraphicsContext;

import java.awt.*;

public class Boulder extends LithoElement {
    public Boulder() {
        testDrawing = true;
        rectangle = new Rectangle(40, 20);
    }

    @Override
    protected void Draw(GraphicsContext gc, Rectangle canvasRect) {
        var margin = 4;
        gc.strokeRoundRect(
                rectangle.x + margin,
                rectangle.y + margin,
                rectangle.width - margin * 2,
                rectangle.height - margin * 2,
                rectangle.height / 2f,
                rectangle.height / 2f
        );
    }
}
