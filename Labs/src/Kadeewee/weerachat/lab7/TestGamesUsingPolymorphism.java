package kadeewee.weerachat.lab7;

/**
 * This program is TestGamesUsingPolymorphism.
 * This program is for sort random range
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: March 12, 2021
 *
 **/

import kadeewee.weerachat.lab6.*;
import java.util.ArrayList;

public class TestGamesUsingPolymorphism{
    public static void main(String[] args) {
        ArrayList<Game> games = new ArrayList<Game>(0);
        games.add(new DiceGame());
        games.add(new DiceGame("h"));
        games.add(new GuessNumberGame());
        games.add(new DiceGame("l"));
        games.add(new GuessNumberGame(1,6,1));
        //เรียกใช้คอนสตรัคเตอร์ในคลาส Game และส่งค่าพารามิเตอร์ไปยังคอนสตรัคเตอร์นั้นๆ
        for (Game game : games) {
            System.out.println(game); //เรียกใช้คลาส Game
            game.playGame(); //เรียกใช้เมธอด playGame() ในคลาส Game
        } //
    }
}
