package View;

import data.FirstList;
import data.SecondList;

public class Single {
    private static Single instance;
    private static Model model = new Model();
    private static FirstList firstList = null;
    private static SecondList secondList = null;

    private Single(){ }


    public static SecondList getSecondList(){
        if (secondList == null){
            secondList = new SecondList();
        }
        return secondList;
    }

    public static FirstList getFirstList() {
        if (firstList==null){
            firstList = new FirstList();
        }
        return firstList;
    }
    public static Model getModelFirstList() {
        return model;
    }

    public static synchronized Single getInstance() {
        if (instance == null) {
            instance = new Single();
        }
        return instance;
    }
}

