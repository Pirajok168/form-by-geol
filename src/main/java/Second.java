import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

public class Second {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    Parent root2;
    @FXML
    private AnchorPane listTwo;

    public Second() throws IOException {
        root2 = FXMLLoader.load(getClass().getResource("second.fxml"));
    }

    public Parent get(){
        return root2;
    }

    @FXML
    void initialize() {

    }

}
