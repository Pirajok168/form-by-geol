package draw.litho.drawables.impl;

import draw.litho.util.DrawingOrder;
import draw.litho.drawables.LithoPattern;
import javafx.geometry.VPos;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

import java.awt.*;

public class SandMediumLabel extends LithoPattern {
    @Override
    protected void Draw(GraphicsContext gc, Rectangle canvasRect) {
        var symbol = 'C';
        var symbolWidth = 10;
        var symbolHeight = 3;
        var radius = 25;

        var height = canvasRect.height;
        var width = canvasRect.width;

        gc.setFill(Color.WHITE);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1.5);

        gc.fillOval(
                width / 2f - radius / 2f,
                height / 2f - radius / 2f,
                radius,
                radius
        );

        gc.strokeOval(
                width / 2f - radius / 2f,
                height / 2f - radius / 2f,
                radius,
                radius
        );


        gc.setFill(Color.BLACK);
        gc.setTextAlign(TextAlignment.LEFT);
        gc.setTextBaseline(VPos.CENTER);
        gc.setFont(Font.font("Roboto", 15));

        gc.fillText(
                String.valueOf(symbol),
                width / 2f - symbolWidth / 2f,
                height / 2f - symbolHeight / 2f
        );
    }

    @Override
    public DrawingOrder GetDrawingOrder() {
        return DrawingOrder.AFTER;
    }
}
