module com.example.folketallet {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.folketallet to javafx.fxml;
    exports com.example.folketallet;
}