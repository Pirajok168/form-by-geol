package draw.litho.providers.impl;

import draw.litho.drawables.ILithoDrawable;
import draw.litho.drawables.impl.Slates;
import draw.litho.providers.SimplePatternProvider;

public class Сланцы extends SimplePatternProvider {

    public Сланцы() {
        Quantity = 1;
    }

    @Override
    protected ILithoDrawable ProvideDrawable() {
        return new Slates();
    }
}
