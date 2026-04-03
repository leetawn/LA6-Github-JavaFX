package com.example.FoodOrderingSystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class OrderPopupController {
    @FXML
    public Label resultLabel;

    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setResult(double amount) {
        resultLabel.setText(String.format("The total price is Php %.2f", amount));
    }
    @FXML
    private void closeWindow() {
        if (stage != null) {
            stage.close();
        }
    }
}


