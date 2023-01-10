package com.example.battleship;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Node;


import java.io.IOException;

public class MenuController extends BattleshipMain {

    private Scene scene;
    private FXMLLoader fxmlLoader;
    private Stage stage;

    // Displays a new scene, which consists of the games' grid.
    public void changeScene(ActionEvent event) throws IOException {
        fxmlLoader = new FXMLLoader(BattleshipMain.class.getResource("grid-view.fxml"));
        scene = new Scene(fxmlLoader.load(), 800, 500);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Adds rules text on the right side of the panel.
    public void onMouseEnteredRules(MouseEvent event) throws IOException{

        fxmlLoader = new FXMLLoader(BattleshipMain.class.getResource("menuRules-view.fxml"));
        scene = new Scene(fxmlLoader.load(), 800, 500);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    // Returns to menu's standard state (without rule's text).
    public void onMouseEnteredStartGame(MouseEvent event) throws IOException{

        fxmlLoader = new FXMLLoader(BattleshipMain.class.getResource("menu-view.fxml"));
        scene = new Scene(fxmlLoader.load(), 800, 500);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

}