package View;

public class Single {
    private static Single instance;
    private ModelFirstList modelFirstList = new ModelFirstList();

    public ModelFirstList getModelFirstList() {
        return modelFirstList;
    }

    public static synchronized Single getInstance() {
        if (instance == null) {
            instance = new Single();
        }
        return instance;
    }
}