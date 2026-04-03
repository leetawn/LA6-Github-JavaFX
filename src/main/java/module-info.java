module com.example.la6github {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.FoodOrderingSystem to javafx.fxml;
    exports com.example.FoodOrderingSystem;

    opens com.example.NumberCounter to javafx.fxml;
    exports com.example.NumberCounter;

    opens com.example.SimpleCalculator to javafx.fxml;
    exports com.example.SimpleCalculator;
}