package controller;

import View.Model;
import View.Single;
import data.FirstList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.util.List;
import java.util.Objects;

public class FirstListController {
    @FXML
    private TextField altitudeMark;

    @FXML
    private TextField azimuth;

    @FXML
    private TextField borehole;

    @FXML
    private Button btn;

    @FXML
    private TextField casingDepth;

    @FXML
    private TextField compositionRocks;

    @FXML
    private VBox container;

    @FXML
    private TextField coordinates;

    @FXML
    private TextField distanceFromTheMouth;

    @FXML
    private TextField distanceFromTheRiverbed;

    @FXML
    private TextField downUp;

    @FXML
    private TextField drillingDiameterM;

    @FXML
    private TextField drillingDiameterMM;

    @FXML
    private TextField drillingRig;

    @FXML
    private TextField end;

    @FXML
    private TextField flushing;

    @FXML
    private TextField fromTheLine;

    @FXML
    private TextField fromTheWell;

    @FXML
    private TextField geologist;

    @FXML
    private TextField groundFrom;

    @FXML
    private TextField groundFrom2;

    @FXML
    private TextField groundTo;

    @FXML
    private TextField groundTo2;

    @FXML
    private TextField line;

    @FXML
    private TextField passed;

    @FXML
    private TextField passedOrStopped;

    @FXML
    private TextField permafrostFrom;

    @FXML
    private TextField permafrostFrom2;

    @FXML
    private TextField permafrostTo;

    @FXML
    private TextField permafrostTo2;

    @FXML
    private TextField region;

    @FXML
    private TextField rightLeft;

    @FXML
    private TextField riverValley;

    @FXML
    private TextField start;

    @FXML
    private TextField surveyor;

    @FXML
    private TextField system;

    @FXML
    private TextField totalDepth;

    @FXML
    private TextField tributary;

    @FXML
    private TextField typeOfPlacer;

    @FXML
    private TextField waterLevel;

    @FXML
    private TextField waterLevelStop;

    @FXML
    private Font x3;

    @FXML
    private Color x4;

    private Model model = Single.getModelFirstList();
    private FirstList firstList = Single.getFirstList();



    private void initModel(){

        region.setText(firstList.getRegion());
        riverValley.setText(firstList.getRiverValley());
        tributary.setText(firstList.getTributary());
        system.setText(firstList.getSystem());
        typeOfPlacer.setText(firstList.getTypeOfPlacer());
        line.setText(firstList.getLine());
        distanceFromTheMouth.setText(firstList.getDistanceFromTheMouth());
        fromTheLine.setText(firstList.getFromTheLine());
        downUp.setText(firstList.getDownUp());
        azimuth.setText(firstList.getAzimuth());
        borehole.setText(firstList.getBorehole());
        distanceFromTheRiverbed.setText(firstList.getDistanceFromTheRiverbed());
        fromTheWell.setText(firstList.getFromTheWell());
        rightLeft.setText(firstList.getRightLeft());
        start.setText(firstList.getStart());
        end.setText(firstList.getEnd());
        altitudeMark.setText(firstList.getAltitudeMark());
        coordinates.setText(firstList.getCoordinates());

        permafrostFrom.setText(firstList.getPermafrostFrom());
        permafrostTo.setText(firstList.getPermafrostTo());
        permafrostFrom2.setText(firstList.getPermafrostFrom2());
        permafrostTo2.setText(firstList.getPermafrostTo2());

        groundFrom.setText(firstList.getGroundFrom());
        groundTo.setText(firstList.getGroundTo());

        groundFrom2.setText(firstList.getGroundFrom2());
        groundTo2.setText(firstList.getGroundTo2());

        totalDepth.setText(firstList.getTotalDepth());
        casingDepth.setText(firstList.getCasingDepth());
        compositionRocks.setText(firstList.getCompositionRocks());
        passed.setText(firstList.getPassed());
        passedOrStopped.setText(firstList.getPassedOrStopped());
        waterLevel.setText(firstList.getWaterLevel());
        waterLevelStop.setText(firstList.getWaterLevelStop());
        drillingDiameterM.setText(firstList.getDrillingDiameterM());
        drillingDiameterMM.setText(firstList.getDrillingDiameterMM());
        drillingRig.setText(firstList.getDrillingRig());
        flushing.setText(firstList.getFlushing());
        geologist.setText(firstList.getGeologist());
        surveyor.setText(firstList.getSurveyor());



        String value = region.getText();
        firstList.setRegion(value  == null ? "" : value);

        value = tributary.getText();
        firstList.setTributary(value  == null ? "" : value);

        value = system.getText();
        firstList.setSystem(value  == null ? "" : value);

        value = riverValley.getText();
        firstList.setRiverValley(value  == null ? "" : value);

        value = typeOfPlacer.getText();
        firstList.setTypeOfPlacer(value  == null ? "" : value);



        value = distanceFromTheMouth.getText();
        firstList.setDistanceFromTheMouth(value == null ? "" : value);
         value = downUp.getText();
        firstList.setDownUp(value == null ? "" : value);
         value = azimuth.getText();
        firstList.setAzimuth(value == null ? "" : value);
         value = borehole.getText();
        firstList.setBorehole(value == null ? "" : value);
         value = distanceFromTheRiverbed.getText();
        firstList.setDistanceFromTheRiverbed(value == null ? "" : value);
         value = fromTheWell.getText();
        firstList.setFromTheWell(value == null ? "" : value);
         value = rightLeft.getText();
        firstList.setRightLeft(value == null ? "" : value);
         value = start.getText();
        firstList.setStart(value == null ? "" : value);
         value = end.getText();
        firstList.setEnd(value == null ? "" : value);
         value = altitudeMark.getText();
        firstList.setAltitudeMark(value == null ? "" : value);
         value = coordinates.getText();
        firstList.setCoordinates(value == null ? "" : value);
         value = permafrostFrom.getText();
        firstList.setPermafrostFrom(value == null ? "" : value);
         value = permafrostTo.getText();
        firstList.setPermafrostTo(value == null ? "" : value);
         value = permafrostFrom2.getText();
        firstList.setPermafrostFrom2(value == null ? "" : value);
         value = permafrostTo2.getText();
        firstList.setPermafrostTo2(value == null ? "" : value);
         value = groundFrom.getText();
        firstList.setGroundFrom(value == null ? "" : value);
         value = groundTo.getText();
        firstList.setGroundTo(value == null ? "" : value);
         value = groundFrom2.getText();
        firstList.setGroundFrom2(value == null ? "" : value);
         value = groundTo2.getText();
        firstList.setGroundTo2(value == null ? "" : value);
         value = totalDepth.getText();
        firstList.setTotalDepth(value == null ? "" : value);
         value = casingDepth.getText();
        firstList.setCasingDepth(value == null ? "" : value);
         value = compositionRocks.getText();
        firstList.setCompositionRocks(value == null ? "" : value);
         value = passed.getText();
        firstList.setPassed(value == null ? "" : value);
         value = passedOrStopped.getText();
        firstList.setPassedOrStopped(value == null ? "" : value);
         value = waterLevel.getText();
        firstList.setWaterLevel(value == null ? "" : value);
         value = waterLevelStop.getText();
        firstList.setWaterLevelStop(value == null ? "" : value);
         value = drillingDiameterM.getText();
        firstList.setDrillingDiameterM(value == null ? "" : value);
         value = drillingDiameterMM.getText();
        firstList.setDrillingDiameterMM(value == null ? "" : value);
         value = drillingRig.getText();
        firstList.setDrillingRig(value == null ? "" : value);
         value = flushing.getText();
        firstList.setFlushing(value == null ? "" : value);
         value = geologist.getText();
        firstList.setGeologist(value == null ? "" : value);
         value = surveyor.getText();
        firstList.setSurveyor(value == null ? "" : value);
        value = line.getText();
        firstList.setLine(value == null ? "" : value);
        value = fromTheLine.getText();
        firstList.setFromTheLine(value);
    }

    @FXML
    void initialize(){

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                initModel();
            }
        });
        thread.start();


        line.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = line.getText();
            firstList.setLine(value == null ? "" : value);
        });

        region.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = region.getText();
            System.out.println("сработало");
            firstList.setRegion(value == null ? "" : value);
        });

        riverValley.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = riverValley.getText();
            firstList.setRiverValley(value == null ? "" : value);
        });

        tributary.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = tributary.getText();
            firstList.setTributary(value == null ? "" : value);
        });
        system.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = system.getText();
            firstList.setSystem(value == null ? "" : value);
        });
        typeOfPlacer.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = typeOfPlacer.getText();
            firstList.setTypeOfPlacer(value == null ? "" : value);
        });

        distanceFromTheMouth.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = distanceFromTheMouth.getText();
            firstList.setDistanceFromTheMouth(value == null ? "" : value);
        });

        downUp.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = downUp.getText();
            firstList.setDownUp(value == null ? "" : value);
        });

        azimuth.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = azimuth.getText();
            firstList.setAzimuth(value == null ? "" : value);
        });

        borehole.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = borehole.getText();
            firstList.setBorehole(value == null ? "" : value);
        });

        distanceFromTheRiverbed.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = distanceFromTheRiverbed.getText();
            firstList.setDistanceFromTheRiverbed(value == null ? "" : value);
        });

        fromTheWell.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = fromTheWell.getText();
            firstList.setFromTheWell(value == null ? "" : value);
        });

        rightLeft.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = rightLeft.getText();
            firstList.setRightLeft(value == null ? "" : value);
        });

        start.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = start.getText();
            firstList.setStart(value == null ? "" : value);
        });

        end.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = end.getText();
            firstList.setEnd(value == null ? "" : value);
        });

        altitudeMark.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = altitudeMark.getText();
            firstList.setAltitudeMark(value == null ? "" : value);
        });

        coordinates.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = coordinates.getText();
            firstList.setCoordinates(value == null ? "" : value);
        });

        permafrostFrom.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = permafrostFrom.getText();
            firstList.setPermafrostFrom(value == null ? "" : value);
        });

        permafrostTo.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = permafrostTo.getText();
            firstList.setPermafrostTo(value == null ? "" : value);
        });

        permafrostFrom2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = permafrostFrom2.getText();
            firstList.setPermafrostFrom2(value == null ? "" : value);
        });

        permafrostTo2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = permafrostTo2.getText();
            firstList.setPermafrostTo2(value == null ? "" : value);
        });

        groundFrom.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = groundFrom.getText();
            firstList.setGroundFrom(value == null ? "" : value);
        });

        groundTo.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = groundTo.getText();
            firstList.setGroundTo(value == null ? "" : value);
        });

        groundFrom2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = groundFrom2.getText();
            firstList.setGroundFrom2(value == null ? "" : value);
        });

        groundTo2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = groundTo2.getText();
            firstList.setGroundTo2(value == null ? "" : value);
        });

        totalDepth.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = totalDepth.getText();
            firstList.setTotalDepth(value == null ? "" : value);
        });

        casingDepth.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = casingDepth.getText();
            firstList.setCasingDepth(value == null ? "" : value);
        });

        compositionRocks.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = compositionRocks.getText();
            firstList.setCompositionRocks(value == null ? "" : value);
        });

        passed.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = passed.getText();
            firstList.setPassed(value == null ? "" : value);
        });

        passedOrStopped.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = passedOrStopped.getText();
            firstList.setPassedOrStopped(value == null ? "" : value);
        });

        waterLevel.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = waterLevel.getText();
            firstList.setWaterLevel(value == null ? "" : value);
        });

        waterLevelStop.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = waterLevelStop.getText();
            firstList.setWaterLevelStop(value == null ? "" : value);
        });

        drillingDiameterM.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = drillingDiameterM.getText();
            firstList.setDrillingDiameterM(value == null ? "" : value);
        });

        drillingDiameterMM.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = drillingDiameterMM.getText();
            firstList.setDrillingDiameterMM(value == null ? "" : value);
        });

        drillingRig.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = drillingRig.getText();
            firstList.setDrillingRig(value == null ? "" : value);
        });

        flushing.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = flushing.getText();
            firstList.setFlushing(value == null ? "" : value);
        });

        geologist.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = geologist.getText();
            firstList.setGeologist(value == null ? "" : value);
        });

        surveyor.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = surveyor.getText();
            firstList.setSurveyor(value == null ? "" : value);
        });

    }

}
