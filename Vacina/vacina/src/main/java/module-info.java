module JavaFXApplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.vacina to javafx.fxml;
    opens com.vacina.Controller to javafx.fxml, javafx.graphics;
    exports com.vacina;
}
