package draw.litho.providers.impl;

import draw.litho.drawables.ILithoDrawable;
import draw.litho.drawables.impl.Waste;
import draw.litho.providers.ILithoPatternProvider;

import java.util.List;

public class Отработки implements ILithoPatternProvider {
    @Override
    public List<ILithoDrawable> Provide() {
        return List.of(new Waste());
    }
}
