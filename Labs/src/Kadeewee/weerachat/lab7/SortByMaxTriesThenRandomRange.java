package kadeewee.weerachat.lab7;

/**
 * This program is SortByMaxTriesThenRandomRange
 * This program implements Comparator<GuessNumberGameVer4>
 * This program is for sort max tries then sort random range
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: March 12, 2021
 *
 **/

import java.util.Comparator;

public class SortByMaxTriesThenRandomRange implements Comparator<GuessNumberGameVer4> {
    @Override
public int compare(GuessNumberGameVer4 o1, GuessNumberGameVer4 o2) {
        int maxTriesCompare = new SortByMaxTries().compare(o1, o2); //เรียกใช้คลาส SortByMaxTries
        int maxNumCompare = new SortByRange().compare(o1, o2); ////เรียกใช้คลาส SortByRange
        if (maxTriesCompare == 0) {
        return ((maxNumCompare == 0) ?  maxTriesCompare : maxNumCompare); //ถ้า maxTries มีค่าเท่ากันให้ทำเงื่อนไขนี้
        } else {
        return o2.getMaxTries() - o1.getMaxTries();
        }
    }
}
