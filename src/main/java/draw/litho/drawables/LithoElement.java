package draw.litho.drawables;

import draw.litho.drawables.ILithoElement;
import draw.litho.util.RectangleNotImplementedException;
import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

import java.awt.*;

public abstract class LithoElement implements ILithoElement {

    protected Rectangle rectangle;
    protected boolean testDrawing = false;

    @Override
    public void setPoint(Point point) {
        if (rectangle == null)
            throw new RectangleNotImplementedException(this.getClass());

        rectangle.setLocation(point);
    }

    @Override
    public Rectangle getRect() {
        if (rectangle == null)
            throw new RectangleNotImplementedException(this.getClass());

        return new Rectangle(rectangle);
    }

    protected abstract void Draw(GraphicsContext gc, Rectangle canvasRect);

    @Override
    public void Draw(Canvas canvas) {
        var gc = canvas.getGraphicsContext2D();
        SetupGraphicContext(gc);

        if(testDrawing)
            gc.fillRect(rectangle.x,rectangle.y,rectangle.width,rectangle.height);

        Draw(gc, new Rectangle((int) canvas.getWidth(), (int) canvas.getHeight()));
    }


    private void SetupGraphicContext(GraphicsContext gc) {
        if (testDrawing) {
            gc.setFill(Color.PURPLE);
            gc.setStroke(Color.AQUA);
        } else {
            gc.setFill(Color.WHITE);
            gc.setStroke(Color.BLACK);
        }
        gc.setLineWidth(1);
        gc.setTextAlign(TextAlignment.LEFT);
        gc.setTextBaseline(VPos.BASELINE);
        gc.setFont(Font.getDefault());
    }
}

