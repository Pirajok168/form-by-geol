import java.awt.print.PrinterException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane list;

    @FXML
    private AnchorPane MainView;

    @FXML
    private Button print;

    @FXML
    private Font x1;

    @FXML
    private Color x2;

    @FXML
    private Font x3;

    @FXML
    private Color x4;

    @FXML
    void onPrinting(ActionEvent event) throws PrinterException {
        System.out.println("Клик");
        Main main = new Main();
        main.printList();

    }

    @FXML
    void initialize() {
        assert MainView != null : "fx:id=\"MainView\" was not injected: check your FXML file 'Untitled'.";
        assert print != null : "fx:id=\"print\" was not injected: check your FXML file 'Untitled'.";
        assert x1 != null : "fx:id=\"x1\" was not injected: check your FXML file 'Untitled'.";
        assert x2 != null : "fx:id=\"x2\" was not injected: check your FXML file 'Untitled'.";
        assert x3 != null : "fx:id=\"x3\" was not injected: check your FXML file 'Untitled'.";
        assert x4 != null : "fx:id=\"x4\" was not injected: check your FXML file 'Untitled'.";


    }

}
