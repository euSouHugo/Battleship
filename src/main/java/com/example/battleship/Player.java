package com.example.battleship;

public class Player {

    private int numberOfShips;
    private String playerName;
    private boolean yourTurn;

    // Setting constructor
    public Player(String creatingPlayerInput){
        this.playerName = creatingPlayerInput;
        this.numberOfShips = 11;
        this.yourTurn = false;
    }

   public void createPlayer1(String creatingPlayerInput){
        Player player1 = new Player(creatingPlayerInput);
   }
   public void createPlayer2(String creatingPlayerInput){
       Player player2 = new Player(creatingPlayerInput);
   }
    public void teste3(){                                               // just a test to check hierarchy doubts.
        System.out.println("Teste 3!");

    }

}
