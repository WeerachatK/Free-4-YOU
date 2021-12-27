package kadeewee.weerachat.lab4;

/**
 * This program is GuessNumberGameV3 Improved version
 * GuessNumberGameV4 Can work like GuessNumberGameV3
 * You can type 'a' to show all the numbers you have guessed in playing this game.
 * You can type 'g' and type the round you guessed. To see the number you guessed in that round.
 *
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: January 22, 2021
 *
 **/

import java.util.Scanner;

public class GuessNumberGameV4 {
    static int correctNum;//Variables that hold values the answer numbers come from random.
    static int minNum = 1, maxNum = 10;//Variables that hold values the lowest number to be randomized and the maximum number that can be randomized.
    static int maxTries = 3; //Variables that hold values number of guesses received from the user.
    static int[] guesses; //This array stores all the numbers that the user guessed.
    static int numGuesses = 0; //This variable stores the numbers that the user guessed.
    public static void main(String[] args) {
        configGame(); //Call the configGame function.
        genAnswer(); //Call the genAnswer function.
        playGame(); //Call the playGame function.
    }
    public static void genAnswer () {
        correctNum = minNum + (int)(Math.random()*((maxNum-minNum)+ 1 ));
    } //Stacking numbers to integers
    public static void playGame () {
        int count = 0;
        int position = 0;
        int gameTeies = maxTries; //Make this game's guess equal to the guesswork received from the user.
        Scanner scanner = new Scanner(System.in);
        guesses = new int[maxTries];
        while (gameTeies > 0) { // This loop will run when this game's guess count is greater than 0
            System.out.print("Please enter a guess (" + minNum + "-" + maxNum + "):");
            numGuesses = scanner.nextInt(); //Gets the number guessed from the user.
            if (numGuesses >= minNum && numGuesses <= maxNum) { //When the user answers the number that is between "minNum" and "maxNum".
                while (position<maxTries) {
                    guesses [position] = numGuesses;
                    count = count + 1;
                    position = position + 1;
                    if (numGuesses > correctNum) { //When the user guesses a number greater than the answer The program will output according to this condition.
                        gameTeies = gameTeies - 1; //This game's number of guesses is reduced by 1.
                        System.out.println("Please type a lower number! " +
                                "Number of remaining tries:" + (gameTeies));
                        break;
                    } else if (numGuesses < correctNum) { //When the user guesses a number that is less than the answer the program will output according to this condition.
                        gameTeies = gameTeies - 1; //This game's number of guesses is reduced by 1.
                        System.out.println("Please type a higher number! " +
                                "Number of remaining tries:" + (gameTeies));
                        break;
                    } else if (numGuesses == correctNum) { //When the user guesses the right way, the program will output this condition and end the game.
                        System.out.println("Congratulation! That's correct");
                        gameTeies = 0;
                        break;
                    }
                }
            } else { //// When the user answers a number that is not between "minNum" and "maxNum".
                System.out.println("The guess number must be in the range "
                        + minNum + " and " + maxNum);
            }
        }
        while (gameTeies == 0) { //This loop will run when this game's guess count is 0
            System.out.println("If want to play again? type 'y' to continue or 'q' to quit:");
            System.out.println("Type 'a' to see all your guesses or 'g' to see a guesses on a specific play.");
            /*System.out.println("Type 'a' to see all your guesses or 's' to see a guesses on a specific play.");
            System.out.println("Type 'v' to see average or 'm' to see minimum or 'x' to see maximum of all your guesses");*/
            String playAgain = scanner.next(); //Get answers from users.
            if (playAgain.equals("y")) { //If the user answers "y".
                genAnswer (); //Call the playGame function.
                playGame(); //Call the playGame function.
            }
            else if (playAgain.equals("a")) { //When users type "a"
                numGuesses = count;
                showGuesses (); //Call the method showGuesses.
            } else if (playAgain.equals("g")) { //When users type "g"
                showSpecific (); //Call the method showSpecific.
            } else { // If the user answers other than "y" , "a" and "g"
                System.exit(0); //Exit the program.
            }
        }
    } //Method used to play the game.
    public static void configGame () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the min and max values:");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        if (firstNum > secondNum) {
            maxNum = firstNum;
            minNum = secondNum;
        } else if (firstNum < secondNum) {
            maxNum = secondNum;
            minNum = firstNum;
        } else if (firstNum == secondNum) {
            maxNum = firstNum;
            minNum = secondNum;
        }
        System.out.print("Enter the number of tries:");
        maxTries = scanner.nextInt(); ////Gets value number of guesses from user.
    } //This method stores the maximum and minimum values that can be projected. And the number of times the user can guess from user.
    public static void showSpecific () {
        Scanner scanner = new Scanner(System.in);
        int show = 0;
        while (true) {
            System.out.println("Enter which guess in the range (1-" + numGuesses + ")");
            show = scanner.nextInt();
            if (show < numGuesses && show > 0){
                break;
            }
        }
        System.out.println("Guess number " + show + " is " + guesses[(show-1)]);
    } //This method will show you the numbers you guessed in the round that you want to know.
    public static void showGuesses () {
        for (int i = 0; i<numGuesses; i++) {
            System.out.print(guesses[i] + " ");
        }
        System.out.println("");
    } //This method shows all the numbers you have guessed in the game.
}
