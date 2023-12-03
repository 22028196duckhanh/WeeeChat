package com.example.weeechat;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class BaseController {
    public void changeView(String s) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(s));
            Scene scene = new Scene(fxmlLoader.load());
            ChatApp.primaryStage.setScene(scene);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}