package kadeewee.weerachat.lab6;

/**
 * This program is Game
 * Class Game is an abstract class
 * This program has 2 constructors.
 *   - No parameters.
 *   - 2 parameters. (gameName, numOfPlayers)
 * This program has a method named playGame that is used for playing games.
 * Method playGame is an abstract method
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: March 6, 2021
 **/

public abstract class Game {
    protected String gameName; //ตัวแปรนี้จะจัดเก็บชื่อเกม
    protected int numOfPlayers; //ตัวแปรนี้จะจัดเก็บจำนวนผู้เล่น

    public Game(){
        gameName = "unknown game"; //กำหนดชื่อเกมเป็น unknown
        numOfPlayers = 0; //กำหนดจำนวนผู้เล่นเป็น 0
    } //constructors นี้จะไม่รับพารามิเตอร์ใดๆ
    public Game(String gameName, int numOfPlayers){
        this.gameName = gameName; //ให้ชื่อเกม(gameName)ในคลาสนี้เหมือนกับชื่อเกม(gameName)ที่รับเข้ามา
        this.numOfPlayers = numOfPlayers; //ให้จำนวนผู้เล่น(numOfPlayers)ในคลาสนี้เหมือนกับจำนวนผู้เล่น(numOfPlayers)ที่รับเข้ามา
    } //constructors นี้จะรับพารามิเตอร์ gameName และ numOfPlayers

    public String getGameName() {
        return gameName;
    }
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }
    public void setNumOfPlayers(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }

    @Override
    public String toString() {
        return null;
    }

    public abstract void playGame(); //เรียกใช้ method playGame(); ของ subclass
}
