package controller;

import java.net.URL;
import java.util.ResourceBundle;

import View.Single;
import data.FourthList;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

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

    private FourthList fourthList = Single.getFourthList();

    @FXML
    void initialize() {
        year.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = year.getText();
            fourthList.setYear(value == null ? "" : value);
        });

        month.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = month.getText();
            fourthList.setMonth(value == null ? "" : value);
        });

        day.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = day.getText();
            fourthList.setDay(value == null ? "" : value);
        });

        numberAkt.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = numberAkt.getText();
            fourthList.setNumberAkt(value == null ? "" : value);
        });

        depth.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = depth.getText();
            fourthList.setDepth(value == null ? "" : value);
        });

        akt1.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = akt1.getText();
            fourthList.setAkt1(value == null ? "" : value);
        });

        geolog.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = geolog.getText();
            fourthList.setGeolog(value == null ? "" : value);
        });

        driller.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = driller.getText();
            fourthList.setDriller(value == null ? "" : value);
        });

        master.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = master.getText();
            fourthList.setMaster(value == null ? "" : value);
        });




        year2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = year2.getText();
            fourthList.setYear2(value == null ? "" : value);
        });

        month2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = month2.getText();
            fourthList.setMonth2(value == null ? "" : value);
        });

        day2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = day2.getText();
            fourthList.setDay2(value == null ? "" : value);
        });

        numberAkt2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = numberAkt2.getText();
            fourthList.setNumberAkt2(value == null ? "" : value);
        });

        depth2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = depth2.getText();
            fourthList.setDepth2(value == null ? "" : value);
        });

        akt2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = akt2.getText();
            fourthList.setAkt2(value == null ? "" : value);
        });

        geolog2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = geolog2.getText();
            fourthList.setGeolog2(value == null ? "" : value);
        });

        driller2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = driller2.getText();
            fourthList.setDriller2(value == null ? "" : value);
        });

        master2.focusedProperty().addListener(( observable ,oldValue, newValue)->{
            String value = master2.getText();
            fourthList.setMaster2(value == null ? "" : value);
        });
    }

}
