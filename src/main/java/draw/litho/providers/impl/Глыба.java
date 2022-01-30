package draw.litho.providers.impl;

import draw.litho.drawables.ILithoDrawable;
import draw.litho.drawables.impl.Mammock;
import draw.litho.providers.SimplePatternProvider;

public class Глыба extends SimplePatternProvider {
    @Override
    protected ILithoDrawable ProvideDrawable() {
        return new Mammock();
    }
}
