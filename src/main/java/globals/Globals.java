package globals;

import data.FirstList;
import data.FourthList;
import data.SecondList;
import data.entities.Borehole;
import data.entities.DrillingLine;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ObjectPropertyBase;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

@Getter
@Setter
public class Globals {
    //region Singleton
    private static Globals instance;

    private Globals(){ }

   public static synchronized Globals instance() {
        if (instance == null)
            instance = new Globals();
        return instance;
    }
    //endregion

    private Borehole currentBorehole;

    //region todo временное решение listener от выбранной скважины. Нужен чтобы интерфейс обновлялся динамически
    private Set<Consumer<Borehole>> listeners = new HashSet<>();

    public void addBoreholeListener(Consumer<Borehole> boreholeConsumer){
        listeners.add(boreholeConsumer);
    }

    public void setCurrentBorehole(Borehole currentBorehole) {
        this.currentBorehole = currentBorehole;
        listeners.forEach(boreholeConsumer -> boreholeConsumer.accept(currentBorehole));
    }
    //endregion

    //region todo Даня, почисти проект от этого
    public static FourthList getFourthList() {
        return  new FourthList();
    }

    public static FirstList getFirstList() {
        return new FirstList();
    }

    public static SecondList getSecondList() {
        return new SecondList();
    }
    //endregion
}

