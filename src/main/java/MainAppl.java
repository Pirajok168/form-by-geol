import View.Single;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainAppl extends Application {
    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Single.getInstance();
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        stage.setTitle("My app");
        stage.setScene(new Scene(root, 1800,1000));
        stage.show();
    }
}
