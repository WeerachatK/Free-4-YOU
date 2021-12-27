package kadeewee.weerachat.lab7;

/**
 * This program is GuessNumberGameVer4
 * Class GuessNumberGameVer4 which inherited from GuessNumberGameVer3.
 * This program is for test comparing max tries.
 * And program is for test comparing max tries then random range.
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: March 12, 2021
 *
 **/

import kadeewee.weerachat.lab5.*;
import java.util.ArrayList;
import java.util.Collections;

public class GuessNumberGameVer4 extends GuessNumberGameVer3 {
    static ArrayList<GuessNumberGameVer4> games =
            new ArrayList<GuessNumberGameVer4>(0); //ArrayList
    public static void initGamesList() {
        games.add(new GuessNumberGameVer4(1, 10, 3));
        games.add(new GuessNumberGameVer4(1, 10, 5));
        games.add(new GuessNumberGameVer4(1, 5, 5));
        //ส่งค่าพารามิเตอร์ไปยัง GuessNumberGameVer4();
        System.out.println("Unsorted");
        for (GuessNumberGameVer4 game: games){
            System.out.println(game);
        } //แสดงค่าที่ยังไม่เรียงลำดับ
    }
    public static void testComparingMaxTries() {
        initGamesList();
        Collections.sort(games, new SortByMaxTries()); //เรียกใช้คลาส SortByMaxTries
        System.out.println("\nSorted by max tries in descending order");
        for (GuessNumberGameVer4 game: games) {
            System.out.println(game);
        } //แสดงค่าที่เรียงลำดับโดยจำนวนการเดาสูงสุด
    }
    public static void testComparingMaxTriesThenRandomRange(){
        initGamesList();
        Collections.sort(games, new SortByMaxTriesThenRandomRange()); //เรียกใช้คลาส SortByMaxTriesThenRandomRange
        System.out.println("\nSorted by max tries in descending order and random range in ascending order");
        for (GuessNumberGameVer4 game: games) {
            System.out.println(game);
        } //แสดงค่าที่เรียงลำดับโดยจำนวนการเดาสูงสุด จากนั้นก็เรียงลำดับโดยจำนวนช่วงของตัวเลขที่สุ่ม
    }
    public GuessNumberGameVer4(int minNum, int maxNum, int maxTries){
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = maxTries;
    }
    public static void main(String[] args) {
        //testComparingMaxTries();
        testComparingMaxTriesThenRandomRange();
    }
}
