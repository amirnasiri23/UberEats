module com.example.ubereats {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.ubereats to javafx.fxml;
    exports com.example.ubereats;
}