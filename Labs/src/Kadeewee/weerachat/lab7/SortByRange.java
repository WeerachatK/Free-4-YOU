package kadeewee.weerachat.lab7;

/**
 * This program is SortByRange
 * This program implements Comparator<GuessNumberGameVer4>
 * This program is for sort random range
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: March 12, 2021
 *
 **/

import java.util.Comparator;

public class SortByRange implements Comparator<GuessNumberGameVer4> {

    @Override
    public int compare(GuessNumberGameVer4 o1, GuessNumberGameVer4 o2) {
        return (o1.getMaxNum() - o1.getMinNum())-(o2.getMaxNum() - o2.getMinNum());
    }
}
