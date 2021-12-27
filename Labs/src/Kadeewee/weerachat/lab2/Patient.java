package Kadeewee.Weeracaht.lab2;

/**
 * This Patient program is to accept three arguments: patient name, patient age, and country
 * Its output format is “Patient's name is <patient name>
 *     Patient's age is <patient age>
 *     <patient name> come from <country>”
 *
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: January 8, 2021
 *
 **/

public class Patient {
    public static void main(String[] args) {
        if (args.length == 3) { // Check the arguments, if there are 3 arguments it must follow this.
            System.out.println("Patient's name is " + args[0]); //Show patient name.
            System.out.println("Patient's age is " + args[1]); //Show patient age.
            System.out.println(args[0] + " come from " + args[2]); //Show the country of the patient
        } else { //The part to show when Arguments are not three, and cause program errors.
            System.err.println("Patient <patient name> <patient age> <country>");
        }
    }
}
