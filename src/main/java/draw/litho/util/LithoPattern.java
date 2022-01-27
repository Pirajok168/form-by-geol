package draw.litho.util;

import draw.litho.drawables.ILithoPattern;
import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

import java.awt.*;

public abstract class LithoPattern implements ILithoPattern {
    protected abstract void Draw(GraphicsContext gc, Rectangle canvasRect);

    @Override
    public void Draw(Canvas canvas) {
        var gc = canvas.getGraphicsContext2D();
        SetupGraphicContext(gc);
        Draw(gc, new Rectangle((int) canvas.getWidth(), (int) canvas.getHeight()));
    }

    private void SetupGraphicContext(GraphicsContext gc){
        gc.setFill(javafx.scene.paint.Color.WHITE);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1);
        gc.setTextAlign(TextAlignment.LEFT);
        gc.setTextBaseline(VPos.BASELINE);
        gc.setFont(Font.getDefault());
    }

    @Override
    public DrawingOrder GetDrawingOrder() {
        return DrawingOrder.BEFORE;
    }
}
