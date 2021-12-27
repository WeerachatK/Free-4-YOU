package kadeewee.weerachat.lab5;

/**
 * This program is TestGuessNumberGenerator.
 * This program is for
 *  - Test GuessNumberGameVer1.
 *  - Test GuessNumberGameVer2.
 *  - Test GuessNumberGameVer3.
 *  - Test method Setter and Getter.
 *
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: January 15, 2021
 *
 **/

public class TestGuessNumberGenerator {
    public static void testConstructors() {
        GuessNumberGameVer1 gng1 = new GuessNumberGameVer1();
        GuessNumberGameVer1 gng2 = new GuessNumberGameVer1(5, 10);
        GuessNumberGameVer1 gng3 = new GuessNumberGameVer1(10, 20, 5);
        System.out.println(gng1);
        gng1.playGame();
        System.out.println(gng2);
        gng2.playGame();
        System.out.println(gng3);
        gng3.playGame();
    }
    public static void testSetterGetterMethods() {
        GuessNumberGameVer1 gng = new GuessNumberGameVer1();
        System.out.println("\nThe first guess number game is");
        System.out.println(gng);
        System.out.println("Now, the number of games is " + GuessNumberGameVer1.getNumOfGames());
        GuessNumberGameVer1 gng2 = new GuessNumberGameVer1(5, 20);
        System.out.println("Creating another guess number game");
        System.out.println("Now, the number of games is " + GuessNumberGameVer1.getNumOfGames());

        gng.setMinNum(2);
        gng.setMaxNum(5);
        gng.setMaxTries(2);
        System.out.println("GuessNumberGame with new settings");
        System.out.println(gng);
        System.out.println("GuessNumberGame with getting methods");
        System.out.println("Min num is " + gng.getMinNum() + ", max num is " + gng.getMaxNum() +
                ", and max tries is " + gng.getMaxTries());
    }
    private static void testPlayGame() {
        GuessNumberGameVer2 gng = new GuessNumberGameVer2(5, 10, 4);
        gng.playGames();
    }
    private static void testPlayGameVer3() {
        GuessNumberGameVer3 gng = new GuessNumberGameVer3(1, 20, 5);
        gng.playGames();
    }
    public static void main(String[] args) {

    testConstructors(); //Test GuessNumberGameVer1.
    testSetterGetterMethods(); //Test method Setter and Getter.
    testPlayGame(); //Test GuessNumberGameVer2.
    testPlayGameVer3(); //Test GuessNumberGameVer3.
    }


}
