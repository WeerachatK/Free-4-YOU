package kadeewee.weerachat.lab5;

/**
 * This program is GuessNumberGameVer1
 * This program has 3 constructors.
 *   - No parameters.
 *   - 2 parameters. (minNum, maxNum)
 *   - 3 parameters. (minNum, maxNum, maxTries)
 * This program has a method named playGame that is used for playing games.
 *
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: January 15, 2021
 **/

import java.util.Scanner;

public class GuessNumberGameVer1 {
    protected int minNum; //Minimum number to be random.
    protected int maxNum; //The maximum number to be random.
    protected int correctNum; //Variables that hold values the answer numbers come from random.
    protected int maxTries; //Maximum number of guesses.
    protected static int numOfGames = 0; //Number of times to play the game.

    public GuessNumberGameVer1() {
        minNum = 1;
        maxNum = 10;
        maxTries = 3;
        correctNum = minNum + (int)(Math.random()*((maxNum-minNum)+ 1 )); //Random number of correctNum.
        numOfGames++; //The number of times the game is played increases by 1.
    } //The constructor takes no parameters.
    public GuessNumberGameVer1(int minNum, int maxNum) {
        this.minNum = minNum; //The minNum of this class is the same as the minNum that the constructor receives.
        this.maxNum = maxNum; //The maxNum of this class is the same as the maxNum that the constructor receives.
        this.maxTries = 3;
        correctNum = minNum + (int)(Math.random()*((maxNum-minNum)+ 1 )); //Random number of correctNum.
        numOfGames++; //The number of times the game is played increases by 1.
    } //The constructor accepts the first integer which will be used to initialize minNum and the second integer which will be used to initialize maxNum
    public GuessNumberGameVer1(int minNum, int maxNum, int maxTries) {
        this.minNum = minNum; //The minNum of this class is the same as the minNum that the constructor receives.
        this.maxNum = maxNum; //The maxNum of this class is the same as the maxNum that the constructor receives.
        this.maxTries = maxTries; //The maxTries of this class is the same as the maxTries that the constructor receives.
        correctNum = minNum + (int)(Math.random()*((maxNum-minNum)+ 1 )); //Random number of correctNum.
        numOfGames++; //The number of times the game is played increases by 1.
    } //The constructor accepts three parameters. The first two integers will be used to initialize minNum and maxNum while the third integer will be used to initialize maxTries

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
    public static int getNumOfGames() {
        return numOfGames;
    }

    @Override
    public String toString() {
        return "GuessNumberGame with min number as " + minNum + " max number as " + maxNum + " max number of tries as " + maxTries;
    } //Converts position data to string.

}


