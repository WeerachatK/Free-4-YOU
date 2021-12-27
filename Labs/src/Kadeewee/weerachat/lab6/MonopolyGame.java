package kadeewee.weerachat.lab6;

/**
 * This program is MonopolyGame
 * Class MonopolyGame which inherited from DiceGame.
 * The class also implements interfaces HasRule, UseDice, UseBoard.
 * This program has 2 constructors.
 *   - No parameters.
 *   - 1 parameters. (numOfPlayers)
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: March 6, 2021
 *
 **/

public class MonopolyGame extends DiceGame implements UseBoard, HasRule, UseDice{
    protected int[] cash = new int[8]; //สร้างอาเรย์เก็บ cash ของผู้เล่นแต่ละคน สูงสุด 8 คน
    protected int numOfDice = 2; //กำหนดจำนวนลูกเต๋าเป็น 2

    public MonopolyGame(){
        numOfPlayers = 2; //ให้จำนวนของผู้เล่นเป็น 2
        gameName = "Monopoly Game"; //กำหนดชื่อเกม
        for (int i = 0; i < numOfPlayers; i++){
            cash[i] = 1500;
        } //ใส่จำนวน cash ให้ผู้เล่นแต่ละคน
    } //ไม่รับพารามิเตอร์
    public MonopolyGame(int numOfPlayers){
        this.numOfPlayers = numOfPlayers; //ให้จำนวนผู้เล่นในคลาสนี้เท่ากับจำนวนที่รับมา
        gameName = "Monopoly Game"; //กำหนดชื่อเกม
        for (int i = 0; i < numOfPlayers; i++){
            cash[i] = 1500;
        } //ใส่จำนวน cash ให้ผู้เล่นแต่ละคน
    } //รับพารามิเตอร์ numOfPlayers (จำนวนผู้เล่น)

    public String getCash() {
        String cashString = "";
        for (int i = 0; i < numOfPlayers; i++){
            cashString += cash[i] + " ";
        }
        return cashString;
    } //แสดงจำนวนเงินของผู้เล่น
    public void setCash(int[] cash) {
        this.cash = cash;
    }
    public void playGame() {
        System.out.println("Playing Monopoly Game");
    }

    @Override
    public String toString() {
        return  "Game name : " + gameName + ", " +
                "Number of players : " + numOfPlayers + ", ";
    }

    @Override
    public void setUpBoard() {
        System.out.println("Setting up monopoly board");
    }

    @Override
    public String gameRule() {
        return "Game Rule is ... ";
    }

    @Override
    public int rollDice() {
        return (1*numOfDice) + (int)(Math.random()*(((6*numOfDice)-(1*numOfDice))+ 1 ));
    } //ทอยลูกเต๋า

}
