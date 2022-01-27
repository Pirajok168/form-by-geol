package draw.litho.drawables.impl;

import draw.litho.drawables.ILithoElement;
import draw.litho.util.LithoElement;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.awt.*;

public class SandMediumParticle extends LithoElement {

    public SandMediumParticle(){
        rectangle = new Rectangle(10, 10);
    }

    @Override
    protected void Draw(GraphicsContext gc, Rectangle canvasRect) {
        var radius = 2;
        var x = rectangle.x;
        var y = rectangle.y;
        var height = rectangle.height;
        var width = rectangle.width;

        gc.setFill(Color.BLACK);
        gc.fillOval(
                x + width/2f - radius/2f,
                y + height/2f - radius/2f,
                radius,
                radius
        );
    }
}
