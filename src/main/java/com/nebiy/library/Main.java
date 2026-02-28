package com.nebiy.library;
import com.nebiy.library.view.LoginView;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
       LoginView loginView = new LoginView();
    loginView.show(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}