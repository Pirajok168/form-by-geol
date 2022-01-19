package data;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class FirstList {
    private String altitudeMark;
    private String azimuth;
    private String borehole;
    private String casingDepth;
    private String compositionRocks;
    private String coordinates;
    private String distanceFromTheMouth;
    private String distanceFromTheRiverbed;
    private String downUp;
    private String drillingDiameterM;
    private String drillingDiameterMM;
    private String drillingRig;
    private String end;
    private String flushing;
    private String fromTheLine;
    private String fromTheWell;
    private String geologist;
    private String groundFrom;
    private String groundFrom2;
    private String groundTo;
    private String groundTo2;
    private String line;
    private String passed;
    private String passedOrStopped;
    private String permafrostFrom;
    private String permafrostFrom2;
    private String permafrostTo;
    private String permafrostTo2;
    private String region;
    private String rightLeft;
    private String riverValley;
    private String start;
    private String surveyor;
    private String system;
    private String totalDepth;
    private String tributary;
    private String typeOfPlacer;
    private String waterLevel;
    private String waterLevelStop;
    private List<String> firstList = new ArrayList<String>();


    private String dressing;
    private String dressing10;
    private String dressing11;
    private String dressing12;
    private String dressing13;
    private String dressing14;
    private String dressing15;
    private String dressing16;
    private String dressing17;
    private String dressing2;
    private String dressing3;
    private String dressing4;
    private String dressing5;
    private String dressing6;
    private String dressing7;
    private String dressing8;
    private String dressing9;
    private String h_сh;
    private String h_сh10;
    private String h_сh11;
    private String h_сh12;
    private String h_сh13;
    private String h_сh14;
    private String h_сh15;
    private String h_сh16;
    private String h_сh17;
    private String h_сh18;
    private String h_сh2;
    private String h_сh3;
    private String h_сh4;
    private String h_сh5;
    private String h_сh6;
    private String h_сh7;
    private String h_сh8;
    private String h_сh9;
    private String limit;
    private String probaAi;
    private String content;
    private String dressing18;
    private List<String> firstListTable = new ArrayList<String>();
    public List<String> saveData = new ArrayList<>();
    public List<String> saveTable = new ArrayList<>();



    public FirstList(){

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("temp.txt"));
            while ((line = bufferedReader.readLine()) != null ){
                saveData.add(line);
            }
            bufferedReader.close();

            bufferedReader = new BufferedReader(new FileReader("temp2.txt"));
            while ((line = bufferedReader.readLine()) != null ){
                saveTable.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProbaAi() {
        return probaAi;
    }

    public String getContent() {
        return content;
    }

    public List<String> getTableSave(){
        List<String> list = Arrays.asList(
                probaAi,
                content,
                dressing,
                h_сh,
                dressing2,
                h_сh2,
                dressing3,
                h_сh3,
                dressing4,
                h_сh4,
                dressing5,
                h_сh5,
                dressing6,
                h_сh6,
                dressing7,
                h_сh7,
                dressing8,
                h_сh8,
                dressing9,
                h_сh9,
                dressing10,
                h_сh10,
                dressing11,
                h_сh11,
                dressing12,
                h_сh12,
                dressing13,
                h_сh13,
                dressing14,
                h_сh14,
                dressing15,
                h_сh15,
                limit,
                dressing16,
                h_сh16,
                dressing17,
                h_сh17,
                dressing18,
                h_сh18
        );
        return list;
    }

    public  List<String> getFirstListTable(boolean download){
        if (!firstListTable.isEmpty()){
            firstListTable.clear();
        }
        firstListTable.add(dressing);
        firstListTable.add(h_сh);
        firstListTable.add(dressing2);
        firstListTable.add(h_сh2);
        firstListTable.add(dressing3);
        firstListTable.add(h_сh3);
        firstListTable.add(dressing4);
        firstListTable.add(h_сh4);
        firstListTable.add(dressing5);
        firstListTable.add(h_сh5);
        firstListTable.add(dressing6);
        firstListTable.add(h_сh6);
        firstListTable.add(dressing7);
        firstListTable.add(h_сh7);
        firstListTable.add(dressing8);
        firstListTable.add(h_сh8);
        firstListTable.add(dressing9);
        firstListTable.add(h_сh9);
        firstListTable.add(dressing10);
        firstListTable.add(h_сh10);
        firstListTable.add(dressing11);
        firstListTable.add(h_сh11);
        firstListTable.add(dressing12);
        firstListTable.add(h_сh12);
        firstListTable.add(dressing13);
        firstListTable.add(h_сh13);
        firstListTable.add(dressing14);
        firstListTable.add(h_сh14);
        firstListTable.add(dressing15);
        firstListTable.add(h_сh15);
        firstListTable.add(dressing16);
        firstListTable.add(h_сh16);
        firstListTable.add(dressing17);
        firstListTable.add(h_сh17);
        firstListTable.add(dressing18);
        firstListTable.add(h_сh18);
        return firstListTable;
    }

    public List<String> getFirstListForSave(){
        List<String> list = Arrays.asList(
                region,
                riverValley,
                tributary,
                system,
                typeOfPlacer,
                line,
                distanceFromTheMouth,
                fromTheLine,
                downUp,
                azimuth,
                borehole,
                distanceFromTheRiverbed,
                fromTheWell,
                rightLeft,
                start,
                end,
                altitudeMark,
                coordinates,
                permafrostFrom,
                permafrostTo,
                permafrostFrom2,
                permafrostTo2,
                groundFrom,
                groundTo,
                groundFrom2,
                groundTo2,
                totalDepth,
                casingDepth,
                compositionRocks,
                passed,
                passedOrStopped,
                waterLevel,
                waterLevelStop,
                drillingDiameterM,
                drillingDiameterMM,
                drillingRig,
                flushing,
                geologist,
                surveyor
        );
        return list;
    }

    public  List<String> getFirstList(boolean download) {
       if (!firstList.isEmpty()){
           firstList.clear();
       }
        firstList.add(region);
        firstList.add(riverValley);
        firstList.add(tributary);
        firstList.add(system);
        firstList.add(typeOfPlacer);
        firstList.add(line);
        firstList.add(distanceFromTheMouth);
        firstList.add(fromTheLine);
        firstList.add(downUp);
        firstList.add(azimuth);
        firstList.add(borehole);
        firstList.add(distanceFromTheRiverbed);
        firstList.add(fromTheWell);
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

        return firstList;
    }

    public String getAltitudeMark() {
        return altitudeMark;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDressing18(String dressing18) {
        this.dressing18 = dressing18;
    }

    public void setAltitudeMark(String altitudeMark) {
        this.altitudeMark = altitudeMark;
    }

    public String getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(String azimuth) {
        this.azimuth = azimuth;
    }

    public String getBorehole() {
        return borehole;
    }

    public void setBorehole(String borehole) {
        this.borehole = borehole;
    }

    public String getCasingDepth() {
        return casingDepth;
    }

    public void setCasingDepth(String casingDepth) {
        this.casingDepth = casingDepth;
    }

    public String getCompositionRocks() {
        return compositionRocks;
    }

    public void setCompositionRocks(String compositionRocks) {
        this.compositionRocks = compositionRocks;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getDistanceFromTheMouth() {
        return distanceFromTheMouth;
    }

    public void setDistanceFromTheMouth(String distanceFromTheMouth) {
        this.distanceFromTheMouth = distanceFromTheMouth;
    }

    public String getDistanceFromTheRiverbed() {
        return distanceFromTheRiverbed;
    }

    public void setDistanceFromTheRiverbed(String distanceFromTheRiverbed) {
        this.distanceFromTheRiverbed = distanceFromTheRiverbed;
    }

    public String getDownUp() {
        return downUp;
    }

    public void setDownUp(String downUp) {
        this.downUp = downUp;
    }

    public String getDrillingDiameterM() {
        return drillingDiameterM;
    }

    public void setDrillingDiameterM(String drillingDiameterM) {
        this.drillingDiameterM = drillingDiameterM;
    }

    public String getDrillingDiameterMM() {
        return drillingDiameterMM;
    }

    public void setDrillingDiameterMM(String drillingDiameterMM) {
        this.drillingDiameterMM = drillingDiameterMM;
    }

    public String getDrillingRig() {
        return drillingRig;
    }

    public void setDrillingRig(String drillingRig) {
        this.drillingRig = drillingRig;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getFlushing() {
        return flushing;
    }

    public void setFlushing(String flushing) {
        this.flushing = flushing;
    }

    public String getFromTheLine() {
        return fromTheLine;
    }

    public void setFromTheLine(String fromTheLine) {
        this.fromTheLine = fromTheLine;
    }

    public String getFromTheWell() {
        return fromTheWell;
    }

    public void setFromTheWell(String fromTheWell) {
        this.fromTheWell = fromTheWell;
    }

    public String getGeologist() {
        return geologist;
    }

    public void setGeologist(String geologist) {
        this.geologist = geologist;
    }

    public String getGroundFrom() {
        return groundFrom;
    }

    public void setGroundFrom(String groundFrom) {
        this.groundFrom = groundFrom;
    }

    public String getGroundFrom2() {
        return groundFrom2;
    }

    public void setGroundFrom2(String groundFrom2) {
        this.groundFrom2 = groundFrom2;
    }

    public String getGroundTo() {
        return groundTo;
    }

    public void setGroundTo(String groundTo) {
        this.groundTo = groundTo;
    }

    public String getGroundTo2() {
        return groundTo2;
    }

    public void setGroundTo2(String groundTo2) {
        this.groundTo2 = groundTo2;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getPassed() {
        return passed;
    }

    public void setPassed(String passed) {
        this.passed = passed;
    }

    public String getPassedOrStopped() {
        return passedOrStopped;
    }

    public void setPassedOrStopped(String passedOrStopped) {
        this.passedOrStopped = passedOrStopped;
    }

    public String getPermafrostFrom() {
        return permafrostFrom;
    }

    public void setPermafrostFrom(String permafrostFrom) {
        this.permafrostFrom = permafrostFrom;
    }

    public String getPermafrostFrom2() {
        return permafrostFrom2;
    }

    public void setPermafrostFrom2(String permafrostFrom2) {
        this.permafrostFrom2 = permafrostFrom2;
    }

    public String getPermafrostTo() {
        return permafrostTo;
    }

    public void setPermafrostTo(String permafrostTo) {
        this.permafrostTo = permafrostTo;
    }

    public String getPermafrostTo2() {
        return permafrostTo2;
    }

    public void setPermafrostTo2(String permafrostTo2) {
        this.permafrostTo2 = permafrostTo2;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRightLeft() {
        return rightLeft;
    }

    public void setRightLeft(String rightLeft) {
        this.rightLeft = rightLeft;
    }

    public String getRiverValley() {
        return riverValley;
    }

    public void setRiverValley(String riverValley) {
        this.riverValley = riverValley;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getSurveyor() {
        return surveyor;
    }

    public void setSurveyor(String surveyor) {
        this.surveyor = surveyor;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getTotalDepth() {
        return totalDepth;
    }

    public void setTotalDepth(String totalDepth) {
        this.totalDepth = totalDepth;
    }

    public String getTributary() {
        return tributary;
    }

    public void setTributary(String tributary) {
        this.tributary = tributary;
    }

    public String getTypeOfPlacer() {
        return typeOfPlacer;
    }

    public void setTypeOfPlacer(String typeOfPlacer) {
        this.typeOfPlacer = typeOfPlacer;
    }

    public String getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(String waterLevel) {
        this.waterLevel = waterLevel;
    }

    public String getWaterLevelStop() {
        return waterLevelStop;
    }

    public void setWaterLevelStop(String waterLevelStop) {
        this.waterLevelStop = waterLevelStop;
    }

    public void setFirstList(List<String> firstList) {
        this.firstList = firstList;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    public void setDressing10(String dressing10) {
        this.dressing10 = dressing10;
    }

    public void setDressing11(String dressing11) {
        this.dressing11 = dressing11;
    }

    public void setDressing12(String dressing12) {
        this.dressing12 = dressing12;
    }

    public void setDressing13(String dressing13) {
        this.dressing13 = dressing13;
    }

    public void setDressing14(String dressing14) {
        this.dressing14 = dressing14;
    }

    public void setDressing15(String dressing15) {
        this.dressing15 = dressing15;
    }

    public void setDressing16(String dressing16) {
        this.dressing16 = dressing16;
    }

    public void setDressing17(String dressing17) {
        this.dressing17 = dressing17;
    }

    public void setDressing2(String dressing2) {
        this.dressing2 = dressing2;
    }

    public void setDressing3(String dressing3) {
        this.dressing3 = dressing3;
    }

    public void setDressing4(String dressing4) {
        this.dressing4 = dressing4;
    }

    public void setDressing5(String dressing5) {
        this.dressing5 = dressing5;
    }

    public void setDressing6(String dressing6) {
        this.dressing6 = dressing6;
    }

    public void setDressing7(String dressing7) {
        this.dressing7 = dressing7;
    }

    public void setDressing8(String dressing8) {
        this.dressing8 = dressing8;
    }

    public void setDressing9(String dressing9) {
        this.dressing9 = dressing9;
    }

    public void setH_сh(String h_сh) {
        this.h_сh = h_сh;
    }

    public void setH_сh10(String h_сh10) {
        this.h_сh10 = h_сh10;
    }

    public void setH_сh11(String h_сh11) {
        this.h_сh11 = h_сh11;
    }

    public void setH_сh12(String h_сh12) {
        this.h_сh12 = h_сh12;
    }

    public void setH_сh13(String h_сh13) {
        this.h_сh13 = h_сh13;
    }

    public void setH_сh14(String h_сh14) {
        this.h_сh14 = h_сh14;
    }

    public void setH_сh15(String h_сh15) {
        this.h_сh15 = h_сh15;
    }

    public void setH_сh16(String h_сh16) {
        this.h_сh16 = h_сh16;
    }

    public void setH_сh17(String h_сh17) {
        this.h_сh17 = h_сh17;
    }

    public void setH_сh18(String h_сh18) {
        this.h_сh18 = h_сh18;
    }

    public void setH_сh2(String h_сh2) {
        this.h_сh2 = h_сh2;
    }

    public void setH_сh3(String h_сh3) {
        this.h_сh3 = h_сh3;
    }

    public void setH_сh4(String h_сh4) {
        this.h_сh4 = h_сh4;
    }

    public void setH_сh5(String h_сh5) {
        this.h_сh5 = h_сh5;
    }

    public void setH_сh6(String h_сh6) {
        this.h_сh6 = h_сh6;
    }

    public void setH_сh7(String h_сh7) {
        this.h_сh7 = h_сh7;
    }

    public void setH_сh8(String h_сh8) {
        this.h_сh8 = h_сh8;
    }

    public void setH_сh9(String h_сh9) {
        this.h_сh9 = h_сh9;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getLimit() {
        return limit;
    }

    public void setProbaAi(String probaAi) {
        this.probaAi = probaAi;
    }
}
