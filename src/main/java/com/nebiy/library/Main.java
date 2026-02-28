package com.nebiy.library;

import javafx.application.Application;
import javafx.stage.Stage;
import com.nebiy.library.view.MainView;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        MainView mainView = new MainView();
        mainView.show(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}