package controller;

import data.entities.documentation.CalculationResults;
import data.entities.documentation.Summary;
import data.util.HibernateSessionFactory;
import globals.Globals;
import data.FirstList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Consumer;


public class SecondListController {


    @FXML
    private TextField content;

    @FXML
    private TextField dressing;

    @FXML
    private TextField dressing10;

    @FXML
    private TextField dressing11;

    @FXML
    private TextField dressing12;

    @FXML
    private TextField dressing13;

    @FXML
    private TextField dressing14;

    @FXML
    private TextField dressing15;

    @FXML
    private TextField dressing16;

    @FXML
    private TextField dressing17;

    @FXML
    private TextField dressing2;

    @FXML
    private TextField dressing3;

    @FXML
    private TextField dressing4;

    @FXML
    private TextField dressing5;

    @FXML
    private TextField dressing6;

    @FXML
    private TextField dressing7;

    @FXML
    private TextField dressing8;

    @FXML
    private TextField dressing9;

    @FXML
    private TextField h_сh;

    @FXML
    private TextField h_сh10;

    @FXML
    private TextField h_сh11;

    @FXML
    private TextField h_сh12;

    @FXML
    private TextField h_сh13;

    @FXML
    private TextField h_сh14;

    @FXML
    private TextField h_сh15;

    @FXML
    private TextField h_сh16;

    @FXML
    private TextField h_сh17;

    @FXML
    private TextField h_сh18;

    @FXML
    private TextField h_сh2;

    @FXML
    private TextField h_сh3;

    @FXML
    private TextField h_сh4;

    @FXML
    private TextField h_сh5;

    @FXML
    private TextField h_сh6;

    @FXML
    private TextField h_сh7;

    @FXML
    private TextField h_сh8;

    @FXML
    private TextField h_сh9;

    @FXML
    private TextField limit;

    @FXML
    private TextField dressing18;

    @FXML
    private TextField probaAi;

    private void setupCalculationResults(@NotNull CalculationResults calculationResults) {
        probaAi.setText(calculationResults.getProbAi());
        content.setText(calculationResults.getContent());

        dressing.setText(calculationResults.getDressing());
        h_сh.setText(calculationResults.getH_сh());
        dressing2.setText(calculationResults.getDressing2());
        h_сh2.setText(calculationResults.getH_сh2());
        dressing3.setText(calculationResults.getDressing3());
        h_сh3.setText(calculationResults.getH_сh3());
        dressing4.setText(calculationResults.getDressing4());
        h_сh4.setText(calculationResults.getH_сh4());
        dressing5.setText(calculationResults.getDressing5());
        h_сh5.setText(calculationResults.getH_сh5());
        dressing6.setText(calculationResults.getDressing6());
        h_сh6.setText(calculationResults.getH_сh6());
        dressing7.setText(calculationResults.getDressing7());
        h_сh7.setText(calculationResults.getH_сh7());
        dressing8.setText(calculationResults.getDressing8());
        h_сh8.setText(calculationResults.getH_сh8());
        dressing9.setText(calculationResults.getDressing9());
        h_сh9.setText(calculationResults.getH_сh9());
        dressing10.setText(calculationResults.getDressing10());
        h_сh10.setText(calculationResults.getH_сh10());
        dressing11.setText(calculationResults.getDressing11());
        h_сh11.setText(calculationResults.getH_сh11());
        dressing12.setText(calculationResults.getDressing12());
        h_сh12.setText(calculationResults.getH_сh12());
        dressing13.setText(calculationResults.getDressing13());
        h_сh13.setText(calculationResults.getH_сh13());
        dressing14.setText(calculationResults.getDressing14());
        h_сh14.setText(calculationResults.getH_сh14());
        dressing15.setText(calculationResults.getDressing15());
        h_сh15.setText(calculationResults.getH_сh15());
        limit.setText(calculationResults.getLimit());
        dressing16.setText(calculationResults.getDressing16());
        h_сh16.setText(calculationResults.getH_сh16());
        dressing17.setText(calculationResults.getDressing17());
        h_сh17.setText(calculationResults.getH_сh17());
        dressing18.setText(calculationResults.getDressing18());
        h_сh18.setText(calculationResults.getH_сh18());
    }

    private void updateValue(@NotNull Consumer<CalculationResults> calculationResultsConsumer) {
        if (Globals.instance().getCurrentBorehole() == null) return;

        try (var session = HibernateSessionFactory.getSession()) {
            var transaction = session.beginTransaction();
            var borehole = Globals.instance().getCurrentBorehole();
            session.refresh(borehole);

            var calculationResults = borehole.getCalculationResults();
            if (calculationResults == null) {
                calculationResults = new CalculationResults();
                borehole.setCalculationResults(calculationResults);
                session.update(borehole);
            }

            calculationResultsConsumer.accept(calculationResults);
            session.update(borehole);

            transaction.commit();
        }
    }

    private void initModel() {
        if (Globals.instance().getCurrentBorehole() != null)
            try (var session = HibernateSessionFactory.getSession()) {
                var transaction = session.beginTransaction();
                var borehole = Globals.instance().getCurrentBorehole();
                session.refresh(borehole);

                setupCalculationResults(Objects.requireNonNullElseGet(borehole.getCalculationResults(), CalculationResults::new));

                transaction.commit();
            }

        /*String value = "";
        value = probaAi.getText();
        firstList.setProbaAi(value == null ? " " : value);
        value = content.getText();
        firstList.setContent(value == null ? " " : value);
        value = dressing.getText();
        firstList.setDressing(value == null ? " " : value);
        value = h_сh.getText();
        firstList.setH_сh(value == null ? " " : value);
        value = dressing2.getText();
        firstList.setDressing2(value == null ? " " : value);
        value = h_сh2.getText();
        firstList.setH_сh2(value == null ? " " : value);
        value = dressing3.getText();
        firstList.setDressing3(value == null ? " " : value);
        value = h_сh3.getText();
        firstList.setH_сh3(value == null ? " " : value);
        value = dressing4.getText();
        firstList.setDressing4(value == null ? " " : value);
        value = h_сh4.getText();
        firstList.setH_сh4(value == null ? " " : value);
        value = dressing5.getText();
        firstList.setDressing5(value == null ? " " : value);
        value = h_сh5.getText();
        firstList.setH_сh5(value == null ? " " : value);
        value = dressing6.getText();
        firstList.setDressing6(value == null ? " " : value);
         value = h_сh6.getText();
        firstList.setH_сh6(value == null ? " " : value);
         value = dressing7.getText();
        firstList.setDressing7(value == null ? " " : value);
         value = h_сh7.getText();
        firstList.setH_сh7(value == null ? " " : value);
         value = dressing8.getText();
        firstList.setDressing8(value == null ? " " : value);
         value = h_сh8.getText();
        firstList.setH_сh8(value == null ? " " : value);
         value = dressing9.getText();
        firstList.setDressing9(value == null ? " " : value);
         value = h_сh9.getText();
        firstList.setH_сh9(value == null ? " " : value);
         value = dressing10.getText();
        firstList.setDressing10(value == null ? " " : value);
         value = h_сh10.getText();
        firstList.setH_сh10(value == null ? " " : value);
         value = dressing11.getText();
        firstList.setDressing11(value == null ? " " : value);
         value = h_сh11.getText();
        firstList.setH_сh11(value == null ? " " : value);
         value = dressing12.getText();
        firstList.setDressing12(value == null ? " " : value);
         value = h_сh12.getText();
        firstList.setH_сh12(value == null ? " " : value);
         value = dressing13.getText();
        firstList.setDressing13(value == null ? " " : value);
         value = h_сh13.getText();
        firstList.setH_сh13(value == null ? " " : value);
         value = dressing14.getText();
        firstList.setDressing14(value == null ? " " : value);
         value = h_сh14.getText();
        firstList.setH_сh14(value == null ? " " : value);
         value = dressing15.getText();
        firstList.setDressing15(value == null ? " " : value);
         value = h_сh15.getText();
        firstList.setH_сh15(value == null ? " " : value);
         value = limit.getText();
        firstList.setLimit(value == null ? " " : value);
         value = dressing16.getText();
        firstList.setDressing16(value == null ? " " : value);
         value = h_сh16.getText();
        firstList.setH_сh16(value == null ? " " : value);
         value = dressing17.getText();
        firstList.setDressing17(value == null ? " " : value);
         value = h_сh17.getText();
        firstList.setH_сh17(value == null ? " " : value);
         value = dressing18.getText();
        firstList.setDressing18(value == null ? " " : value);
         value = h_сh18.getText();
        firstList.setH_сh18(value == null ? " " : value);*/
    }


    @FXML
    void initialize() {
        initModel();
        Globals.instance().addBoreholeListener(borehole -> initModel());

        probaAi.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = probaAi.getText();
            updateValue(cr -> cr.setProbAi(value == null ? " " : value));
        });

        content.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = content.getText();
            updateValue(cr -> cr.setContent(value == null ? " " : value));
        });

        dressing.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = dressing.getText();
            updateValue(cr -> cr.setDressing(value == null ? " " : value));
        });

        h_сh.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = h_сh.getText();
            updateValue(cr -> cr.setH_сh(value == null ? " " : value));
        });

        dressing2.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = dressing2.getText();
            updateValue(cr -> cr.setDressing2(value == null ? " " : value));
        });

        h_сh2.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = h_сh2.getText();
            updateValue(cr -> cr.setH_сh2(value == null ? " " : value));
        });

        dressing3.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = dressing3.getText();
            updateValue(cr -> cr.setDressing3(value == null ? " " : value));
        });

        h_сh3.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = h_сh3.getText();
            updateValue(cr -> cr.setH_сh3(value == null ? " " : value));
        });

        dressing4.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = dressing4.getText();
            updateValue(cr -> cr.setDressing4(value == null ? " " : value));
        });

        h_сh4.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = h_сh4.getText();
            updateValue(cr -> cr.setH_сh4(value == null ? " " : value));
        });

        dressing5.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = dressing5.getText();
            updateValue(cr -> cr.setDressing5(value == null ? " " : value));
        });

        h_сh5.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = h_сh5.getText();
            updateValue(cr -> cr.setH_сh5(value == null ? " " : value));
        });

        dressing6.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = dressing6.getText();
            updateValue(cr -> cr.setDressing6(value == null ? " " : value));
        });

        h_сh6.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = h_сh6.getText();
            updateValue(cr -> cr.setH_сh6(value == null ? " " : value));
        });

        dressing7.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = dressing7.getText();
            updateValue(cr -> cr.setDressing7(value == null ? " " : value));
        });

        h_сh7.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = h_сh7.getText();
            updateValue(cr -> cr.setH_сh7(value == null ? " " : value));
        });

        dressing8.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = dressing8.getText();
            updateValue(cr -> cr.setDressing8(value == null ? " " : value));
        });

        h_сh8.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = h_сh8.getText();
            updateValue(cr -> cr.setH_сh8(value == null ? " " : value));
        });

        dressing9.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = dressing9.getText();
            updateValue(cr -> cr.setDressing9(value == null ? " " : value));
        });

        h_сh9.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = h_сh9.getText();
            updateValue(cr -> cr.setH_сh9(value == null ? " " : value));
        });

        dressing10.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = dressing10.getText();
            updateValue(cr -> cr.setDressing10(value == null ? " " : value));
        });

        h_сh10.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = h_сh10.getText();
            updateValue(cr -> cr.setH_сh10(value == null ? " " : value));
        });

        dressing11.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = dressing11.getText();
            updateValue(cr -> cr.setDressing11(value == null ? " " : value));
        });

        h_сh11.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = h_сh11.getText();
            updateValue(cr -> cr.setH_сh11(value == null ? " " : value));
        });

        dressing12.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = dressing12.getText();
            updateValue(cr -> cr.setDressing12(value == null ? " " : value));
        });

        h_сh12.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = h_сh12.getText();
            updateValue(cr -> cr.setH_сh12(value == null ? " " : value));
        });

        dressing13.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = dressing13.getText();
            updateValue(cr -> cr.setDressing13(value == null ? " " : value));
        });

        h_сh13.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = h_сh13.getText();
            updateValue(cr -> cr.setH_сh13(value == null ? " " : value));
        });

        dressing14.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = dressing14.getText();
            updateValue(cr -> cr.setDressing14(value == null ? " " : value));
        });

        h_сh14.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = h_сh14.getText();
            updateValue(cr -> cr.setH_сh14(value == null ? " " : value));
        });

        dressing15.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = dressing15.getText();
            updateValue(cr -> cr.setDressing15(value == null ? " " : value));
        });

        h_сh15.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = h_сh15.getText();
            updateValue(cr -> cr.setH_сh15(value == null ? " " : value));
        });

        limit.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = limit.getText();
            updateValue(cr -> cr.setLimit(value == null ? " " : value));
        });

        dressing16.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = dressing16.getText();
            updateValue(cr -> cr.setDressing16(value == null ? " " : value));
        });

        h_сh16.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = h_сh16.getText();
            updateValue(cr -> cr.setH_сh16(value == null ? " " : value));
        });

        dressing17.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = dressing17.getText();
            updateValue(cr -> cr.setDressing17(value == null ? " " : value));
        });

        h_сh17.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = h_сh17.getText();
            updateValue(cr -> cr.setH_сh17(value == null ? " " : value));
        });

        dressing18.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = dressing18.getText();
            updateValue(cr -> cr.setDressing18(value == null ? " " : value));
        });

        h_сh18.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = h_сh18.getText();
            updateValue(cr -> cr.setH_сh18(value == null ? " " : value));
        });


    }
}
