package kadeewee.weerachat.lab5;

/**
 * This program is GuessNumberGameVer3 Developed from GuessNumberGameVer2.
 * GuessNumberGameVer3 Use variables and method in conjunction with GuessNumberGameVer2.
 * This program has 3 constructors.
 *   - No parameters.
 *   - 2 parameters. (minNum, maxNum)
 *   - 3 parameters. (minNum, maxNum, maxTries)
 * This program has a method named playGame that is used for playing games.
 * This program has a method named showSpecific used for show you the numbers you guessed in the round that you want to know.
 * This program has a method named showGuesses used for shows all the numbers you have guessed in the game.
 * This program has a method named playGames used for play game then asks the user if they want to quit, play again, or if they want to know other values.
 * This program has a method named guessAverage used for shows the average of all your guessed numbers.
 * This program has a method named guessMin used for shows lowest number you guessed in the game.
 * This program has a method named guessMax used for shows maximum number you guessed in the game.
 *
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: January 15, 2021
 *
 **/

import java.util.Scanner;

public class GuessNumberGameVer3 extends GuessNumberGameVer2 {

    public GuessNumberGameVer3() {
        super();
        guesses = new int[MAX_GUESSES]; //Set the size of the array guesses.
    }
    public GuessNumberGameVer3(int minNum, int maxNum) {
        super(minNum, maxNum);
        guesses = new int[MAX_GUESSES]; //Set the size of the array guesses.
    }
    public GuessNumberGameVer3(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries);
        guesses = new int[MAX_GUESSES]; //Set the size of the array guesses.
    }

    public void guessAverage() {
        int total = 0;
        //System.out.println(numGuesses);
        for (int i = 0; i<countOfNum; i++) {
            total = total + guesses[i];
        }
        //System.out.println(total);
        double average = (double)total / (double)(countOfNum);
        System.out.println(String.format("Average = %.1f",average));
    } //This method shows the average of all your guessed numbers.
    public void guessMin() {
        int min = maxNum;
        for (int i = 0; i < countOfNum; i++) {
            for (int j = 0; j < countOfNum; j++) {
                if (guesses[j] <= guesses[i]){
                    if (guesses[j] <= min) {
                        min = guesses[j];
                    }
                }
            }
        }
        System.out.println("Min = " + min);
    } //This method shows lowest number you guessed in the game.
    public void guessMax() {
        int max = minNum;
        for (int i = 0; i < guesses.length; i++) {
            for (int j = 0; j < guesses.length; j++) {
                if (guesses[j] >= guesses[i]){
                    if (guesses[j] >= max) {
                        max = guesses[j];
                    }
                }
            }
        }
        System.out.println("Max = " + max );
    } //This method shows maximum number you guessed in the game.

     @Override
    public void playGames() {
         playGame();
         Scanner scanner = new Scanner(System.in);
         while (true) { //This loop will run when this game's guess count is 0
             System.out.println("If want to play again? type 'y' to continue or 'q' to quit:");
             System.out.println("Type 'a' to see all your guesses or 'g' to see a guesses on a specific play.");
             System.out.println("Type 'v' to see average or 'm' to see minimum or 'x' to see maximum of all your guesses");
             String playAgain = scanner.next(); //Get answers from users.
             if (playAgain.equals("y")) { //If the user answers "y".
                 playGame(); //Call the playGame function.
             }
             else if (playAgain.equals("a")) { //When users type "a"
                 showGuesses (); //Call the method showGuesses.
             } else if (playAgain.equals("g")) { //When users type "g"
                 showSpecific (); //Call the method showSpecific.
             } else if (playAgain.equals("v")) { //When users type "v"
                 guessAverage(); //Call the method guessAverage.
             } else if (playAgain.equals("m")) { //When users type "m"
                 guessMin(); //Call the method guessMin.
             } else if (playAgain.equals("x")) { //When users type "x"
                 guessMax(); //Call the method guessMax.
             } else if (playAgain.equals("q")){ //When users type "q"
                 System.exit(0); //Exit the program.
             }
         }
     } //Create a new playGames method

   /* @Override
    public void playAgain () {
        Scanner scanner = new Scanner(System.in);
        while (true) { //This loop will run when this game's guess count is 0
            System.out.println("If want to play again? type 'y' to continue or 'q' to quit:");
            System.out.println("Type 'a' to see all your guesses or 'g' to see a guesses on a specific play.");
            System.out.println("Type 'v' to see average or 'm' to see minimum or 'x' to see maximum of all your guesses");
            String playAgain = scanner.next(); //Get answers from users.
            if (playAgain.equals("y")) { //If the user answers "y".
                playGame(); //Call the playGame function.
            }
            else if (playAgain.equals("a")) { //When users type "a"
                showGuesses (); //Call the method showGuesses.
            } else if (playAgain.equals("g")) { //When users type "g"
                showSpecific (); //Call the method showSpecific.
            } else if (playAgain.equals("v")) { //When users type "v"
                guessAverage(); //Call the method guessAverage.
            } else if (playAgain.equals("m")) { //When users type "m"
                guessMin(); //Call the method guessMin.
            } else if (playAgain.equals("x")) { //When users type "x"
                guessMax(); //Call the method guessMax.
            } else { // // If the user answers other than "y", "a", "g", "v", "m" and "x"
                System.exit(0); //Exit the program.
            }
        }
    }
*/

}
