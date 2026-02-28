package com.nebiy.library.view;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainView {

    public void show(Stage stage) {
        Label label = new Label("Library Management System");

        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 500, 400);

        stage.setTitle("Library System");
        stage.setScene(scene);
        stage.show();
    }
}