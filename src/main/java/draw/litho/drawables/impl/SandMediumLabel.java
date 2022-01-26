package draw.litho.drawables.impl;

import com.sun.javafx.tk.Toolkit;
import draw.litho.drawables.ILithoDrawable;
import draw.litho.drawables.ILithoPattern;
import draw.litho.util.DrawingOrder;
import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

import java.awt.*;

public class SandMediumLabel implements ILithoPattern {
    @Override
    public void Draw(Canvas canvas) {
        var gc = canvas.getGraphicsContext2D();

        var symbol = 'C';
        var symbolWidth = 10;
        var symbolHeight = 3;
        var radius = 25;

        var height = canvas.getHeight();
        var width = canvas.getWidth();

        gc.setFill(Color.WHITE);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1.5);

        gc.fillOval(
                width / 2 - radius / 2f,
                height / 2 - radius / 2f,
                radius,
                radius
        );

        gc.strokeOval(
                width / 2 - radius / 2f,
                height / 2 - radius / 2f,
                radius,
                radius
        );


        gc.setFill(Color.BLACK);
        gc.setTextAlign(TextAlignment.LEFT);
        gc.setTextBaseline(VPos.CENTER);
        gc.setFont(Font.font("Roboto", 15));

        gc.fillText(
                String.valueOf(symbol),
                width / 2 - symbolWidth / 2f,
                height / 2 - symbolHeight / 2f
        );
    }

    @Override
    public DrawingOrder GetDrawingOrder() {
        return DrawingOrder.AFTER;
    }
}
