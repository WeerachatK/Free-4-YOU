package kadeewee.weerachat.lab4;

/**
 * This program will generate a Matrix. With the size that the user needs
 * And receive value to be stored in that Matrix.
 * What the program will show...
            - Show orginal metrix.
            - Show Matrix by row.
            - Show Matrix by column.
            - Show Matrix by row backward.
            - Show Matrix by column backward.
            - Show Matrix by zigzag.
 *
 * Author: Weeeachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: January 22, 2021
 *
 **/

import java.util.Scanner;

public class MatrixDisplay {
    static int[][] matrix;
    static int rowDimension, columnDimension;

    public static void main(String[] var0) {
        inputMatrix();
        showMatrix();
        showMatrixByRow();
        showMatrixByColumn();
        showMatrixByRowBackward();
        showMatrixByColumnBackward();
        showMatrixByZigzag();
        //Call all method
    }

    public static void inputMatrix() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of row then number of column of a matrix:");
            rowDimension = scanner.nextInt(); //Gets the number of rows of the matrix from user.
            columnDimension = scanner.nextInt(); //Gets the number of column of the matrix from user.
            while (rowDimension != 0 && columnDimension != 0) { //Columns and rows of the matrix must not be 0.
                matrix = new int[rowDimension][columnDimension]; //Create a matrix that is sized according to the values that are inherited from user.
                System.out.println("Enter matrix by row : ");
                for (int i = 0; i < rowDimension; i++) {
                    for (int j = 0; j < columnDimension; j++) {
                        matrix[i][j] = scanner.nextInt(); //Put the values received from the user into the matrix.
                    }
                }
                break;
            }
            break;
        }
    } //Create a matrix of the size that the user wants and get the values stored in that matrix.
    public static void showMatrix() {
        System.out.println("Showing orginal metrix:");
        for (int i = 0; i < rowDimension; i++) {
            for (int j = 0; j < columnDimension; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    } //Showing orginal metrix
    public static void showMatrixByRow() {
        System.out.print("Show matrix by row : ");
        for (int i = 0; i < rowDimension; i++) {
            for (int j = 0; j < columnDimension; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println("");
    } //Show Matrix by row.
    public static void showMatrixByColumn() {
        System.out.print("Show matrix by column : ");
        for (int i = 0; i < columnDimension; i++) {
            for (int j = 0; j < rowDimension; j++) {
                System.out.print(matrix[j][i] + " ");
            }
        }
        System.out.println("");
    } //Show Matrix by column.
    public static void showMatrixByRowBackward() {
        System.out.print("Show matrix by row backward : ");
        for (int i = (rowDimension - 1); i >= 0; i--) {
            for (int j = (columnDimension - 1); j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println("");
    } //Show Matrix by row backward.
    public static void showMatrixByColumnBackward() {
        System.out.print("Show matrix by column backward : ");
        for (int i = (columnDimension - 1); i >= 0; i--) {
            for (int j = (rowDimension - 1); j >= 0; j--) {
                System.out.print(matrix[j][i] + " ");
            }
        }
        System.out.println("");
    } //Show Matrix by column backward.
    public static void showMatrixByZigzag() {
        System.out.print("Show matrix by zigzag :");
        for (int i = 0; i < rowDimension; i++) {
            if ((i % 2) == 0) {
                for (int j = 0; j < columnDimension; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = (columnDimension - 1); j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    } //Show Matrix by zigzag.
}