package draw.litho.providers.impl;

import draw.litho.drawables.ILithoDrawable;
import draw.litho.drawables.impl.Gravel;
import draw.litho.drawables.impl.Pebble;
import draw.litho.providers.SimplePatternProvider;

public class Галька extends SimplePatternProvider {
    @Override
    protected ILithoDrawable ProvideDrawable() {
        return new Pebble();
    }
}
