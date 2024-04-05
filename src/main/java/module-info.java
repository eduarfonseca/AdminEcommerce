module com.example.adminecommerce {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.adminecommerce to javafx.fxml;
    exports com.example.adminecommerce;
}