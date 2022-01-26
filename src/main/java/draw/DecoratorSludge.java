package draw;


import javafx.scene.canvas.GraphicsContext;

//Ил
public class DecoratorSludge implements DrawCut{
    private GraphicsContext graphics;
    private DrawCut drawCut;
    private double width;
    private double height;

    public DecoratorSludge(DrawCut drawCut, GraphicsContext graphicsContext, double width, double height) {
        this.drawCut = drawCut;
        this.graphics = graphicsContext;
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw() {
        //graphics.fillOval(10,60,30,30);
        graphics.strokeLine(5,5, 40, 5);
    }

    @Override
    public void clear() {
        graphics.clearRect(0,0,width, height);
    }


}
