package draw.litho.drawables.impl;

import draw.litho.drawables.ILithoPattern;
import draw.litho.util.DrawingOrder;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Waste implements ILithoPattern {

    double GetBias(double height, double angle) {
        return height * Math.tan(Math.toRadians(angle));
    }

    @Override
    public void Draw(Canvas canvas) {
        var step = 20;
        var angle = 45;

        var height = canvas.getHeight();
        var width = canvas.getWidth();
        var gc = canvas.getGraphicsContext2D();
        SetupGraphicContext(gc);

        for (double biasCnt = - GetBias(height, angle); biasCnt < width; biasCnt += step) {
            gc.strokeLine(biasCnt, 0,GetBias(height, angle) + biasCnt,height );
        }
        for (double biasCnt = 0; biasCnt < width + Math.abs(GetBias(height, -angle)); biasCnt += step) {
            gc.strokeLine(biasCnt, 0,GetBias(height, -angle) + biasCnt,height );
        }
    }

    private void SetupGraphicContext(GraphicsContext gc){
        gc.setFill(Color.WHITE);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1);
    }

    @Override
    public DrawingOrder GetDrawingOrder() {
        return DrawingOrder.BEFORE;
    }
}