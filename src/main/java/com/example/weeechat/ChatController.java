package com.example.weeechat;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class ChatController extends BaseController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        back.setOnAction(e -> {
            changeView("menu-view.fxml");
        });
        call.setOnAction(e -> {
            changeView("call-view.fxml");
        });
        call_video.setOnAction(e -> {
            changeView("call-view.fxml");
        });
    }

    @FXML
    private Button add;
    @FXML
    private Button add_image;
    @FXML
    private Button add_sticker;
    @FXML
    private Button add_gif;
    @FXML
    private Button symbol;
    @FXML
    private Button call;
    @FXML
    private Button call_video;
    @FXML
    private Button info;
    @FXML
    private Button back;
    @FXML
    private TextField chat;
    @FXML
    private Pane toolBar;
    @FXML
    private Pane messageArea;
    @FXML
    private Pane chatBar;
}
