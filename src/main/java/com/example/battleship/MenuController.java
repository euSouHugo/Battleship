package com.example.battleship;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Node;


import java.io.IOException;

public class MenuController extends BattleshipMain {

    private Scene scene2;
    private FXMLLoader fxmlLoader;
    private Stage stage;

    public void changeScene(ActionEvent event) throws IOException {
        fxmlLoader = new FXMLLoader(BattleshipMain.class.getResource("grid-view.fxml"));
        scene2 = new Scene(fxmlLoader.load(), 800, 500);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene2);
        stage.show();
    }
    public void rulesButtonPressed(ActionEvent event) throws IOException{
        //

    }

}