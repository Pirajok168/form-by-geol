package View;

import java.util.ArrayList;
import java.util.List;

public class Model {

    public  List<String> firstList = new ArrayList<String>();
    public  List<String> firstListTable = new ArrayList<String>();
    public  List<String> secondListTable = new ArrayList<String>();


    public void setDataFirstList(
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
        firstList.add(region);
        firstList.add(riverValley);
        firstList.add(tributary);
        firstList.add(system);
        firstList.add(typeOfPlacer);
        firstList.add(line);
        firstList.add(distanceFromTheMouth);
        firstList.add(fromTheLine);
        firstList.add(downUp);
        firstList.add(drillingDiameterM);
        firstList.add(azimuth);
        firstList.add(borehole);
        firstList.add(distanceFromTheRiverbed);
        firstList.add(rightLeft);
        firstList.add(start);
        firstList.add(end);
        firstList.add(altitudeMark);
        firstList.add(coordinates);
        firstList.add(permafrostFrom);
        firstList.add(permafrostTo);
        firstList.add(permafrostFrom2);
        firstList.add(permafrostTo2);
        firstList.add(groundFrom);
        firstList.add(groundTo);
        firstList.add(groundFrom2);
        firstList.add(groundTo2);
        firstList.add(totalDepth);
        firstList.add(casingDepth);
        firstList.add(compositionRocks);
        firstList.add(passed);
        firstList.add(passedOrStopped);
        firstList.add(waterLevel);
        firstList.add(waterLevelStop);
        firstList.add(drillingDiameterM);
        firstList.add(drillingDiameterMM);
        firstList.add(drillingRig);
        firstList.add(flushing);
        firstList.add(geologist);
        firstList.add(surveyor);
    }

    public void setDataSecondList(
                                String dressing, String dressing10, String dressing11,
                                  String dressing12, String dressing13, String dressing14, String dressing15,
                                  String dressing16, String dressing17, String dressing2, String dressing3,
                                  String dressing4, String dressing5, String dressing6, String dressing7,
                                  String dressing8, String dressing9,  String h_??h,
                                  String h_??h10, String h_??h11, String h_??h12, String h_??h13,
                                  String h_??h14, String h_??h15, String h_??h16, String h_??h17, String h_??h18,
                                  String h_??h2, String h_??h3, String h_??h4, String h_??h5, String h_??h6,
                                  String h_??h7, String h_??h8, String h_??h9, String limit, String probaAi) {

        firstListTable.add(dressing);
        firstListTable.add(dressing10);
        firstListTable.add(dressing11);
        firstListTable.add(dressing12);
        firstListTable.add(dressing13);
        firstListTable.add(dressing14);
        firstListTable.add(dressing15);
        firstListTable.add(dressing16);
        firstListTable.add(dressing17);
        firstListTable.add(dressing2);
        firstListTable.add(dressing3);
        firstListTable.add(dressing4);
        firstListTable.add(dressing5);
        firstListTable.add(dressing6);
        firstListTable.add(dressing7);
        firstListTable.add(dressing8);
        firstListTable.add(dressing9);
        firstListTable.add(h_??h);
        firstListTable.add(h_??h10);
        firstListTable.add(h_??h11);
        firstListTable.add(h_??h12);
        firstListTable.add(h_??h13);
        firstListTable.add(h_??h14);
        firstListTable.add(h_??h15);
        firstListTable.add(h_??h16);
        firstListTable.add(h_??h17);
        firstListTable.add(h_??h18);
        firstListTable.add(h_??h2);
        firstListTable.add(h_??h3);
        firstListTable.add(h_??h4);
        firstListTable.add(h_??h5);
        firstListTable.add(h_??h6);
        firstListTable.add(h_??h7);
        firstListTable.add(h_??h8);
        firstListTable.add(h_??h9);
        firstListTable.add(limit);
        firstListTable.add(probaAi);
    }


    public void setDataThirdController(String _1, String _10, String _11, String _12, String _13, String _14,
                                       String _15, String _16, String _17, String _2, String _3, String _4, String _5,
                                       String _6, String _7, String _8, String _9){
        secondListTable.add(_1);
        secondListTable.add(_10);
        secondListTable.add(_11);
        secondListTable.add(_12);
        secondListTable.add(_13);
        secondListTable.add(_14);
        secondListTable.add(_15);
        secondListTable.add(_16);
        secondListTable.add(_17);
        secondListTable.add(_2);
        secondListTable.add(_3);
        secondListTable.add(_4);
        secondListTable.add(_5);
        secondListTable.add(_6);
        secondListTable.add(_7);
        secondListTable.add(_8);
        secondListTable.add(_9);
    }
}

