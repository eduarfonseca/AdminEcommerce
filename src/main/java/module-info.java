module com.example.adminecommerce {
    requires javafx.controls;
    requires javafx.fxml;
    requires gson;


    opens com.example.adminecommerce.Modelos to gson;
    exports com.example.adminecommerce;
    opens com.example.adminecommerce to gson, javafx.fxml;
}