module com.example.adminecommerce {
    requires javafx.controls;
    requires javafx.fxml;
    requires gson;


    opens com.example.adminecommerce to javafx.fxml;
    opens com.example.adminecommerce.Modelos to gson;
    exports com.example.adminecommerce;
}