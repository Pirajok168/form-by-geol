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
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    private void ClearCollections() {
        lithoElements.clear();
        lithoPatterns.clear();
    }

    private Stream<ILithoElement> GetElements() {
        return mainCollection
                .stream()
                .filter(drawable -> drawable instanceof ILithoElement)
                .map(drawable -> (ILithoElement) drawable);
    }

    private Stream<ILithoPattern> GetPatterns() {
        return mainCollection
                .stream()
                .filter(drawable -> drawable instanceof ILithoPattern)
                .map(drawable -> (ILithoPattern) drawable);
    }

    private Collection<ILithoElement> GetDistinctElements() {
        return GetElements()
                .sorted((o1, o2) -> {
                    var o1Rect = o1.getRect();
                    var o2Rect = o2.getRect();
                    return o1Rect.height * o1Rect.width > o2Rect.height * o2Rect.width ? 1 : 0;
                })
                .collect(Collectors.toMap(
                        ILithoElement::getClass,
                        Function.identity(),
                        (iLithoElement, iLithoElement2) -> iLithoElement))
                .values();
    }

    private void UpdateCollections() {
        lithoPatterns.clear();
        lithoPatterns.addAll(GetPatterns().toList());

        lithoElements.clear();
        lithoElements.addAll(GetElements().toList());

        var distinct = GetDistinctElements();
        lithoElements.removeAll(distinct);
        Collections.shuffle(lithoElements, random);
        lithoElements.addAll(0, distinct);
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
        if (!mainCollection.isEmpty()) {
            mainCollection.clear();
            ClearCollections();
        }
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
