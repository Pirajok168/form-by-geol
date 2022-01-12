package View;

public class Single {
    private static Single instance;
    private Model model = new Model();

    public Model getModelFirstList() {
        return model;
    }

    public static synchronized Single getInstance() {
        if (instance == null) {
            instance = new Single();
        }
        return instance;
    }
}