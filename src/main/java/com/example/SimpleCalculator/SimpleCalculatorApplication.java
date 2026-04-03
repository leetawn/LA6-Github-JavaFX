package com.example.SimpleCalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SimpleCalculatorApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SimpleCalculatorApplication.class.getResource("simple-calculator.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 240);
        stage.setTitle("Simple Calculator");
        stage.setScene(scene);
        stage.show();
    }
}
