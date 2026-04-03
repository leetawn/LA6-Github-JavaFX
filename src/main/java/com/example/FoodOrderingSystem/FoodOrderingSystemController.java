package com.example.FoodOrderingSystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FoodOrderingSystemController {
    @FXML
    private CheckBox cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae;
    @FXML
    private RadioButton rbNone, rb5, rb10, rb15;
    private double amount, discount;

    @FXML
    public void initialize() {
        this.amount = 0;
    }

    public void selectFood() {
        if (cPizza.isSelected()) {
            amount += 100;
        }
        if (cBurger.isSelected()) {
            amount += 80;
        }
        if (cFries.isSelected()) {
            amount += 65;
        }
        if (cSoftDrinks.isSelected()) {
            amount += 55;
        }
        if (cTea.isSelected()) {
            amount += 50;
        }
        if (cSundae.isSelected()) {
            amount += 40;
        }
    }

    public void selectDiscount() {
        if (rbNone.isSelected()) {
            discount = 0.0;
        }
        if (rb5.isSelected()) {
            discount = 5.0;
        }
        if (rb10.isSelected()) {
            discount = 10.0;
        }
        if (rb15.isSelected()) {
            discount = 15.0;
        }
    }

    @FXML
    protected void orderFood() {
        System.out.println("ORDRED");
        selectFood();
        selectDiscount();

        double finalPrice = amount - (amount * discount / 100);
        try {
            FXMLLoader loader = new FXMLLoader(FoodOrderingSystemApplication.class.getResource("order-popup.fxml"));
            VBox orderPopup = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Order Summary");
            stage.setScene(new Scene(orderPopup));

            OrderPopupController resultController = loader.getController();
            resultController.setStage(stage);
            resultController.setResult(finalPrice);

            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
