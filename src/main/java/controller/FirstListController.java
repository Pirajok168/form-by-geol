package controller;

import data.entities.Borehole;
import data.entities.documentation.Summary;
import data.util.HibernateSessionFactory;
import globals.Globals;
import data.FirstList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Consumer;

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

    private final Globals globals = Globals.instance();

    private void setupSummary(@NotNull Summary summary) {
        region.setText(summary.getRegion());
        riverValley.setText(summary.getRiverValley());
        tributary.setText(summary.getTributary());
        system.setText(summary.getSystem());
        typeOfPlacer.setText(summary.getTypeOfPlacer());
        line.setText(summary.getLine());
        distanceFromTheMouth.setText(summary.getDistanceFromTheMouth());
        fromTheLine.setText(summary.getFromTheLine());
        downUp.setText(summary.getDownUp());
        azimuth.setText(summary.getAzimuth());
        borehole.setText(summary.getBorehole());
        distanceFromTheRiverbed.setText(summary.getDistanceFromTheRiverbed());
        fromTheWell.setText(summary.getFromTheWell());
        rightLeft.setText(summary.getRightLeft());
        start.setText(summary.getStart());
        end.setText(summary.getEnd());
        altitudeMark.setText(summary.getAltitudeMark());
        coordinates.setText(summary.getCoordinates());

        permafrostFrom.setText(summary.getPermafrostFrom());
        permafrostTo.setText(summary.getPermafrostTo());
        permafrostFrom2.setText(summary.getPermafrostFrom2());
        permafrostTo2.setText(summary.getPermafrostTo2());

        groundFrom.setText(summary.getGroundFrom());
        groundTo.setText(summary.getGroundTo());

        groundFrom2.setText(summary.getGroundFrom2());
        groundTo2.setText(summary.getGroundTo2());

        totalDepth.setText(summary.getTotalDepth());
        casingDepth.setText(summary.getCasingDepth());
        compositionRocks.setText(summary.getCompositionRocks());
        passed.setText(summary.getPassed());
        passedOrStopped.setText(summary.getPassedOrStopped());
        waterLevel.setText(summary.getWaterLevel());
        waterLevelStop.setText(summary.getWaterLevelStop());

        drillingDiameterM.setText(summary.getDrillingDiameterM());
        drillingDiameterMM.setText(summary.getDrillingDiameterMM());
        drillingRig.setText(summary.getDrillingRig());
        flushing.setText(summary.getFlushing());
        geologist.setText(summary.getGeologist());
        surveyor.setText(summary.getSurveyor());
    }

    private void initModel() {
        if (globals.getCurrentBorehole() != null)
            try (var session = HibernateSessionFactory.getSession()) {
                var transaction = session.beginTransaction();
                var currentBorehole = globals.getCurrentBorehole();

                var summary = currentBorehole.getSummary();
                setupSummary(Objects.requireNonNullElseGet(summary, Summary::new));

                transaction.commit();
            }
/*
        String value = region.getText();
        firstList.setRegion(value == null ? "" : value);

        value = tributary.getText();
        firstList.setTributary(value == null ? "" : value);

        value = system.getText();
        firstList.setSystem(value == null ? "" : value);

        value = riverValley.getText();
        firstList.setRiverValley(value == null ? "" : value);

        value = typeOfPlacer.getText();
        firstList.setTypeOfPlacer(value == null ? "" : value);


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
        firstList.setFromTheLine(value);*/
    }

    private void updateValue(@NotNull Consumer<Summary> summaryConsumer) {
        if (globals.getCurrentBorehole() == null) return;

        try (var session = HibernateSessionFactory.getSession()) {
            var transaction = session.beginTransaction();
            var borehole = globals.getCurrentBorehole();
            session.refresh(borehole);

            var summary = borehole.getSummary();
            if (summary == null) {
                summary = new Summary();
                borehole.setSummary(summary);
            }

            summaryConsumer.accept(summary);
            session.update(borehole);

            transaction.commit();
        }
    }


    @FXML
    void initialize() {
        //new Thread(this::initModel).start();
        initModel();
        globals.addBoreholeListener(borehole1 -> initModel());

        line.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = line.getText();
            updateValue(summary -> summary.setLine(value == null ? " " : value));
        });

        region.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = region.getText();
            System.out.println("сработало");
            updateValue(summary -> summary.setRegion(value == null ? " " : value));
        });

        riverValley.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = riverValley.getText();
            updateValue(summary -> summary.setRiverValley(value == null ? " " : value));
        });

        tributary.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = tributary.getText();
            updateValue(summary -> summary.setTributary(value == null ? " " : value));
        });
        system.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = system.getText();
            updateValue(summary -> summary.setSystem(value == null ? " " : value));
        });
        typeOfPlacer.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = typeOfPlacer.getText();
            updateValue(summary -> summary.setTypeOfPlacer(value == null ? " " : value));
        });

        distanceFromTheMouth.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = distanceFromTheMouth.getText();
            updateValue(summary -> summary.setDistanceFromTheMouth(value == null ? " " : value));
        });

        downUp.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = downUp.getText();
            updateValue(summary -> summary.setDownUp(value == null ? " " : value));
        });

        azimuth.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = azimuth.getText();
            updateValue(summary -> summary.setAzimuth(value == null ? " " : value));
        });

        borehole.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = borehole.getText();
            updateValue(summary -> summary.setBorehole(value == null ? "" : value));
        });

        distanceFromTheRiverbed.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = distanceFromTheRiverbed.getText();
            updateValue(summary -> summary.setDistanceFromTheRiverbed(value == null ? " " : value));
        });

        fromTheWell.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = fromTheWell.getText();
            updateValue(summary -> summary.setFromTheWell(value == null ? " " : value));
        });

        rightLeft.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = rightLeft.getText();
            updateValue(summary -> summary.setRightLeft(value == null ? " " : value));
        });

        start.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = start.getText();
            updateValue(summary -> summary.setStart(value == null ? " " : value));
        });

        end.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = end.getText();
            updateValue(summary -> summary.setEnd(value == null ? " " : value));
        });

        altitudeMark.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = altitudeMark.getText();
            updateValue(summary -> summary.setAltitudeMark(value == null ? " " : value));
        });

        coordinates.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = coordinates.getText();
            updateValue(summary -> summary.setCoordinates(value == null ? " " : value));
        });

        permafrostFrom.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = permafrostFrom.getText();
            updateValue(summary -> summary.setPermafrostFrom(value == null ? " " : value));
        });

        permafrostTo.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = permafrostTo.getText();
            updateValue(summary -> summary.setPermafrostTo(value == null ? " " : value));
        });

        permafrostFrom2.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = permafrostFrom2.getText();
            updateValue(summary -> summary.setPermafrostFrom2(value == null ? " " : value));
        });

        permafrostTo2.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = permafrostTo2.getText();
            updateValue(summary -> summary.setPermafrostTo2(value == null ? " " : value));
        });

        groundFrom.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = groundFrom.getText();
            updateValue(summary -> summary.setGroundFrom(value == null ? " " : value));
        });

        groundTo.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = groundTo.getText();
            updateValue(summary -> summary.setGroundTo(value == null ? " " : value));
        });

        groundFrom2.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = groundFrom2.getText();
            updateValue(summary -> summary.setGroundFrom2(value == null ? " " : value));
        });

        groundTo2.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = groundTo2.getText();
            updateValue(summary -> summary.setGroundTo2(value == null ? " " : value));
        });

        totalDepth.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = totalDepth.getText();
            updateValue(summary -> summary.setTotalDepth(value == null ? " " : value));
        });

        casingDepth.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = casingDepth.getText();
            updateValue(summary -> summary.setCasingDepth(value == null ? " " : value));
        });

        compositionRocks.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = compositionRocks.getText();
            updateValue(summary -> summary.setCompositionRocks(value == null ? " " : value));
        });

        passed.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = passed.getText();
            updateValue(summary -> summary.setPassed(value == null ? " " : value));
        });

        passedOrStopped.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = passedOrStopped.getText();
            updateValue(summary -> summary.setPassedOrStopped(value == null ? " " : value));
        });

        waterLevel.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = waterLevel.getText();
            updateValue(summary -> summary.setWaterLevel(value == null ? " " : value));
        });

        waterLevelStop.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = waterLevelStop.getText();
            updateValue(summary -> summary.setWaterLevelStop(value == null ? " " : value));
        });

        drillingDiameterM.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = drillingDiameterM.getText();
            updateValue(summary -> summary.setDrillingDiameterM(value == null ? " " : value));
        });

        drillingDiameterMM.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = drillingDiameterMM.getText();
            updateValue(summary -> summary.setDrillingDiameterMM(value == null ? " " : value));
        });

        drillingRig.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = drillingRig.getText();
            updateValue(summary -> summary.setDrillingRig(value == null ? " " : value));
        });

        flushing.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = flushing.getText();
            updateValue(summary -> summary.setFlushing(value == null ? " " : value));
        });

        geologist.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = geologist.getText();
            updateValue(summary -> summary.setGeologist(value == null ? " " : value));
        });

        surveyor.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = surveyor.getText();
            updateValue(summary -> summary.setSurveyor(value == null ? " " : value));
        });

    }
}
