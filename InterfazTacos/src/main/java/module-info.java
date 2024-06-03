module com.example.interfaztacos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.interfaztacos to javafx.fxml;
    exports com.example.interfaztacos;
}