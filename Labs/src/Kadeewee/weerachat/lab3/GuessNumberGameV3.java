package kadeewee.weerachat.lab3;

/**
 * This program is a random number game that is between minNum and maxNum.
 * Get maxTries values from users.
 * If the user guessed the correct number before the game's guessing number was 0.
 * The program will show a message saying "Congratulation! That's correct" means winning the game.
 * In case we get wrong answer, program will tell us to answer higher or lower number.
 * And tells you the number of attempts remaining
 * This program learns three functions: the genAnswer function, the playGame function, and the configGame function.
 *
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: January 15, 2021
 *
 **/

import java.util.Scanner;

public class GuessNumberGameV3 {
    static int correctNum;//Variables that hold values the answer numbers come from random.
    static int minNum = 1, maxNum = 10;//Variables that hold values the lowest number to be randomized and the maximum number that can be randomized.
    static int maxTries = 3; //Variables that hold values number of guesses received from the user.
    public static void main(String[] args) {
        configGame(); //Call the configGame function.
        genAnswer(); //Call the genAnswer function.
        playGame(); //Call the playGame function.
    }
    public static void genAnswer () {
        correctNum = minNum + (int)(Math.random()*((maxNum-minNum)+ 1 )); //Stacking numbers to integers
    }
    public static void playGame () {
        int gameTeies = maxTries; //Make this game's guess equal to the guesswork received from the user.
        Scanner scanner = new Scanner(System.in);
        while (gameTeies > 0) { // This loop will run when this game's guess count is greater than 0
            System.out.print("Please enter a guess (" + minNum + "-" + maxNum + "):");
            int num = scanner.nextInt(); //Gets the number guessed from the user.
            if (num >= minNum && num <= maxNum) { //When the user answers the number that is between "minNum" and "maxNum".
                if (num > correctNum) { //When the user guesses a number greater than the answer The program will output according to this condition.
                    gameTeies = gameTeies - 1; //This game's number of guesses is reduced by 1.
                    System.out.println("Please type a lower number! " +
                            "Number of remaining tries:" + (gameTeies));
                } else if (num < correctNum) { //When the user guesses a number that is less than the answer the program will output according to this condition.
                    gameTeies = gameTeies - 1; //This game's number of guesses is reduced by 1.
                    System.out.println("Please type a higher number! " +
                            "Number of remaining tries:" + (gameTeies));
                } else if (num == correctNum) { //When the user guesses the right way, the program will output this condition and end the game.
                    System.out.println("Congratulation! That's correct");
                    gameTeies = 0;
                }
            } else { //// When the user answers a number that is not between "minNum" and "maxNum".
                System.out.println("The guess number must be in the range "
                        + minNum + " and " + maxNum);
            }
        }
        while (gameTeies == 0) { //This loop will run when this game's guess count is 0
            System.out.print("If want to play again? type 'y' to continue or 'q' to quit:");
            String playAgain = scanner.next(); //Get answers from users.
            if (playAgain.equals("y")) { //If the user answers "y".
                genAnswer (); //Call the playGame function.
                playGame(); //Call the playGame function.
            } else { // If the user answers other than "y"
                System.exit(0); //Exit the program.
            }
        }
    }
    public static void configGame () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the min and max values:");
        minNum = scanner.nextInt(); //Gets value the lowest number to be randomized from user.
        maxNum = scanner.nextInt(); //Gets value the maximum number that can be randomized from user.
        System.out.print("Enter the number of tries:");
        maxTries = scanner.nextInt(); ////Gets value number of guesses from user.
    }
}
