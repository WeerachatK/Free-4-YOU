package kadeewee.weerachat.lab4;

/**
 * This program stores the academic year, semester, subjects, credits and user grades.
 * User can type 'o' to display all received information.
 * User can type 'a' to display the total cumulative GPA.
 * User can type 't' to display the GPA in the academic year and the semester the user wants to know.
 *
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: January 22, 2021
 *
 **/


import java.util.Scanner;

public class StudentGPA {
    final static int MAX_NUMBER_OF_COURSES = 150;
    static int[] year = new int[MAX_NUMBER_OF_COURSES]; //This array will store academic year.
    static int[] term = new int[MAX_NUMBER_OF_COURSES]; //This array will store semester.
    static String[] courseName = new String[MAX_NUMBER_OF_COURSES]; //This array will store subjects.
    static int[] courseCredit = new int[MAX_NUMBER_OF_COURSES]; //This array will store credits.
    static  String[] grades = new String[MAX_NUMBER_OF_COURSES]; //This array will store grades.
    static int numberOfCourses = 0; //Store values for use in loops.

    public static void main(String[] var0) {
        inputGrades(); //Call the method inputGrades.
        showGPA(); //Call the method showGPA.
    }
    public static void inputGrades() {
        System.out.println("Enter grades of student (year term name_course credit grade).");
        System.out.println("Finish when enter year with 0");
        Scanner scanner = new Scanner(System.in);
        while (true){
            int loop = scanner.nextInt();
            if (loop == 0){
                break; //Stop looping
            } else {
                year[numberOfCourses] = loop; //Save academic year.
                term[numberOfCourses] = scanner.nextInt(); //Save semester.
                courseName[numberOfCourses] = scanner.next(); //Save subjects.
                courseCredit[numberOfCourses] = scanner.nextInt(); //Save credits.
                grades[numberOfCourses] = scanner.next(); //Save grades.
                numberOfCourses++; //numberOfCourses increased by 1
            }
        }
    }
    public static void showGPA() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Type in 'o' to see all courses, 'a' for accumulated GPA, 't'" +
                    " for GPA for specific term or 'q' to exit");
            String next = scanner.next();
            if (next.equals("o")) {
                allCourses(); //Call the method allCourses.
            } else if (next.equals("a")) {
                calGPA(); //Call the method calGPA.
            } else if (next.equals("t")) {
                termGPA(); //Call the method termGPA.
            } else if (next.equals("q")) {
                System.exit(0); //Close the program.
            }
        }
    }
    public static void allCourses() {
        System.out.println("year  term  course_number  credit  grade");
        for(int i = 0; i < numberOfCourses; i++){
            System.out.print(year[i] +"  "); //Show academic year.
            System.out.print(term[i] +"  "); //Show semester.
            System.out.print(courseName[i] +"  "); //Show subjects.
            System.out.print(courseCredit[i] +"  "); //Show credits.
            System.out.println(grades[i]); //Show grades.
        }
    } //Show all received information.
    public static void calGPA() {
        double gpa = 0;
        double totalCredit = 0;
        double totalGrade = 0;
        for (int i = 0; i < numberOfCourses; i++){
            double numGrade = 0;
            if (grades[i].equals("A")) {
                numGrade = 4;
            } else if (grades[i].equals("B+")) {
                numGrade = 3.5;
            } else if (grades[i].equals("B")) {
                numGrade = 3;
            } else if (grades[i].equals("C+")) {
                numGrade = 2.5;
            } else if (grades[i].equals("C")) {
                numGrade = 2;
            } else if (grades[i].equals("D+")) {
                numGrade = 1.5;
            } else if (grades[i].equals("D")) {
                numGrade = 1;
            } else if (grades[i].equals("F")) {
                numGrade = 0;
            }
            totalGrade = totalGrade +  ((double)courseCredit[i] * numGrade);
            //System.out.println ("totalCredit = " + totalCredit + numGrade);
            totalCredit = totalCredit + (double)courseCredit[i];
        } //Change the grade that was received to a number.
        gpa =  totalGrade / totalCredit; //Calculate GPA
        System.out.println("Accumulated GPA is " + gpa); //Show GPA
    } //Show the total cumulative GPA.
    public static void termGPA() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter which year and term do you want to see GPA");
        int showYear = 0;
        int showTerm = 0;
        double gpa = 0;
        double totalCredit = 0;
        double totalGrade = 0;
        showYear = scanner.nextInt(); //Receive the academic year the user wants to know the grade.
        showTerm = scanner.nextInt(); //Receive semester value for which the user wants to know the grade.
        for (int i = 0; i < numberOfCourses; i++){
            if ( year[i] == showYear ){
                if ( term[i] == showTerm ){
                    double numGrade = 0;
                    if (grades[i].equals("A")) {
                        numGrade = 4;
                    } else if (grades[i].equals("B+")) {
                        numGrade = 3.5;
                    } else if (grades[i].equals("B")) {
                        numGrade = 3;
                    } else if (grades[i].equals("C+")) {
                        numGrade = 2.5;
                    } else if (grades[i].equals("C")) {
                        numGrade = 2;
                    } else if (grades[i].equals("D+")) {
                        numGrade = 1.5;
                    } else if (grades[i].equals("D")) {
                        numGrade = 1;
                    } else if (grades[i].equals("F")) {
                        numGrade = 0;
                    }
                    totalGrade = totalGrade +  ((double)courseCredit[i] * numGrade);
                    totalCredit = totalCredit + (double)courseCredit[i];
                }
            }
        } //Change the grade that was received to a number.
        gpa =  totalGrade / totalCredit; //Calculate GPA
        System.out.println("Accumulated GPA is " + gpa);
    } //Show the GPA in the academic year and the semester the user wants to know.
}
