module com.example.museai {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.museai to javafx.fxml;
    exports com.example.museai;
}