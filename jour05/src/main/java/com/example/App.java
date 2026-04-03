package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a simple label with "Hello, World!"
        Label helloLabel = new Label("Hello, World!");

        // Use a StackPane to center the label in the window
        StackPane root = new StackPane();
        root.getChildren().add(helloLabel);

        // Create a scene with the root node and set its size
        Scene scene = new Scene(root, 400, 200);

        // Set the title of the window (stage)
        primaryStage.setTitle("JavaFX Hello World");

        // Attach the scene to the stage
        primaryStage.setScene(scene);

        // Show the window
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}