package draw.litho.providers;

import draw.litho.drawables.ILithoDrawable;

import java.util.List;

public interface ILithoPatternProvider {
    List<ILithoDrawable> Provide();
}
