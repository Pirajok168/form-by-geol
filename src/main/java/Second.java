import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class Second {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    Parent root2;
    @FXML
    private AnchorPane listTwo;
    @FXML
    private VBox container;



    public Parent get(){
        return root2;
    }




    @FXML
    void onClickToFirstList(MouseEvent event) throws IOException {
        Parent newRoot = FXMLLoader.load(getClass().getResource("sample.fxml"));
        container.getScene().setRoot(newRoot);
    }

    @FXML
    void initialize() {

    }

}
