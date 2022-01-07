import java.awt.print.PrinterException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Controller {

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
    private Pane firstList;

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

    private ModelFirstList modelFirstList = Single.getInstance().getModelFirstList();

    @FXML
    void onPrinting(ActionEvent event) throws PrinterException, IOException {


        /*Thread t = new Thread(new Runnable() { public void run() {
            modelFirstList = new ModelFirstList( altitudeMark.getText(),  azimuth.getText(),  borehole.getText(),  casingDepth.getText(),
                    compositionRocks.getText(),  coordinates.getText(),  distanceFromTheMouth.getText(),
                    distanceFromTheRiverbed.getText(),  downUp.getText(),
                    drillingDiameterM.getText(),  drillingDiameterMM.getText(),  drillingRig.getText(),  end.getText(),
                    flushing.getText(),  fromTheLine.getText(),  fromTheWell.getText(),  geologist.getText(),  groundFrom.getText(),
                    groundFrom2.getText(),  groundTo.getText(),  groundTo2.getText(),  line.getText(),  passed.getText(),
                    passedOrStopped.getText(),  permafrostFrom.getText(),  permafrostFrom2.getText(),  permafrostTo.getText(),
                    permafrostTo2.getText(),  region.getText(),  rightLeft.getText(),  riverValley.getText(),  start.getText(),
                    surveyor.getText(),  system.getText(),  totalDepth.getText(),  tributary.getText(),  typeOfPlacer.getText(),
                    waterLevel.getText(),  waterLevelStop.getText());
        }});*/



        modelFirstList.setData(altitudeMark.getText(),  azimuth.getText(),  borehole.getText(),  casingDepth.getText(),
                compositionRocks.getText(),  coordinates.getText(),  distanceFromTheMouth.getText(),
                distanceFromTheRiverbed.getText(),  downUp.getText(),
                drillingDiameterM.getText(),  drillingDiameterMM.getText(),  drillingRig.getText(),  end.getText(),
                flushing.getText(),  fromTheLine.getText(),  fromTheWell.getText(),  geologist.getText(),  groundFrom.getText(),
                groundFrom2.getText(),  groundTo.getText(),  groundTo2.getText(),  line.getText(),  passed.getText(),
                passedOrStopped.getText(),  permafrostFrom.getText(),  permafrostFrom2.getText(),  permafrostTo.getText(),
                permafrostTo2.getText(),  region.getText(),  rightLeft.getText(),  riverValley.getText(),  start.getText(),
                surveyor.getText(),  system.getText(),  totalDepth.getText(),  tributary.getText(),  typeOfPlacer.getText(),
                waterLevel.getText(),  waterLevelStop.getText());

        Main main = new Main();
        main.printList("3");
        /*System.out.println("Клик");
        //Second second = new Second();
        firstList.setVisible(false);
        Parent newRoot = FXMLLoader.load(getClass().getResource("second.fxml"));
        container.getScene().setRoot(newRoot);*/

    }

    @FXML
    void initialize() {



    }

}
