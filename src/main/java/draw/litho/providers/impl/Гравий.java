package draw.litho.providers.impl;

import draw.litho.drawables.ILithoDrawable;
import draw.litho.drawables.impl.Gravel;
import draw.litho.providers.SimplePatternProvider;

public class Гравий extends SimplePatternProvider{
    @Override
    protected ILithoDrawable ProvideDrawable() {
        return new Gravel();
    }
}