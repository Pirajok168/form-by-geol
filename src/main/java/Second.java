import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
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



    public Parent get(){
        return root2;
    }


    @FXML
    void onKk(ActionEvent event) {
        System.out.println("qwe");
    }

    @FXML
    void initialize() {

    }

}
