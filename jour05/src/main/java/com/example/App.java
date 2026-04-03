package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {

    // launch the application
    public void start(Stage stage)
    {

        try {

            // set title for the stage
            stage.setTitle("My First JavaFX Stage");

            // create a label
            Label label = new Label("An exemple of a BorderPane");
            // create a QuitButton
            QuitButton quitButton = new QuitButton("Quit App");

            // create a BorderPane with the label in the center 
            BorderPane borderPane = new BorderPane();
            borderPane.setCenter(label);
            borderPane.setBottom(quitButton);


            // create a scene
            Scene scene = new Scene(borderPane, 400, 300);

            // set the scene
            stage.setScene(scene);

            stage.show();
        }

        catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    // Main Method
    public static void main(String args[])
    {

        // launch the application
        launch(args);
    }
}
