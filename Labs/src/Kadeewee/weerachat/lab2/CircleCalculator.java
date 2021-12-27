package Kadeewee.Weeracaht.lab2;

/**
 * This CircleCalculator program is to accept one argument: radius value
 * Its output format is “An area of a circle with radius of <radius of a circle> is <area of a circle>
 * A circumference is <circumference of a circle>"
 *
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: January 8, 2021
 *
 **/

public class CircleCalculator {
    public static void main(String[] args) {
        if (args.length == 1) {
            double radius = Double.parseDouble(args[0]);
            double area = Math.PI * Math.pow(radius, 2);
            double circumference = 2 * (Math.PI * radius);
            //Collect the data as an double.
            System.out.println("An area of a circle with radius of " + radius + " is " + String.format("%.2f",area));
            System.out.println("A circumference is " + String.format("%.2f",circumference));
        } else { //The part to show when Argument are not one, and cause program errors.
            System.err.println("CircleCalculator <radius of a circle>");
        }
    }
}
