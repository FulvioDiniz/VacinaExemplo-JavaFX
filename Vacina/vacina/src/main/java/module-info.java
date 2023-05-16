module com.vacina {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.vacina to javafx.fxml;
    exports com.vacina;
}
