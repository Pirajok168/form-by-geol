package draw.litho.providers.impl;

import draw.litho.drawables.ILithoDrawable;
import draw.litho.drawables.impl.Granite;
import draw.litho.providers.SimplePatternProvider;

public class Гранит extends SimplePatternProvider {
    @Override
    protected ILithoDrawable ProvideDrawable() {
        return new Granite();
    }
}
