package com.example.NumberCounter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class NumberCounterController {
    @FXML
    private Label countLabel;
    private int count;

    @FXML
    public void initialize() {
        count = Integer.parseInt(countLabel.getText());
    }

    @FXML
    protected void increaseCount() {
        count++;
        countLabel.setText(String.valueOf(count));
    }

    @FXML
    protected void decreaseCount() {
        count--;
        countLabel.setText(String.valueOf(count));
    }
}
