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
    private String h_??h;
    private String h_??h10;
    private String h_??h11;
    private String h_??h12;
    private String h_??h13;
    private String h_??h14;
    private String h_??h15;
    private String h_??h16;
    private String h_??h17;
    private String h_??h18;
    private String h_??h2;
    private String h_??h3;
    private String h_??h4;
    private String h_??h5;
    private String h_??h6;
    private String h_??h7;
    private String h_??h8;
    private String h_??h9;
    private String limit;
    private String probaAi;
    private String content;
    private String dressing18;
    private List<String> firstListTable = new ArrayList<String>();




    public FirstList(){

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("temp.txt"));
            String line="";

            line = bufferedReader.readLine();
            region=line;
            line = bufferedReader.readLine();
            riverValley=line;
            line = bufferedReader.readLine();
            tributary=line;
            line = bufferedReader.readLine();
            system=line;
            line = bufferedReader.readLine();
            typeOfPlacer=line;
            line = bufferedReader.readLine();
            this.line=line;
            line = bufferedReader.readLine();
            distanceFromTheMouth=line;
            line = bufferedReader.readLine();
            fromTheLine=line;
            line = bufferedReader.readLine();
            downUp=line;
            line = bufferedReader.readLine();
            azimuth=line;
            line = bufferedReader.readLine();
            borehole=line;
            line = bufferedReader.readLine();
            distanceFromTheRiverbed=line;
            line = bufferedReader.readLine();
            fromTheWell=line;
            line = bufferedReader.readLine();
            rightLeft=line;
            line = bufferedReader.readLine();
            start=line;
            line = bufferedReader.readLine();
            end=line;
            line = bufferedReader.readLine();
            altitudeMark=line;
            line = bufferedReader.readLine();
            coordinates=line;
            line = bufferedReader.readLine();
            permafrostFrom=line;
            line = bufferedReader.readLine();
            permafrostTo=line;
            line = bufferedReader.readLine();
            permafrostFrom2=line;
            line = bufferedReader.readLine();
            permafrostTo2=line;
            line = bufferedReader.readLine();
            groundFrom=line;
            line = bufferedReader.readLine();
            groundTo=line;
            line = bufferedReader.readLine();
            groundFrom2=line;
            line = bufferedReader.readLine();
            groundTo2=line;
            line = bufferedReader.readLine();
            totalDepth=line;
            line = bufferedReader.readLine();
            casingDepth=line;
            line = bufferedReader.readLine();
            compositionRocks=line;
            line = bufferedReader.readLine();
            passed=line;
            line = bufferedReader.readLine();
            passedOrStopped=line;
            line = bufferedReader.readLine();
            waterLevel=line;
            line = bufferedReader.readLine();
            waterLevelStop=line;
            line = bufferedReader.readLine();
            drillingDiameterM=line;
            line = bufferedReader.readLine();
            drillingDiameterMM=line;
            line = bufferedReader.readLine();
            drillingRig=line;
            line = bufferedReader.readLine();
            flushing=line;
            line = bufferedReader.readLine();
            geologist=line;
            line = bufferedReader.readLine();
            surveyor=line;
            bufferedReader.close();



            bufferedReader = new BufferedReader(new FileReader("temp2.txt"));
            line = bufferedReader.readLine();
            probaAi=line;
            line = bufferedReader.readLine();
            content=line;
            line = bufferedReader.readLine();
            dressing=line;
            line = bufferedReader.readLine();
            h_??h=line;
            line = bufferedReader.readLine();
            dressing2=line;
            line = bufferedReader.readLine();
            h_??h2=line;
            line = bufferedReader.readLine();
            dressing3=line;
            line = bufferedReader.readLine();
            h_??h3=line;
            line = bufferedReader.readLine();
            dressing4=line;
            line = bufferedReader.readLine();
            h_??h4=line;
            line = bufferedReader.readLine();
            dressing5=line;
            line = bufferedReader.readLine();
            h_??h5=line;
            line = bufferedReader.readLine();
            dressing6=line;
            line = bufferedReader.readLine();
            h_??h6=line;
            line = bufferedReader.readLine();
            dressing7=line;
            line = bufferedReader.readLine();
            h_??h7=line;
            line = bufferedReader.readLine();
            dressing8=line;
            line = bufferedReader.readLine();
            h_??h8=line;
            line = bufferedReader.readLine();
            dressing9=line;
            line = bufferedReader.readLine();
            h_??h9=line;
            line = bufferedReader.readLine();
            dressing10=line;
            line = bufferedReader.readLine();
            h_??h10=line;
            line = bufferedReader.readLine();
            dressing11=line;
            line = bufferedReader.readLine();
            h_??h11=line;
            line = bufferedReader.readLine();
            dressing12=line;
            line = bufferedReader.readLine();
            h_??h12=line;
            line = bufferedReader.readLine();
            dressing13=line;
            line = bufferedReader.readLine();
            h_??h13=line;
            line = bufferedReader.readLine();
            dressing14=line;
            line = bufferedReader.readLine();
            h_??h14=line;
            line = bufferedReader.readLine();
            dressing15=line;
            line = bufferedReader.readLine();
            h_??h15=line;
            line = bufferedReader.readLine();
            limit=line;
            line = bufferedReader.readLine();
            dressing16=line;
            line = bufferedReader.readLine();
            h_??h16=line;
            line = bufferedReader.readLine();
            dressing17=line;
            line = bufferedReader.readLine();
            h_??h17=line;
            line = bufferedReader.readLine();
            dressing18=line;
            line = bufferedReader.readLine();
            h_??h18=line;
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
                h_??h,
                dressing2,
                h_??h2,
                dressing3,
                h_??h3,
                dressing4,
                h_??h4,
                dressing5,
                h_??h5,
                dressing6,
                h_??h6,
                dressing7,
                h_??h7,
                dressing8,
                h_??h8,
                dressing9,
                h_??h9,
                dressing10,
                h_??h10,
                dressing11,
                h_??h11,
                dressing12,
                h_??h12,
                dressing13,
                h_??h13,
                dressing14,
                h_??h14,
                dressing15,
                h_??h15,
                limit,
                dressing16,
                h_??h16,
                dressing17,
                h_??h17,
                dressing18,
                h_??h18
        );
        return list;
    }

    public String getDressing() {
        return dressing;
    }

    public String getDressing10() {
        return dressing10;
    }

    public String getDressing11() {
        return dressing11;
    }

    public String getDressing12() {
        return dressing12;
    }

    public String getDressing13() {
        return dressing13;
    }

    public String getDressing14() {
        return dressing14;
    }

    public String getDressing15() {
        return dressing15;
    }

    public String getDressing16() {
        return dressing16;
    }

    public String getDressing17() {
        return dressing17;
    }

    public String getDressing2() {
        return dressing2;
    }

    public String getDressing3() {
        return dressing3;
    }

    public String getDressing4() {
        return dressing4;
    }

    public String getDressing5() {
        return dressing5;
    }

    public String getDressing6() {
        return dressing6;
    }

    public String getDressing7() {
        return dressing7;
    }

    public String getDressing8() {
        return dressing8;
    }

    public String getDressing9() {
        return dressing9;
    }

    public String getH_??h() {
        return h_??h;
    }

    public String getH_??h10() {
        return h_??h10;
    }

    public String getH_??h11() {
        return h_??h11;
    }

    public String getH_??h12() {
        return h_??h12;
    }

    public String getH_??h13() {
        return h_??h13;
    }

    public String getH_??h14() {
        return h_??h14;
    }

    public String getH_??h15() {
        return h_??h15;
    }

    public String getH_??h16() {
        return h_??h16;
    }

    public String getH_??h17() {
        return h_??h17;
    }

    public String getH_??h18() {
        return h_??h18;
    }

    public String getH_??h2() {
        return h_??h2;
    }

    public String getH_??h3() {
        return h_??h3;
    }

    public String getH_??h4() {
        return h_??h4;
    }

    public String getH_??h5() {
        return h_??h5;
    }

    public String getH_??h6() {
        return h_??h6;
    }

    public String getH_??h7() {
        return h_??h7;
    }

    public String getH_??h8() {
        return h_??h8;
    }

    public String getH_??h9() {
        return h_??h9;
    }

    public String getDressing18() {
        return dressing18;
    }

    public  List<String> getFirstListTable(boolean download){
        if (!firstListTable.isEmpty()){
            firstListTable.clear();
        }
        firstListTable.add(dressing);
        firstListTable.add(h_??h);
        firstListTable.add(dressing2);
        firstListTable.add(h_??h2);
        firstListTable.add(dressing3);
        firstListTable.add(h_??h3);
        firstListTable.add(dressing4);
        firstListTable.add(h_??h4);
        firstListTable.add(dressing5);
        firstListTable.add(h_??h5);
        firstListTable.add(dressing6);
        firstListTable.add(h_??h6);
        firstListTable.add(dressing7);
        firstListTable.add(h_??h7);
        firstListTable.add(dressing8);
        firstListTable.add(h_??h8);
        firstListTable.add(dressing9);
        firstListTable.add(h_??h9);
        firstListTable.add(dressing10);
        firstListTable.add(h_??h10);
        firstListTable.add(dressing11);
        firstListTable.add(h_??h11);
        firstListTable.add(dressing12);
        firstListTable.add(h_??h12);
        firstListTable.add(dressing13);
        firstListTable.add(h_??h13);
        firstListTable.add(dressing14);
        firstListTable.add(h_??h14);
        firstListTable.add(dressing15);
        firstListTable.add(h_??h15);
        firstListTable.add(dressing16);
        firstListTable.add(h_??h16);
        firstListTable.add(dressing17);
        firstListTable.add(h_??h17);
        firstListTable.add(dressing18);
        firstListTable.add(h_??h18);
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

    public void setH_??h(String h_??h) {
        this.h_??h = h_??h;
    }

    public void setH_??h10(String h_??h10) {
        this.h_??h10 = h_??h10;
    }

    public void setH_??h11(String h_??h11) {
        this.h_??h11 = h_??h11;
    }

    public void setH_??h12(String h_??h12) {
        this.h_??h12 = h_??h12;
    }

    public void setH_??h13(String h_??h13) {
        this.h_??h13 = h_??h13;
    }

    public void setH_??h14(String h_??h14) {
        this.h_??h14 = h_??h14;
    }

    public void setH_??h15(String h_??h15) {
        this.h_??h15 = h_??h15;
    }

    public void setH_??h16(String h_??h16) {
        this.h_??h16 = h_??h16;
    }

    public void setH_??h17(String h_??h17) {
        this.h_??h17 = h_??h17;
    }

    public void setH_??h18(String h_??h18) {
        this.h_??h18 = h_??h18;
    }

    public void setH_??h2(String h_??h2) {
        this.h_??h2 = h_??h2;
    }

    public void setH_??h3(String h_??h3) {
        this.h_??h3 = h_??h3;
    }

    public void setH_??h4(String h_??h4) {
        this.h_??h4 = h_??h4;
    }

    public void setH_??h5(String h_??h5) {
        this.h_??h5 = h_??h5;
    }

    public void setH_??h6(String h_??h6) {
        this.h_??h6 = h_??h6;
    }

    public void setH_??h7(String h_??h7) {
        this.h_??h7 = h_??h7;
    }

    public void setH_??h8(String h_??h8) {
        this.h_??h8 = h_??h8;
    }

    public void setH_??h9(String h_??h9) {
        this.h_??h9 = h_??h9;
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
