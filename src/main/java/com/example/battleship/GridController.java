package com.example.battleship;

// gameGrid, gameTracker & startGameButton are the fx:id's tied to this class.

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class GridController {

    @FXML
    Text gameTracker;
    @FXML
    Button startGameButton;
    @FXML
    GridPane gameGrid;


    public void updateTracker(){
        gameTracker.setText("Hello!");
    }

    // public void setGameGrid(){
        //gameGrid.add(Button);
    //}


}
