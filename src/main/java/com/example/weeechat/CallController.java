package com.example.weeechat;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class CallController extends BaseController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cancel.setOnAction(e -> {
            changeView("chat-view.fxml");
        });
    }

    @FXML
    private Button cv1;
    @FXML
    private Button cv2;
    @FXML
    private Button cv3;
    @FXML
    private Button cv4;
    @FXML
    private Button cancel;
    @FXML
    private AnchorPane bg;
}
