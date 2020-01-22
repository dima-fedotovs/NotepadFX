package lv.itlat.dima;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage stage) throws Exception {
        var root = new MainController();
        stage.setTitle("Notepad");
        var scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
