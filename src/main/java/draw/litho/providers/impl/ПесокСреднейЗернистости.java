package draw.litho.providers.impl;

import draw.litho.drawables.ILithoDrawable;
import draw.litho.drawables.impl.SandMediumLabel;
import draw.litho.drawables.impl.SandMediumParticle;
import draw.litho.providers.ILithoPatternProvider;

import java.util.ArrayList;
import java.util.List;

public class ПесокСреднейЗернистости implements ILithoPatternProvider {

    private int count = 10;

    public ПесокСреднейЗернистости() {
    }
    public ПесокСреднейЗернистости(int count) {
        this.count = count;
    }

    @Override
    public List<ILithoDrawable> Provide() {
        var result = new ArrayList<ILithoDrawable>(List.of(new SandMediumLabel()));

        for (int i = 0; i < count; i++)
            result.add(new SandMediumParticle());

        return result;
    }
}
