package draw.litho.providers.impl;

import draw.litho.drawables.ILithoDrawable;
import draw.litho.drawables.impl.Ice;
import draw.litho.providers.ILithoPatternProvider;

import java.util.ArrayList;
import java.util.List;

public class Лед implements ILithoPatternProvider {
    private int count = 5;

    public Лед() {
    }

    public Лед(int count) {
        this.count = count;
    }

    @Override
    public List<ILithoDrawable> Provide() {
        var result = new ArrayList<ILithoDrawable>();

        for (int i = 0; i < count; i++)
            result.add(new Ice());

        return result;
    }
}
