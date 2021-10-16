package com.jakubwasikowski.javafxbackgroundtasks;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class Controller {

    private Task<ObservableList<String>> task;

    @FXML
    private ListView listView;

    public void initialize() {
        task = new Task<>() {
            @Override
            protected ObservableList<String> call() throws Exception {
                Thread.sleep(1000);

                final ObservableList<String> employees = FXCollections.observableArrayList(
                        "Jim Wasikowski",
                        "Bill Rogers",
                        "Jack Jill",
                        "Joan Andrews",
                        "Mary Johnson",
                        "Bob McDonald");

                return employees;
            }
        };

        listView.itemsProperty().bind(task.valueProperty());


    }

    @FXML
    public void buttonPressed() {
        new Thread(task).start();
    }
}