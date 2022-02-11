package controller;

import data.entities.documentation.CompletedAct;
import data.entities.documentation.ShutdownAct;
import data.util.HibernateSessionFactory;
import globals.Globals;
import data.FourthList;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Consumer;

public class AktController {

    @FXML
    private TextArea akt1;

    @FXML
    private TextArea akt2;

    @FXML
    private TextField day;

    @FXML
    private TextField day2;

    @FXML
    private TextField depth;

    @FXML
    private TextField depth2;

    @FXML
    private TextField driller;

    @FXML
    private TextField driller2;

    @FXML
    private TextField geolog;

    @FXML
    private TextField geolog2;

    @FXML
    private TextField master;

    @FXML
    private TextField master2;

    @FXML
    private TextField month;

    @FXML
    private TextField month2;

    @FXML
    private TextField numberAkt;

    @FXML
    private TextField numberAkt2;

    @FXML
    private TextField year;

    @FXML
    private TextField year2;

    private FourthList fourthList = Globals.getFourthList();

    private void setupCompletedAkt(@NotNull CompletedAct completedAct){
        akt1.setText(completedAct.getAct());
        numberAkt.setText(completedAct.getNumberAkt());

        day.setText(completedAct.getDay());
        month.setText(completedAct.getMonth());
        year.setText(completedAct.getYear());

        depth.setText(completedAct.getDepth());
        geolog.setText(completedAct.getGeology());
        driller.setText(completedAct.getDriller());
        master.setText(completedAct.getMaster());


    }
    private void setupShutdownAkt(@NotNull ShutdownAct shutdownAct){
        day2.setText(shutdownAct.getDay());
        numberAkt2.setText(shutdownAct.getNumberAkt());
        depth2.setText(shutdownAct.getDepth());
        akt2.setText(shutdownAct.getAct());
        geolog2.setText(shutdownAct.getGeology());
        driller2.setText(shutdownAct.getDriller());
        master2.setText(shutdownAct.getMaster());
        month2.setText(shutdownAct.getMonth());
        year2.setText(shutdownAct.getYear());
    }

    private void init(){
        if (Globals.instance().getCurrentBorehole() != null)
            try (var session = HibernateSessionFactory.getSession()) {
                var transaction = session.beginTransaction();
                var currentBorehole = Globals.instance().getCurrentBorehole();

                var completedAct = currentBorehole.getCompletedAct();
                var shutdownAct = currentBorehole.getShutdownAct();

                setupCompletedAkt(Objects.requireNonNullElseGet(completedAct, CompletedAct::new));
                setupShutdownAkt(Objects.requireNonNullElseGet(shutdownAct, ShutdownAct::new));

                transaction.commit();
            }

  /*      String value = year.getText();
                fourthList.setYear(value == null ? "" : value);
        value = month.getText();
                fourthList.setMonth(value == null ? "" : value);
        value = day.getText();
                fourthList.setDay(value == null ? "" : value);
        value = numberAkt.getText();
                fourthList.setNumberAkt(value == null ? "" : value);
        value = depth.getText();
                fourthList.setDepth(value == null ? "" : value);
        value = akt1.getText();
                fourthList.setAkt1(value == null ? "" : value);
        value = geolog.getText();
                fourthList.setGeolog(value == null ? "" : value);
        value = driller.getText();
                fourthList.setDriller(value == null ? "" : value);
        value = master.getText();
                fourthList.setMaster(value == null ? "" : value);
        value = year2.getText();
                fourthList.setYear2(value == null ? "" : value);
        value = month2.getText();
                fourthList.setMonth2(value == null ? "" : value);
        value = day2.getText();
                fourthList.setDay2(value == null ? "" : value);
        value = numberAkt2.getText();
                fourthList.setNumberAkt2(value == null ? "" : value);
        value = depth2.getText();
                fourthList.setDepth2(value == null ? "" : value);
        value = akt2.getText();
                fourthList.setAkt2(value == null ? "" : value);
        value = geolog2.getText();
                fourthList.setGeolog2(value == null ? "" : value);
        value = driller2.getText();
                fourthList.setDriller2(value == null ? "" : value);
        value = master2.getText();
                fourthList.setMaster2(value == null ? "" : value);*/
    }

    private void updateCompletedAkt(@NotNull Consumer<CompletedAct> completedActConsumer) {
        if (Globals.instance().getCurrentBorehole() == null) return;

        try (var session = HibernateSessionFactory.getSession()) {
            var transaction = session.beginTransaction();
            var borehole = Globals.instance().getCurrentBorehole();
            session.refresh(borehole);

            var completedAct = borehole.getCompletedAct();
            if (completedAct == null) {
                completedAct = new CompletedAct();
                borehole.setCompletedAct(completedAct);
            }

            completedActConsumer.accept(completedAct);
            session.update(borehole);

            transaction.commit();
        }
    }

    private void updateShutdownAkt(@NotNull Consumer<ShutdownAct> shutdownActConsumer) {
        if (Globals.instance().getCurrentBorehole() == null) return;

        try (var session = HibernateSessionFactory.getSession()) {
            var transaction = session.beginTransaction();
            var borehole = Globals.instance().getCurrentBorehole();
            session.refresh(borehole);

            var shutdownAct = borehole.getShutdownAct();
            if (shutdownAct == null) {
                shutdownAct = new ShutdownAct();
                borehole.setShutdownAct(shutdownAct);
            }

            shutdownActConsumer.accept(shutdownAct);
            session.update(borehole);

            transaction.commit();
        }
    }

    @FXML
    void initialize() {
        init();
        Globals.instance().addBoreholeListener(borehole -> init());

        year.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = year.getText();
            updateCompletedAkt(completedAct -> completedAct.setYear(value == null ? "" : value));
        });

        month.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = month.getText();
            updateCompletedAkt(completedAct -> completedAct.setMonth(value == null ? "" : value));
        });

        day.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = day.getText();
            updateCompletedAkt(completedAct -> completedAct.setDay(value == null ? "" : value));
        });

        numberAkt.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = numberAkt.getText();
            updateCompletedAkt(completedAct -> completedAct.setNumberAkt(value == null ? "" : value));
        });

        depth.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = depth.getText();
            updateCompletedAkt(completedAct -> completedAct.setDepth(value == null ? "" : value));
        });

        akt1.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = akt1.getText();
            updateCompletedAkt(completedAct -> completedAct.setAct(value == null ? "" : value));
        });

        geolog.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = geolog.getText();
            updateCompletedAkt(completedAct -> completedAct.setGeology(value == null ? "" : value));
        });

        driller.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = driller.getText();
            updateCompletedAkt(completedAct -> completedAct.setDriller(value == null ? "" : value));
        });

        master.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = master.getText();
            updateCompletedAkt(completedAct -> completedAct.setMaster(value == null ? "" : value));
        });

        year2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = year2.getText();
            updateShutdownAkt(shutdownAct -> shutdownAct.setYear(value == null ? "" : value));
        });

        month2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = month2.getText();
            updateShutdownAkt(shutdownAct -> shutdownAct.setMonth(value == null ? "" : value));
        });

        day2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = day2.getText();
            updateShutdownAkt(shutdownAct -> shutdownAct.setDay(value == null ? "" : value));
        });

        numberAkt2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = numberAkt2.getText();
            updateShutdownAkt(shutdownAct -> shutdownAct.setNumberAkt(value == null ? "" : value));
        });

        depth2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = depth2.getText();
            updateShutdownAkt(shutdownAct -> shutdownAct.setDepth(value == null ? "" : value));
        });

        akt2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = akt2.getText();
            updateShutdownAkt(shutdownAct -> shutdownAct.setAct(value == null ? "" : value));
        });

        geolog2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = geolog2.getText();
            updateShutdownAkt(shutdownAct -> shutdownAct.setGeology(value == null ? "" : value));
        });

        driller2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = driller2.getText();
            updateShutdownAkt(shutdownAct -> shutdownAct.setDriller(value == null ? "" : value));
        });

        master2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = master2.getText();
            updateShutdownAkt(shutdownAct -> shutdownAct.setMaster(value == null ? "" : value));
        });
    }

}
