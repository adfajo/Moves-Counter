module com.example.move_counter {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;


    opens com.example.move_counter to javafx.fxml;
    exports com.example.move_counter;
}