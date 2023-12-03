package com.example.weeechat;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuController extends BaseController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        start.setOnAction(e -> {
            changeView("chat-view.fxml");
        });

        exit.setOnAction(e -> {
            System.exit(0);
        });
    }

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Button start;

    @FXML
    private Button exit;


}
