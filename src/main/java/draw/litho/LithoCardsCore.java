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
import java.util.stream.Collectors;

//Главный класс обработчик
public class LithoCardsCore {

    public LithoCardsCore() {
    }

    public LithoCardsCore(Random random) {
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

        var groupedElements = new ArrayList<>(lithoElements
                .stream()
                .collect(Collectors
                        .groupingBy(ILithoElement::getClass))
                .values()
                .stream()
                .map(iLithoElements -> iLithoElements
                        .stream()
                        .findFirst())
                .filter(Optional::isPresent)
                .map(Optional::get)
                .sorted((o1, o2) -> {
                    var o1Rect = o1.getRect();
                    var o2Rect = o2.getRect();
                    return o1Rect.height * o1Rect.width > o2Rect.height * o2Rect.width ? 1 : 0;
                })
                .toList());

        var subtractedElements = new ArrayList<>(lithoElements
                .stream()
                .filter(iLithoElement -> !groupedElements.contains(iLithoElement))
                .toList());

        Collections.shuffle(subtractedElements, random);
        groupedElements.addAll(subtractedElements);
        lithoElements = groupedElements;

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

    private void DrawAllPatterns(Canvas canvas, DrawingOrder order) {
        lithoPatterns
                .stream()
                .filter(pattern ->
                        pattern.GetDrawingOrder() == order)
                .forEach(pattern ->
                        pattern.Draw(canvas));
    }

    private void DrawAllElements(Canvas canvas) {
        var height = (int) canvas.getHeight();
        var width = (int) canvas.getWidth();
        var canvasRect = new Rectangle(width, height);

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
    }

    public void Draw(Canvas canvas) {
        DrawAllPatterns(canvas, DrawingOrder.BEFORE);
        DrawAllElements(canvas);
        DrawAllPatterns(canvas, DrawingOrder.AFTER);
    }
}
