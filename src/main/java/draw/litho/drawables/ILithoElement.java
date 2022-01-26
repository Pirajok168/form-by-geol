package draw.litho.drawables;

import java.awt.*;

public interface ILithoElement extends ILithoDrawable {
    void setPoint(Point point);
    Rectangle getRect();
}
