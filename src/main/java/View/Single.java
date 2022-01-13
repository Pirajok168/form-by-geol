package View;

import data.FirstList;

public class Single {
    private static Single instance;
    private Model model = new Model();
    private static FirstList firstList = null;


    public static FirstList getFirstList() {
        if (firstList==null){
            firstList = new FirstList();
        }
        return firstList;
    }
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