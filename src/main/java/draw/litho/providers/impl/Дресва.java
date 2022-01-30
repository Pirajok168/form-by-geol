package draw.litho.providers.impl;

import draw.litho.drawables.ILithoDrawable;
import draw.litho.drawables.impl.Rubbish;
import draw.litho.providers.SimplePatternProvider;

public class Дресва extends SimplePatternProvider {
    @Override
    protected ILithoDrawable ProvideDrawable() {
        return new Rubbish();
    }
}
