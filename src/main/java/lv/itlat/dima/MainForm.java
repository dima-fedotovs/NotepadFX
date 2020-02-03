package lv.itlat.dima;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.sql.*;
import java.util.UUID;

public class MainForm extends BorderPane {

    public TableView<Record> recordsTable;
    public TextField nameSearchText;
    public TextField emailSearchText;
    public TextField phoneSearchText;

    public MainForm() throws IOException {
        var loader = new FXMLLoader(
                getClass().getResource("main.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        loader.load();
    }

    public void initialize() throws SQLException {
        var records = RecordDAO.getAllRecords();
        recordsTable.getItems().setAll(records);
    }

    public void addRecord() throws SQLException {
        var dataEntry = new DataEntryForm(this);
        var data = dataEntry.showAndGet(null);
        if (data != null) {
            recordsTable.getItems().add(data);
            RecordDAO.insertRecord(data);
        }
    }

    public void editRecord() throws SQLException {
        var selected = recordsTable.getSelectionModel().getSelectedItem();
        var dataEntry = new DataEntryForm(this);
        if (dataEntry.showAndGet(selected) != null) {
            RecordDAO.updateRecord(selected);
        }
    }

    public void doSearch() throws SQLException {
        var name = nameSearchText.getText();
        var email = emailSearchText.getText();
        var phone = phoneSearchText.getText();
        var records = RecordDAO.findRecords(name, email, phone);
        recordsTable.getItems().setAll(records);
    }
}
