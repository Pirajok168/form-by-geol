package draw.litho.providers.impl;

import draw.litho.drawables.ILithoDrawable;
import draw.litho.drawables.impl.Silt;
import draw.litho.providers.ILithoPatternProvider;

import java.util.ArrayList;
import java.util.List;

public class Ил implements ILithoPatternProvider {

    private int count = 5;

    public Ил() {
    }

    public Ил(int count) {
        this.count = count;
    }

    @Override
    public List<ILithoDrawable> Provide() {
        var result = new ArrayList<ILithoDrawable>();
        for (int i = 0; i < count; i++) {
            result.add(new Silt());
        }

        return result;
    }
}
