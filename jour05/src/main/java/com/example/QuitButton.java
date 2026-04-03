package com.example;

import javafx.application.Platform;
import javafx.scene.control.Button;

public class QuitButton extends Button {
    
    QuitButton(String text) {

        super(text);
        
        this.setOnAction(e -> Platform.exit());
    }
}

