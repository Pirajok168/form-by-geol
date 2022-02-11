package controller;

import data.entities.documentation.CalculationResults;
import data.entities.documentation.ControlTable;
import data.entities.documentation.NuggetsCharacteristics;
import data.util.HibernateSessionFactory;
import globals.Globals;
import data.FourthList;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Consumer;

public class FourthListController {


    @FXML
    private TextArea table1_1_0;

    @FXML
    private TextArea table1_1_1;

    @FXML
    private TextArea table1_1_2;

    @FXML
    private TextArea table1_2_0;

    @FXML
    private TextArea table1_2_1;

    @FXML
    private TextArea table1_2_2;

    @FXML
    private TextArea table2_1_0;

    @FXML
    private TextArea table2_1_1;

    @FXML
    private TextArea table2_1_2;

    @FXML
    private TextArea table2_1_3;

    @FXML
    private TextArea table2_1_4;

    @FXML
    private TextArea table2_2_0;

    @FXML
    private TextArea table2_2_1;

    @FXML
    private TextArea table2_2_2;

    @FXML
    private TextArea table2_2_3;

    @FXML
    private TextArea table2_2_4;

    @FXML
    private TextArea table2_3_0;

    @FXML
    private TextArea table2_3_1;

    @FXML
    private TextArea table2_3_2;

    @FXML
    private TextArea table2_3_3;

    @FXML
    private TextArea table2_3_4;

    @FXML
    private TextArea table2_4_0;

    @FXML
    private TextArea table2_4_1;

    @FXML
    private TextArea table2_4_2;

    @FXML
    private TextArea table2_4_3;

    @FXML
    private TextArea table2_4_4;

    private FourthList fourthList = Globals.getFourthList();

    private void updateControlTable(@NotNull Consumer<ControlTable> ControlTableConsumer) {
        if (Globals.instance().getCurrentBorehole() == null) return;

        try (var session = HibernateSessionFactory.getSession()) {
            var transaction = session.beginTransaction();
            var borehole = Globals.instance().getCurrentBorehole();
            session.refresh(borehole);

            var controlTable = borehole.getControlTable();
            if (controlTable == null) {
                controlTable = new ControlTable();
                borehole.setControlTable(controlTable);
                session.update(borehole);
            }

            ControlTableConsumer.accept(controlTable);
            session.update(borehole);

            transaction.commit();
        }
    }

    private void updateNuggetsCharacteristics(@NotNull Consumer<NuggetsCharacteristics> nuggetsCharacteristicsConsumer) {
        if (Globals.instance().getCurrentBorehole() == null) return;

        try (var session = HibernateSessionFactory.getSession()) {
            var transaction = session.beginTransaction();
            var borehole = Globals.instance().getCurrentBorehole();
            session.refresh(borehole);

            var nuggetsCharacteristics = borehole.getNuggetsCharacteristics();
            if (nuggetsCharacteristics == null) {
                nuggetsCharacteristics = new NuggetsCharacteristics();
                borehole.setNuggetsCharacteristics(nuggetsCharacteristics);
                session.update(borehole);
            }

            nuggetsCharacteristicsConsumer.accept(nuggetsCharacteristics);
            session.update(borehole);

            transaction.commit();
        }
    }

    private void setupControlTable(@NotNull ControlTable controlTable) {
        table1_1_0.setText(controlTable.getTable1_1_0());
        table1_1_1.setText(controlTable.getTable1_1_1());
        table1_1_2.setText(controlTable.getTable1_1_2());
        table1_2_0.setText(controlTable.getTable1_2_0());
        table1_2_1.setText(controlTable.getTable1_2_1());
        table1_2_2.setText(controlTable.getTable1_2_2());
    }

    private void setupNuggetsCharacteristics(@NotNull NuggetsCharacteristics nuggetsCharacteristics) {
        table2_1_0.setText(nuggetsCharacteristics.getTable2_1_0());
        table2_1_1.setText(nuggetsCharacteristics.getTable2_1_1());
        table2_1_2.setText(nuggetsCharacteristics.getTable2_1_2());
        table2_1_3.setText(nuggetsCharacteristics.getTable2_1_3());
        table2_1_4.setText(nuggetsCharacteristics.getTable2_1_4());
        table2_2_0.setText(nuggetsCharacteristics.getTable2_2_0());
        table2_2_1.setText(nuggetsCharacteristics.getTable2_2_1());
        table2_2_2.setText(nuggetsCharacteristics.getTable2_2_2());
        table2_2_3.setText(nuggetsCharacteristics.getTable2_2_3());
        table2_2_4.setText(nuggetsCharacteristics.getTable2_2_4());
        table2_3_0.setText(nuggetsCharacteristics.getTable2_3_0());
        table2_3_1.setText(nuggetsCharacteristics.getTable2_3_1());
        table2_3_2.setText(nuggetsCharacteristics.getTable2_3_2());
        table2_3_3.setText(nuggetsCharacteristics.getTable2_3_3());
        table2_3_4.setText(nuggetsCharacteristics.getTable2_3_4());
        table2_4_0.setText(nuggetsCharacteristics.getTable2_4_0());
        table2_4_1.setText(nuggetsCharacteristics.getTable2_4_1());
        table2_4_2.setText(nuggetsCharacteristics.getTable2_4_2());
        table2_4_3.setText(nuggetsCharacteristics.getTable2_4_3());
        table2_4_4.setText(nuggetsCharacteristics.getTable2_4_4());
    }

    private void init() {
        if (Globals.instance().getCurrentBorehole() != null)
            try (var session = HibernateSessionFactory.getSession()) {
                var transaction = session.beginTransaction();
                var borehole = Globals.instance().getCurrentBorehole();
                session.refresh(borehole);

                setupControlTable(Objects.requireNonNullElseGet(borehole.getControlTable(), ControlTable::new));
                setupNuggetsCharacteristics(Objects.requireNonNullElseGet(borehole.getNuggetsCharacteristics(), NuggetsCharacteristics::new));

                transaction.commit();
            }
        /*
        int i = 0;

        String value = table1_1_0.getText();
        fourthList.setTable1_1_0(value == null ? " " : value);
        value = table1_1_1.getText();
        fourthList.setTable1_1_1(value == null ? " " : value);
        value = table1_1_2.getText();
        fourthList.setTable1_1_2(value == null ? " " : value);
        value = table1_2_0.getText();
        fourthList.setTable1_2_0(value == null ? " " : value);
        value = table1_2_1.getText();
        fourthList.setTable1_2_1(value == null ? " " : value);
        value = table1_2_2.getText();
        fourthList.setTable1_2_2(value == null ? " " : value);
        value = table2_1_0.getText();
        fourthList.setTable2_1_0(value == null ? " " : value);
        value = table2_1_1.getText();
        fourthList.setTable2_1_1(value == null ? " " : value);
        value = table2_1_2.getText();
        fourthList.setTable2_1_2(value == null ? " " : value);
        value = table2_1_3.getText();
        fourthList.setTable2_1_3(value == null ? " " : value);
        value = table2_1_4.getText();
        fourthList.setTable2_1_4(value == null ? " " : value);
        value = table2_2_0.getText();
        fourthList.setTable2_2_0(value == null ? " " : value);
        value = table2_2_1.getText();
        fourthList.setTable2_2_1(value == null ? " " : value);
        value = table2_2_2.getText();
        fourthList.setTable2_2_2(value == null ? " " : value);
        value = table2_2_3.getText();
        fourthList.setTable2_2_3(value == null ? " " : value);
        value = table2_2_4.getText();
        fourthList.setTable2_2_4(value == null ? " " : value);
        value = table2_3_0.getText();
        fourthList.setTable2_3_0(value == null ? " " : value);
        value = table2_3_1.getText();
        fourthList.setTable2_3_1(value == null ? " " : value);
        value = table2_3_2.getText();
        fourthList.setTable2_3_2(value == null ? " " : value);
        value = table2_3_3.getText();
        fourthList.setTable2_3_3(value == null ? " " : value);
        value = table2_3_4.getText();
        fourthList.setTable2_3_4(value == null ? " " : value);
        value = table2_4_0.getText();
        fourthList.setTable2_4_0(value == null ? " " : value);
        value = table2_4_1.getText();
        fourthList.setTable2_4_1(value == null ? " " : value);
        value = table2_4_2.getText();
        fourthList.setTable2_4_2(value == null ? " " : value);
        value = table2_4_3.getText();
        fourthList.setTable2_4_3(value == null ? " " : value);
        value = table2_4_4.getText();
        fourthList.setTable2_4_4(value == null ? " " : value);*/
    }

    @FXML
    void initialize() {
        init();
        Globals.instance().addBoreholeListener(borehole -> init());

        table1_1_0.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table1_1_0.getText();
            updateControlTable(controlTable -> controlTable.setTable1_1_0(value == null ? " " : value));
        });

        table1_1_1.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table1_1_1.getText();
            updateControlTable(controlTable -> controlTable.setTable1_1_1(value == null ? " " : value));
        });

        table1_1_2.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table1_1_2.getText();
            updateControlTable(controlTable -> controlTable.setTable1_1_2(value == null ? " " : value));
        });

        table1_2_0.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table1_2_0.getText();
            updateControlTable(controlTable -> controlTable.setTable1_2_0(value == null ? " " : value));
        });

        table1_2_1.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table1_2_1.getText();
            updateControlTable(controlTable -> controlTable.setTable1_2_1(value == null ? " " : value));
        });

        table1_2_2.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table1_2_2.getText();
            updateControlTable(controlTable -> controlTable.setTable1_2_2(value == null ? " " : value));
        });

        table2_1_0.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_1_0.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_1_0(value == null ? " " : value));
        });

        table2_1_1.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_1_1.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_1_1(value == null ? " " : value));
        });

        table2_1_2.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_1_2.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_1_2(value == null ? " " : value));
        });

        table2_1_3.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_1_3.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_1_3(value == null ? " " : value));
        });

        table2_1_4.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_1_4.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_1_4(value == null ? " " : value));
        });

        table2_2_0.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_2_0.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_2_0(value == null ? " " : value));
        });

        table2_2_1.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_2_1.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_2_1(value == null ? " " : value));
        });

        table2_2_2.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_2_2.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_2_2(value == null ? " " : value));
        });

        table2_2_3.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_2_3.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_2_3(value == null ? " " : value));
        });

        table2_2_4.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_2_4.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_2_4(value == null ? " " : value));
        });

        table2_3_0.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_3_0.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_3_0(value == null ? " " : value));
        });

        table2_3_1.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_3_1.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_3_1(value == null ? " " : value));
        });

        table2_3_2.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_3_2.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_3_2(value == null ? " " : value));
        });

        table2_3_3.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_3_3.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_3_3(value == null ? " " : value));
        });

        table2_3_4.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_3_4.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_3_4(value == null ? " " : value));
        });

        table2_4_0.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_4_0.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_4_0(value == null ? " " : value));
        });

        table2_4_1.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_4_1.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_4_1(value == null ? " " : value));
        });

        table2_4_2.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_4_2.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_4_2(value == null ? " " : value));
        });

        table2_4_3.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_4_3.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_4_3(value == null ? " " : value));
        });

        table2_4_4.focusedProperty().addListener((observable, oldValue, newValue) -> {
            String value = table2_4_4.getText();
            updateNuggetsCharacteristics(nuggetsCharacteristics -> nuggetsCharacteristics.setTable2_4_4(value == null ? " " : value));
        });
    }

}
