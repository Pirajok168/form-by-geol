package draw.litho.providers.impl;

import draw.litho.drawables.ILithoDrawable;
import draw.litho.drawables.impl.Rubble;
import draw.litho.providers.SimplePatternProvider;

public class Щебень extends SimplePatternProvider {
    @Override
    protected ILithoDrawable ProvideDrawable() {
        return new Rubble();
    }
}
