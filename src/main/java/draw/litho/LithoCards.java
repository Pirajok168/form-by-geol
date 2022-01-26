package draw.litho;

import draw.litho.drawables.ILithoDrawable;
import draw.litho.drawables.ILithoElement;
import draw.litho.drawables.ILithoPattern;
import draw.litho.providers.ILithoPatternProvider;
import draw.litho.util.DrawingOrder;
import javafx.scene.canvas.Canvas;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.*;
import java.util.List;

//Главный класс обработчик
public class LithoCards {

    public LithoCards() {
    }

    public LithoCards(Random random) {
        this.random = random;
    }

    private Random random = new Random();
    private final List<ILithoDrawable> mainCollection = new ArrayList<>();

    private List<ILithoPattern> lithoPatterns = new ArrayList<>();
    private List<ILithoElement> lithoElements = new ArrayList<>();

    private void UpdateCollections() {
        lithoElements = new ArrayList<>(mainCollection
                .stream()
                .filter(iLithoDrawable -> iLithoDrawable instanceof ILithoElement)
                .map(iLithoDrawable -> (ILithoElement) iLithoDrawable)
                .toList());
        Collections.shuffle(lithoElements, random);

        lithoPatterns = mainCollection
                .stream()
                .filter(iLithoDrawable -> iLithoDrawable instanceof ILithoPattern)
                .map(iLithoDrawable -> (ILithoPattern) iLithoDrawable)
                .toList();
    }

    public void Add(@NotNull ILithoPatternProvider pattern) {
        mainCollection.addAll(pattern.Provide());
        UpdateCollections();
    }

    public void Clear(Canvas canvas) {
        canvas
                .getGraphicsContext2D()
                .clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        Clear();
    }
    public void Clear() {
        mainCollection.clear();
        UpdateCollections();
    }

    public void Draw(Canvas canvas) {
        var height = (int) canvas.getHeight();
        var width = (int) canvas.getWidth();
        var canvasRect = new Rectangle(width, height);

        lithoPatterns
                .stream()
                .filter(pattern ->
                        pattern.GetDrawingOrder() == DrawingOrder.BEFORE)
                .forEach(pattern ->
                        pattern.Draw(canvas));

        var drawnElements = new Stack<Rectangle>();
        for (var element : lithoElements) {
            var elementRect = element.getRect();

            for (int i = 0; i < 500; i++) {
                var point = new Point(
                        random.nextInt(width - elementRect.width),
                        random.nextInt(height - elementRect.height)
                );
                element.setPoint(point);

                Rectangle finalElementRect = element.getRect();
                if (
                        drawnElements
                                .stream()
                                .noneMatch(rectangle ->
                                        rectangle.intersects(finalElementRect)
                                ) &&
                                canvasRect.contains(finalElementRect)
                ) {
                    drawnElements.add(finalElementRect);
                    element.Draw(canvas);
                    break;
                }
            }
        }

        lithoPatterns
                .stream()
                .filter(pattern ->
                        pattern.GetDrawingOrder() == DrawingOrder.AFTER)
                .forEach(pattern ->
                        pattern.Draw(canvas));
    }
}
