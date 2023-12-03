package com.example.weeechat;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ChatController extends BaseController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

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
}
