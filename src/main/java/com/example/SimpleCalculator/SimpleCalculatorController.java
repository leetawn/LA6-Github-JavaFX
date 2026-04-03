package com.example.SimpleCalculator;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SimpleCalculatorController {
    @FXML
    private TextField tfNumber1, tfNumber2;
    @FXML
    private ComboBox<String> cbOperations;
    @FXML
    private Label lblResult;

    @FXML
    protected void computeResult() {
        double first, second;
        try {
            first = Double.parseDouble(tfNumber1.getText());
            second = Double.parseDouble(tfNumber2.getText());
        } catch (NumberFormatException e) {
            lblResult.setText("Invalid inputs!");
            return;
        }
        String operationString = cbOperations.getValue();
        if (operationString == null) {
            lblResult.setText("No operation selected.");
            return;
        }
        char operation = operationString.charAt(0);
        double ans = 0;
        switch (operation) {
            case '+': ans = first + second; break;
            case '-': ans = first - second; break;
            case '*': ans = first * second; break;
            case '/': ans = first / second; break;
        }

        // 6 decimal places para cool and normal
        lblResult.setText(String.format("%.6f", ans));
    }
}
