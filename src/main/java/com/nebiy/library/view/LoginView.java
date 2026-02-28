package com.nebiy.library.view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginView {

    public void show(Stage stage) {

        Label title = new Label("Library Login");

        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        Button loginButton = new Button("Login");

        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(title, usernameField, passwordField, loginButton);

        Scene scene = new Scene(layout, 400, 300);

        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }
}