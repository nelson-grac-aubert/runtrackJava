package com.example;

import javafx.application.Platform;
import javafx.scene.control.Button;

public class QuitButton extends Button {
    
    QuitButton(String text) {
        // Use the constructor of the Button class to set a text
        super(text);
        
        // Method to set the action of a button
        this.setOnAction(e -> Platform.exit());
    }
}

