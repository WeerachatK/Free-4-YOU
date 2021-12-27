package kadeewee.weerachat.lab2;

/**
 * This CamelCaseNaming program is to accept two arguments: the first word and the second word.
 * Its output format is “The first word is <First word>
 *     The second word is <Second word>
 *     The concatenate with camel case is <First word><Second word>"
 *
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: January 8, 2021
 *
 **/

public class CamelCaseNaming {
    public static void main(String[] args) {
        if (args.length == 2) {
            String first = args[0];
            String second = args[1];
            //Collect the data as an String.
            System.out.println("The first word is " + first);//Output first word.
            System.out.println("The second word is " + second);//Output Second word.
            System.out.println("The concatenate with camel case is "
                    + first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase()
                    + second.substring(0,1).toUpperCase() + second.substring(1).toLowerCase());
            //Convert letters and combine the first and second words.
        } else {//The part to show when Arguments are not two, and cause program errors.
            System.err.println("CamelCaseNaming : <First word> <Second word>");
        }
    }
}
