package lv.itlat.dima;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class MainForm extends BorderPane {

    public TableView<Record> recordsTable;

    public MainForm() throws IOException {
        var loader = new FXMLLoader(
                getClass().getResource("main.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        loader.load();
    }

    public void addRecord() {
        var dataEntry = new DataEntryForm(this);
        var data = dataEntry.showAndGet();
        if (data != null) {
            recordsTable.getItems().add(data);
        }
    }

    public void editRecord() {
        var selected = recordsTable.getSelectionModel().getSelectedItem();
        System.out.println(selected.getName());
    }
}
