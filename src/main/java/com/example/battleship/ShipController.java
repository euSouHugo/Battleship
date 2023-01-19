package com.example.battleship;

public class ShipController {

    public int type;
    public boolean vertical;
    private int health;

    public ShipController(int type, boolean vertical){
        this.type = type;
        this.vertical = vertical;
        this.health = type;

    }
    public void hit(){
        health--;
    }
    public boolean isAlive(){
        return health>0;
    }

}
