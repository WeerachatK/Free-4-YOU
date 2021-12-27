package kadeewee.weerachat.lab6;

/**
 * This program is DiceGame
 * Class DiceGame which inherited from Game.
 * This program has 2 constructors.
 *   - No parameters.
 *   - 1 parameters. (answer)
 * This program has a method named playGame that is used for playing games.
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: March 6, 2021
 *
 **/

import java.util.Scanner;

public class DiceGame extends Game{
    Scanner scanner = new Scanner(System.in);
    protected int diceRoll; // จัดเก็บแต้มของลูกเต๋าที่ทอยได้
    protected String answer; //จัดเก็บคำตอบที่ผู้เล่นเดา

    public DiceGame(){
        super("DiceGame", 1); //ส่งค่า gameName และ numOfPlayers ไปยัง superclass
        diceRoll = 1 + (int)(Math.random()*((6-1)+ 1 )); //ทอยลูกเต๋า
        answer = "l"; //กำหนดให้คำตอบที่เดาเป็น l (เดาว่าเป็นต่ำ)
    } //constructors นี้จะไม่รับพารามิเตอร์ใดๆ
    public DiceGame(String answer){
        super("DiceGame", 1);
        diceRoll = 1 + (int)(Math.random()*((6-1)+ 1 )); //ทอยลูกเต๋า
        this.answer = answer; //ให้ชื่อคำตอบที่เดา(answer)ในคลาสนี้เหมือนกับคำตอบที่เดา(answer)ที่รับเข้ามา
    } //constructors นี้จะรับพารามิเตอร์ answer

    public int getDiceRoll() {
        return diceRoll;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Game name : " + gameName +
                ", Number of players : " + super.numOfPlayers +
                ", Dice roll : " + diceRoll +
                ", Player's guess : " + answer;
    }

    @Override
    public void playGame() {
        if (answer.equalsIgnoreCase("h")) {
            if (diceRoll > 3) { //ถ้าถูก
                System.out.println("Congratulation. You win.");
            } else { //ถ้าผิด
                System.out.println("Sorry. You lose.");
            }
        } // ถ้าเดาว่าเป็นสูง
        if (answer.equalsIgnoreCase("l")) {
            if (diceRoll <= 3) { //ถ้าถูก
                System.out.println("Congratulation. You win.");
            } else { //ถ้าผิด
                System.out.println("Sorry. You lose.");
            } // ถ้าเดาว่าเป็นต่ำ
        }
    }
}
