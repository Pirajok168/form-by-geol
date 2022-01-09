import View.Single;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class TestFx extends Application{

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Single single = Single.getInstance();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("My app");
        stage.setScene(new Scene(root, 700,700));
        stage.show();
    }
}