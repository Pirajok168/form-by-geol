package draw.litho.drawables.impl;

import draw.litho.drawables.LithoPattern;
import javafx.scene.canvas.GraphicsContext;

import java.awt.*;

public class Waste extends LithoPattern {

    double GetBias(double height, double angle) {
        return height * Math.tan(Math.toRadians(angle));
    }

    @Override
    protected void Draw(GraphicsContext gc, Rectangle canvasRect) {
        var step = 20;
        var angle = 45;

        var height = canvasRect.height;
        var width = canvasRect.width;

        for (double biasCnt = - GetBias(height, angle); biasCnt < width; biasCnt += step) {
            gc.strokeLine(biasCnt, 0,GetBias(height, angle) + biasCnt,height );
        }
        for (double biasCnt = 0; biasCnt < width + Math.abs(GetBias(height, -angle)); biasCnt += step) {
            gc.strokeLine(biasCnt, 0,GetBias(height, -angle) + biasCnt,height );
        }
    }
}