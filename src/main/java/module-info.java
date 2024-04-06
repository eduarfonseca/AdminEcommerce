module com.example.adminecommerce {
    requires javafx.controls;
    requires javafx.fxml;
    requires gson;


    opens com.example.adminecommerce to javafx.fxml;
    exports com.example.adminecommerce;
}