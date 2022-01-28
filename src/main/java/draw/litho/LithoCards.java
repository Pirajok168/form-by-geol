package draw.litho;

import draw.litho.providers.ILithoPatternProvider;
import draw.litho.util.EventTypes;
import javafx.scene.canvas.Canvas;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

public class LithoCards extends LithoCardsCore {
    Set<Class<? extends ILithoPatternProvider>> SelectedLithoProviders = new HashSet<>();


    public void Update(Class<? extends ILithoPatternProvider> lithoProviderClass, @NotNull EventTypes eventType) {
        switch (eventType) {
            case Add -> SelectedLithoProviders.add(lithoProviderClass);
            case Remove -> SelectedLithoProviders.remove(lithoProviderClass);
        }
        try {
            Clear();
            for (var lithoProvider : SelectedLithoProviders)
                Add(lithoProvider.getDeclaredConstructor().newInstance());
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException ex) {
            ex.printStackTrace();
        }
    }

    public void UpdateAndDraw(Canvas canvas, Class<? extends ILithoPatternProvider> lithoProviderClass, EventTypes eventType){
        Clear(canvas);
        Update(lithoProviderClass, eventType);
        Draw(canvas);
    }
}
