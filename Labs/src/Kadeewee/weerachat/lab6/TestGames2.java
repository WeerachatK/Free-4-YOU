package kadeewee.weerachat.lab6;

/**
 * This program is TestGame
 * It is used to test the lap 6 problems 2
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: March 6, 2021
 **/

public class TestGames2 {
    public static void main(String[] args) {
        HighLowGame game1 = new HighLowGame();
        /*int i = 0;
        while ( i < 10) {
            HighLowGame gamei = new HighLowGame();
            System.out.println(gamei);
            i++;
        }*/
        System.out.println(game1);
        game1.playGame();
        HighLowGame game2 = new HighLowGame(3);
        System.out.println(game2);
        game2.playGame();
        HighLowGame game3 = new HighLowGame(4, "h");
        System.out.println(game3);
        game3.playGame();
        MonopolyGame game4 = new MonopolyGame();
        System.out.println(game4);
        game4.playGame();
        MonopolyGame game5 = new MonopolyGame(3);
        System.out.println(game5);
        game5.setUpBoard();
        game5.playGame();
        System.out.println("roll dice " + game5.rollDice());
        System.out.println("show cash " + game5.getCash());




    }
}
