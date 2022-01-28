package draw.litho.providers.impl;

import draw.litho.drawables.ILithoDrawable;
import draw.litho.drawables.impl.Boulder;
import draw.litho.providers.SimplePatternProvider;

public class Валун extends SimplePatternProvider {
    public Валун(){
        Quantity = 2;
    }
    @Override
    protected ILithoDrawable ProvideDrawable() {
        return new Boulder();
    }
}
