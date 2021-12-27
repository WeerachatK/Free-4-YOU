package kadeewee.weerachat.lab5;

/**
 * This program is GuessNumberGameVer2 Developed from GuessNumberGameVer1.
 * GuessNumberGameVer2 Use variables and method in conjunction with GuessNumberGameVer1.
 * This program has 3 constructors.
 *   - No parameters.
 *   - 2 parameters. (minNum, maxNum)
 *   - 3 parameters. (minNum, maxNum, maxTries)
 * This program has a method named playGame that is used for playing games.
 * This program has a method named showSpecific used for show you the numbers you guessed in the round that you want to know.
 * This program has a method named showGuesses used for shows all the numbers you have guessed in the game.
 * This program has a method named playGames used for play game then asks the user if they want to quit, play again, or if they want to know other values.
 *
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: January 15, 2021
 *
 **/

import java.util.Scanner;

public class GuessNumberGameVer2 extends GuessNumberGameVer1{
    protected  int[] guesses;
    protected int numGuesses = 0;
    final int MAX_GUESSES = 20;
    protected static int countOfNum = 0;

    public GuessNumberGameVer2() {
        super(); //Call the variable in GuessNumberGameVer1.
        guesses = new int[MAX_GUESSES]; //Set the size of the array guesses.
    }
    public GuessNumberGameVer2(int minNum, int maxNum) {
        super(minNum, maxNum); //Call the variable in GuessNumberGameVer1.
        guesses = new int[MAX_GUESSES]; //Set the size of the array guesses.
    }
    public GuessNumberGameVer2(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries); //Call the variable in GuessNumberGameVer1.
        guesses = new int[MAX_GUESSES]; //Set the size of the array guesses.
    }

    public void playGames() {
        playGame(); //Call the playGame function.
        Scanner scanner = new Scanner(System.in);
        while (true) { //This loop will run when this game's guess count is 0
            System.out.println("If want to play again? type 'y' to continue or 'q' to quit:");
            System.out.println("Type 'a' to see all your guesses or 'g' to see a guesses on a specific play.");
            String playAgain = scanner.next(); //Get answers from users.
            if (playAgain.equals("y")) { //If the user answers "y".
                playGame(); //Call the playGame function.
            }
            else if (playAgain.equals("a")) { //When users type "a"
                showGuesses (); //Call the method showGuesses.
            } else if (playAgain.equals("g")) { //When users type "g"
                showSpecific (); //Call the method showSpecific.
            } else if (playAgain.equals("q")){ //When users type "q"
                System.exit(0); //Exit the program.
            }
        }
    } //This method will play game then asks the user if they want to quit, play again, or if they want to know the guessing number.
    public void showSpecific () {
        Scanner scanner = new Scanner(System.in);
        int show = 0;
        while (true) {
            System.out.println("Enter which guess in the range (1-" + countOfNum + ")");
            show = scanner.nextInt();
            if (show <= countOfNum && show > 0){
                break;
            }
        }
        System.out.println("Guess number " + show + " is " + guesses[(show-1)]);
    } //This method will show you the numbers you guessed in the round that you want to know.
    public void showGuesses () {
        for (int i = 0; i<countOfNum; i++) {
            System.out.print(guesses[i] + " ");
        }
        System.out.println("");
    } //This method shows all the numbers you have guessed in the game.

    @Override
    public void playGame () {
        numOfGames++; //The number of times the game is played increases by 1.
        correctNum = minNum + (int)(Math.random()*((maxNum-minNum)+ 1 )); //Random number of correctNum.
        int count = 0; //Number of guesses in playing this round.
        int position = 0; //Location of the array.
        int gameTeies = maxTries; //Make this game's guess equal to the guesswork received from the user.
        Scanner scanner = new Scanner(System.in);
        while (gameTeies > 0) { // This loop will run when this game's guess count is greater than 0
            System.out.print("Please enter a guess (" + minNum + "-" + maxNum + "):");
            numGuesses = scanner.nextInt(); //Gets the number guessed from the user.
            if (numGuesses >= minNum && numGuesses <= maxNum) { //When the user answers the number that is between "minNum" and "maxNum".
                while (position<maxTries) {
                    guesses [position] = numGuesses; //Store the numbers guessed in an array.
                    count++;
                    position++;
                    if (numGuesses > correctNum) { //When the user guesses a number greater than the answer The program will output according to this condition.
                        gameTeies--; //This game's number of guesses is reduced by 1.
                        System.out.println("Please type a lower number! " +
                                "Number of remaining tries:" + (gameTeies));
                        break;
                    } else if (numGuesses < correctNum) { //When the user guesses a number that is less than the answer the program will output according to this condition.
                        gameTeies--; //This game's number of guesses is reduced by 1.
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
        countOfNum = count;
    } //Create a new playGame method

     /*public void playAgain () {
        Scanner scanner = new Scanner(System.in);
        while (true) { //This loop will run when this game's guess count is 0
            System.out.println("If want to play again? type 'y' to continue or 'q' to quit:");
            System.out.println("Type 'a' to see all your guesses or 'g' to see a guesses on a specific play.");
            String playAgain = scanner.next(); //Get answers from users.
            if (playAgain.equals("y")) { //If the user answers "y".
                playGame(); //Call the playGame function.
            }
            else if (playAgain.equals("a")) { //When users type "a"
                showGuesses (); //Call the method showGuesses.
            } else if (playAgain.equals("g")) { //When users type "g"
                showSpecific (); //Call the method showSpecific.
            } else if (playAgain.equals("q")){ // // If the user answers other than "y", "a", "g", "v", "m" and "x"
                System.exit(0); //Exit the program.
            }
        }
    } //This method asks the user if they want to quit, play again, or if they want to know the guessing number.
*/
}

