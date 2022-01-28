package draw.litho.util;

public class RectangleNotImplementedException extends NullPointerException {
    public RectangleNotImplementedException(Class<?> classname) {
        super("Ты забыл проинициализировать поле `rectangle` в конструкторе класса " + classname.getTypeName() + "!!!");
    }
}
