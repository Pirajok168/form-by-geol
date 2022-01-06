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
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private VBox container;

    @FXML
    private Pane firstList;

    @FXML
    private TextField region;

    @FXML
    private Font x3;

    @FXML
    private Color x4;

    @FXML
    void onPrinting(ActionEvent event) throws PrinterException, IOException {
        System.out.println("Клик");
        //Second second = new Second();
        firstList.setVisible(false);
        Parent newRoot = FXMLLoader.load(getClass().getResource("second.fxml"));
        container.getScene().setRoot(newRoot);
    }

    @FXML
    void initialize() {



    }

}
