import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class ModelFirstList {

    public  List<String> list = new ArrayList<String>();


    public ModelFirstList(){

    }

    public String surveyor;

    public void setData(
            String altitudeMark, String azimuth, String borehole, String casingDepth,
            String compositionRocks, String coordinates, String distanceFromTheMouth,
            String distanceFromTheRiverbed, String downUp,
            String drillingDiameterM, String drillingDiameterMM, String drillingRig, String end,
            String flushing, String fromTheLine, String fromTheWell, String geologist, String groundFrom,
            String groundFrom2, String groundTo, String groundTo2, String line, String passed,
            String passedOrStopped, String permafrostFrom, String permafrostFrom2, String permafrostTo,
            String permafrostTo2, String region, String rightLeft, String riverValley, String start,
            String surveyor, String system, String totalDepth, String tributary, String typeOfPlacer,
            String waterLevel, String waterLevelStop){
        this.surveyor =surveyor;
        list.add(region);
        list.add(riverValley);
        list.add(tributary);
        list.add(system);
        list.add(typeOfPlacer);
        list.add(line);
        list.add(distanceFromTheMouth);
        list.add(fromTheLine);
        list.add(downUp);
        list.add(drillingDiameterM);
        list.add(azimuth);
        list.add(borehole);
        list.add(distanceFromTheRiverbed);
        list.add(fromTheWell);
        list.add(rightLeft);
        list.add(start);
        list.add(end);
        list.add(altitudeMark);
        list.add(coordinates);
        list.add(permafrostFrom);
        list.add(permafrostTo);
        list.add(permafrostFrom2);
        list.add(permafrostTo2);
        list.add(groundFrom);
        list.add(groundTo);
        list.add(groundFrom2);
        list.add(groundTo2);
        list.add(totalDepth);
        list.add(casingDepth);
        list.add(compositionRocks);
        list.add(passed);
        list.add(passedOrStopped);
        list.add(waterLevel);
        list.add(waterLevelStop);
        list.add(drillingDiameterM);
        list.add(drillingDiameterMM);
        list.add(drillingRig);
        list.add(flushing);
        list.add(geologist);
        list.add(surveyor);
    }
}
