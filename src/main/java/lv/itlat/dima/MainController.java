package lv.itlat.dima;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController extends BorderPane {

    public MainController() throws IOException {
        var loader = new FXMLLoader(
                getClass().getResource("main.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        loader.load();
    }

    public void addRecord() throws IOException {
//        var stage = new Stage();
//
//        Parent root = FXMLLoader.load(
//                getClass().getResource("data-entry.fxml"));
//
//        stage.initOwner(Main.primaryStage);
//        stage.initModality(Modality.NONE);
//
//        stage.setTitle("Add record");
//        var scene = new Scene(root);
//        stage.setScene(scene);
//
//        stage.showAndWait();
    }

}
