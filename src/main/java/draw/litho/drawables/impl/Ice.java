package draw.litho.drawables.impl;

import draw.litho.drawables.ILithoElement;
import draw.litho.util.LithoElement;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.awt.*;

public class Ice extends LithoElement {

    public Ice(){
        rectangle = new Rectangle(40, 20);
    }

    @Override
    protected void Draw(GraphicsContext gc, Rectangle canvasRect) {
        var margin = 5;

        var x = rectangle.x;
        var y = rectangle.y;
        var height = rectangle.height - margin * 2;
        var width = rectangle.width - margin * 2;

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
}
