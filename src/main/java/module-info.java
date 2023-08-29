module com.example.move_counter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.move_counter to javafx.fxml;
    exports com.example.move_counter;
}