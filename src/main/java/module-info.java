module com.example.weeechat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.weeechat to javafx.fxml;
    exports com.example.weeechat;
}