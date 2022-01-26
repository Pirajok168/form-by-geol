package draw;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class DecoratorWorkingOut implements DrawCut{
    private DrawCut drawCut;
    private GraphicsContext graphics;
    private double width;
    private double height;

    public DecoratorWorkingOut(DrawCut drawCut, GraphicsContext graphicsContext, double width, double height) {
        this.drawCut = drawCut;
        this.graphics = graphicsContext;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("DecoratorWorkingOut");
       /* graphics.setStroke(Color.BLUE);
        graphics.setLineWidth(1);*/

        //graphics.strokeLine(40,10,10,40);


    }

    @Override
    public void clear() {
        graphics.clearRect(0,0,width, height);
    }
}
