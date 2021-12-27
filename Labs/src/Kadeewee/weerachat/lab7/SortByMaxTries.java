package kadeewee.weerachat.lab7;

/**
 * This program is SortByMaxTries
 * This program implements Comparator<GuessNumberGameVer4>
 * This program is for sort max tries.
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: March 12, 2021
 *
 **/

import java.util.Comparator;

public class SortByMaxTries implements Comparator<GuessNumberGameVer4> {
    @Override
    public int compare(GuessNumberGameVer4 o1, GuessNumberGameVer4 o2) {
        return o2.getMaxTries() - o1.getMaxTries();
    }
}
