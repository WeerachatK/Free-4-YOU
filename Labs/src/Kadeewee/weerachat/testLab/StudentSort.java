package Kadeewee.Weeracaht.testLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSort {
    public static void main(String[] args){

        List<Student> students=new ArrayList<Student>(0);
        System.out.println("-----Before sort----");
        students.add(new Student("S003","Nattapong",3.25));
        students.add(new Student("S001","Pumin",2.50));
        students.add(new Student("S002","Jingjai",3.00));
        students.add(new Student("S005","Boonhome",1.75));
        students.add(new Student("S004","Kamron",4.00));
        printList(students);
        Collections.sort(students);
        System.out.println("----After sort----");
        printList(students);
    }

    private static void printList(List<Student> students) {
        System.out.printf("%-5s %-10s %-5s\n","#ID","#Name","#GPA");
        for(Student s: students){
            System.out.printf("%-5s %-10s %-5.2f\n"
                    , s.getId(), s.getName(), s.getGpa());
        }
    }
}
