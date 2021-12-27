package kadeewee.weeracaht.lab2;

/**
 * This ChangeMachine program is to accept four arguments: amount of coins 1 baht,
 * amount of coins 2 baht, amount of coins 5 baht, amount of coins 10 baht, and amount of coins must not be negative.
 * Its output format is “output amount of coins: 1 baht, 2 baht, 5 baht, 10 baht, and the total amount.
 * Then output us about the banknote that can be redeemed."
 *
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: January 8, 2021
 *
 **/

public class ChangeMachine {
    public static void main(String[] args) {
        if (args.length == 4) {
            int onebaht = Integer.parseInt(args[0]);
            int twobaht = Integer.parseInt(args[1]);
            int fivebaht = Integer.parseInt(args[2]);
            int tenbaht = Integer.parseInt(args[3]);
            int total = onebaht + (twobaht * 2) + (fivebaht * 5) + (tenbaht * 10);
            //Collect the data as an integer.
            if(onebaht<0||twobaht<0||fivebaht<0||tenbaht<0){  //If the amount of coins is negative, output as follows.
                System.err.println("ChangeMachine <1-baht coins> <2-baht coins> <5-baht coins> <10-baht coins>");
            } else { //If the amount of coins is non-negative, output as follows.
                System.out.println("1-baht coins : " + onebaht);
                System.out.println("2-baht coins : " + twobaht);
                System.out.println("5-baht coins : " + fivebaht);
                System.out.println("10-baht coins : " + tenbaht);
                System.out.println("Total amount : " + total);
                //Output amount of coins: 1 baht, 2 baht, 5 baht, 10 baht, and the total amount.
                int thousan = total / 1000;
                int fiveHundred = (total % 1000) / 500;
                int hundred = ((total % 1000) % 500) / 100;
                int twenty = (((total % 1000) % 500) % 100) / 20;
                int remain = (((total % 1000) % 500) % 100) % 20;
                //Calculation of banknotes that can be redeemed.
                System.out.println("1,000-baht bill : " + thousan);
                System.out.println("500-baht bill : " + fiveHundred);
                System.out.println("100-baht bill : " + hundred);
                System.out.println("20-baht bill : " + twenty);
                System.out.println("Money remain : " + remain);
                //Output about the banknote that can be redeemed.
            }
        } else { //The part to show when Arguments are not four, and cause program errors.
            System.err.println("ChangeMachine <1-baht coins> <2-baht coins> <5-baht coins> <10-baht coins>");
        }
    }
}
