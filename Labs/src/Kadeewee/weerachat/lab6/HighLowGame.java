package kadeewee.weerachat.lab6;

/**
 * This program is HighLowGame
 * Class HighLowGame which inherited from DiceGame.
 * The class also implements interfaces HasRule, UseDice.
 * This program has 3 constructors.
 *   - No parameters.
 *   - 1 parameters. (numOfDice)
 *   - 2 parameters. (numOfDice, answer)
 * This program has a method named playGame that is used for playing games.
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: March 6, 2021
 *
 **/

public class HighLowGame extends DiceGame implements HasRule, UseDice{
    protected int numOfDice;
    public HighLowGame(){
        gameName = "High-Low Game"; //กำหนดชื่อเกม
        numOfPlayers = 1; //จำนวนผู้เล่น 1 คน
        numOfDice = 3; //จำนวนลูกเต๋ม 3 ลูก
        diceRoll = rollDice(); //เรียกใช้ rollDice method (ทอยลูกเต๋า)
    } //ไม่รับพารามิเตอร์
    public HighLowGame(int numOfDice){
        //super();
        gameName = "High-Low Game";
        numOfPlayers = 1;
        this.numOfDice = numOfDice; //ให้จำนวนลูกเต๋าในคลาสเท่ากับจำนวนที่รับมา
        diceRoll = rollDice();
    } //รับพารามิเตอร์ numOfDice(จำนวนลูกเต๋า)
    public HighLowGame(int numOfDice, String answer){
        //super();
        gameName = "High-Low Game";
        numOfPlayers = 1;
        this.numOfDice = numOfDice;//ให้จำนวนลูกเต๋าในคลาสเท่ากับจำนวนที่รับมา
        this.answer = answer;//ให้คำตอบของผู้เล่นในคลาสเท่ากับคำตอบที่รับมา
        diceRoll = rollDice();
    } //รับพารามิเตอร์ numOfDice(จำนวนลูกเต๋า) และ answer(คำตอบที่ผู้เล่นเดา)

    public int getNumOfDice() {
        return numOfDice;
    }

    public void setNumOfDice(int numOfDice) {
        this.numOfDice = numOfDice;
    }

    public void playGame() {
        if (answer.equalsIgnoreCase("h")) {
            if (diceRoll > (numOfDice * 6 - numOfDice + 1) / 2 + numOfDice - 1) {
                System.out.println("Congratulation. You win.");
            } else {
                System.out.println("Sorry. You lose.");
            }
        }
        if (answer.equalsIgnoreCase("l")) {
            if (diceRoll <= (numOfDice * 6 - numOfDice + 1) / 2 + numOfDice - 1) {
                System.out.println("Congratulation. You win.");
            } else {
                System.out.println("Sorry. You lose.");
            }
        }
    } //ใช้สำหรับเล่นเกม(เขียบทับ playGame method ใน superclass)
    @Override
    public String toString() {
        return //"is " + diceRoll;
                "Game name : " + gameName + ", " +
                "Number of players : " + numOfPlayers + ", " +
                "Dice roll : " + diceRoll + ", " +
                "Player's Guess : " + answer + ", " +
                "Number of dice is " + numOfDice + ", ";
    }

    @Override
    public String gameRule() {
        return "Game Rule is ... ";
    }

    @Override
    public int rollDice() {
        return (1*numOfDice) + (int)(Math.random()*(((6*numOfDice)-(1*numOfDice))+ 1 ));
    }
}
