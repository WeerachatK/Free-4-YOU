package kadeewee.weerachat.lab3;

/**
 * This program is a random number game that is between (1-10).
 * With the possibility of allowing us to tries 3 times.
 * If we guess the number correctly within 3 times.
 * The program will output that"Congratulation! That's correct" means winning the game.
 * In case we answer incorrectly The program will tell us to answer the numbers higher or lower.
 * And tell the number of times remaining in the tries.
 * This program will learn to use two functions, the genAnswer function. And function playGame.
 *
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: January 15, 2021
 *
 **/

import java.util.Scanner;

public class GuessNumberGameV2 {
    static int correctNum; //Variables that hold values the answer numbers come from random.
    static int minNum = 1, maxNum =10; //The lowest number to be randomized and the maximum number that can be randomized.
    public static void main(String[] args) {
        genAnswer(); //Call the genAnswer function.
        playGame(); //Call the playGame function.
    }
    public static void genAnswer () {
        correctNum = minNum + (int)(Math.random()*((maxNum-minNum)+ 1 )); //Stacking numbers to integers
    }
    public static void playGame () {
        int tries = 3;//Number of guesses
        Scanner scanner = new Scanner(System.in);
        while (tries > 0) {//This loop will run when the number of guesses is greater than 0.
            tries = tries - 1; //Every time I repeat The number of guesses has decreased by 1.
            System.out.print("Please enter a guess (1-10):");
            int num = scanner.nextInt(); //Gets the number guessed from the user.
            if (num > correctNum) { //When the user guesses a number greater than the answer the program will output according to this condition.
                System.out.println("Please type a lower number! " +
                        "Number of remaining tries:" + (tries));
            } else if (num < correctNum) { //When the user guesses a number that is less than the answer the program will output according to this condition.
                System.out.println("Please type a higher number! " +
                        "Number of remaining tries:" + (tries));
            } else if (num == correctNum) { //When the user guesses the right way, the program will output this condition and exit the program.
                System.out.println("Congratulation! That's correct");
                System.exit(0);
            }//This loop will end when the number of guesses is 0. And will exit the program
        }
    }
}
