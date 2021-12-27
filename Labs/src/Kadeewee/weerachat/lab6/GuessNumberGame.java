package kadeewee.weerachat.lab6;

/**
 * This program is GuessNumberGame
 * Class GuessNumberGame which inherited from Game.
 * This program has 3 constructors.
 *   - No parameters.
 *   - 2 parameters. (answer)
 *   - 3 parameters. (answer)
 * This program has a method named playGame that is used for playing games.
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: March 6, 2021
 **/

import java.util.Scanner;

public class GuessNumberGame extends Game{
    protected int minNum;
    protected int maxNum;
    protected int correctNum;
    protected int maxTries;
    protected static int numOfGames = 0;

    public GuessNumberGame(){
        super("Guess Number Game", 1); //ส่งค่าในวงเล็บไปยัง superclass และเรียกใช้ constructors
        minNum = 1; //ให้เลขต่ำสุดเป็น 1
        maxNum = 10; //ให้เลขสูงสุดเป็น 10
        maxTries = 3; //ให้จำนวนของการเดาเป็น 3
        correctNum = minNum + (int)(Math.random()*((maxNum-minNum)+ 1 )); //จัดเก็บตัวเลขที่สุ่ม
        numOfGames++; //จำนวนในการเล่นเพิ่มขึ้น1
    }
    public GuessNumberGame(int minNum, int maxNum){
        super("Guess Number Game", 1);
        this.minNum = minNum; //ให้ตัวแปรในคลาสมีค่าเท่ากับพารามิเตอร์ที่รับมา
        this.maxNum = minNum;
        correctNum = minNum + (int)(Math.random()*((maxNum-minNum)+ 1 ));
        numOfGames++;
    } //รับ 2 พารามิเตอร์
    public GuessNumberGame(int minNum, int maxNum,int maxTries){
        super("Guess Number Game", 1);
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = maxTries;
        correctNum = minNum + (int)(Math.random()*((maxNum-minNum)+ 1 ));
        numOfGames++;
    } //รับ 3 พารามิเตอร์

    public int getMinNum() {
        return minNum;
    }

    public void setMinNum(int minNum) {
        this.minNum = minNum;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public int getMaxTries() {
        return maxTries;
    }

    public void setMaxTries(int maxTries) {
        this.maxTries = maxTries;
    }

    @Override
    public String toString() {
        return "Game name : " + super.gameName +
                ", Number of players : " + super.numOfPlayers +
                ", Min is " + minNum +
                ", Max is " + maxNum +
                ", Number of tries is " + maxTries ;
    }

    @Override
    public void playGame () {
        int tries = maxTries;//Number of guesses
        Scanner scanner = new Scanner(System.in);
        while (tries > 0) {//This loop will run when the number of guesses is greater than 0.
            tries--; //Every time I repeat The number of guesses has decreased by 1.
            System.out.print("Please enter a guess (" + minNum + "-" + maxNum + "):");
            int guessNum = scanner.nextInt(); //Gets the number guessed from the user.
            if (guessNum > correctNum) { //When the user guesses a number greater than the answer the program will output according to this condition.
                System.out.println("Please type a lower number! " +
                        "Number of remaining tries:" + (tries));
            } else if (guessNum < correctNum) { //When the user guesses a number that is less than the answer the program will output according to this condition.
                System.out.println("Please type a higher number! " +
                        "Number of remaining tries:" + (tries));
            } else if (guessNum == correctNum) { //When the user guesses the right way, the program will output this condition and exit the program.
                System.out.println("Congratulation! That's correct");
                break;
            }//This loop will end when the number of guesses is 0. And will exit the program
        }
    } //Call this method to play the game.

}
