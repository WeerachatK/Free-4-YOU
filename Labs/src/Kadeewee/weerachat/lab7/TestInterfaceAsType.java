package kadeewee.weerachat.lab7;

/**
 * This program is TestInterfaceAsType
 * This program is for test interface as type.
 * This program compares the DiceRoll value between 2 indexes.
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: March 12, 2021
 *
 **/

import kadeewee.weerachat.lab6.*;
import java.util.ArrayList;

public class TestInterfaceAsType {
    public static int compareRollDice(DiceGame g1, DiceGame g2){
        return g1.getDiceRoll() - g2.getDiceRoll();
    } //เปรียบเทียบจำนวนที่ได้จากการทอยลูกเต๋าระหว่าง 2 INDEX
    public static void main(String[] args) {
        ArrayList<UseDice> games = new ArrayList<UseDice>();
        games.add(new HighLowGame());
        games.add(new HighLowGame(3));
        games.add(new HighLowGame(4,"h"));
        games.add(new MonopolyGame());
        games.add(new MonopolyGame(3));
        //เรียกใช้คอนสตรัคเตอร์ในคลาส Game และส่งค่าพารามิเตอร์ไปยังคอนสตรัคเตอร์นั้นๆ
        for (int i = 0 ; i < 4 ; i++){
            DiceGame g1 = (DiceGame) games.get(i);
            DiceGame g2 = (DiceGame) games.get(i+1);
            //กำหนดค่าใน INDEX ที่จะนำไปเปรียบเทียบ
            if ( compareRollDice(g1 , g2) == 0) {
                System.out.println("Game(" + i + "):" + g1.getDiceRoll() + " has dice roll equal to game(" + (i+1) + "):" + g2.getDiceRoll());
                //เมื่อเปรียบเทียบจำนวนที่ได้จากการทอยลูกเต๋าระหว่าง 2 INDEX แล้วมีค่าเท่ากัน
            } else if ( compareRollDice(g1 , g2) < 0) {
                System.out.println("Game(" + i + "):" + g1.getDiceRoll() + " has dice roll less than game(" + (i+1) + "):" + g2.getDiceRoll());
                //เมื่อเปรียบเทียบจำนวนที่ได้จากการทอยลูกเต๋าระหว่าง 2 INDEX แล้ว INDEX แรกมีค่าน้อยกว่า
            } else {
                System.out.println("Game(" + i + "):" + g1.getDiceRoll() + " has dice roll greater than Game(" + (i+1) + "):" + g2.getDiceRoll() );
                //เมื่อเปรียบเทียบจำนวนที่ได้จากการทอยลูกเต๋าระหว่าง 2 INDEX แล้ว INDEX แรกมีค่ามากกว่า
            }
            System.out.println("Game("+ i +"): rollDice method return " + games.get(i).rollDice());//เรียกใช้เมธอด rollDice() ใน DiceGame
        }
    }
}
