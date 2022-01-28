package draw.litho.providers;

import draw.litho.drawables.ILithoDrawable;

import java.util.ArrayList;
import java.util.List;

public abstract class SimplePatternProvider implements ILithoPatternProvider {
    protected int Quantity = 5;

    protected abstract ILithoDrawable ProvideDrawable();

    @Override
    public List<ILithoDrawable> Provide() {
        var result = new ArrayList<ILithoDrawable>();
        for (int i = 0; i < this.Quantity; i++) {
            result.add(ProvideDrawable());
        }
        return result;
    }
}
