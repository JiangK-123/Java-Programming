package com.HJK.hello;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task(Q2) {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                final int ROWS = 3;
                final int COLUMNS = 4;
                
                double[][] matrix = new double[ROWS][COLUMNS];
                
                System.out.println("Enter a 3-by-4 matrix row by row:");
                for (int i = 0; i < ROWS; i++) {
                    for (int j = 0; j < COLUMNS; j++) {
                        matrix[i][j] = scanner.nextDouble();
                    }
                }

                // Calculate and display the sum of each column
                for (int col = 0; col < COLUMNS; col++) {
                    double sum = sumColumn(matrix, col);
                    System.out.printf("Sum of the elements at column %d is %.1f%n", col, sum);
                }

                scanner.close();
            }

            public static double sumColumn(double[][] m, int columnIndex) {
                double sum = 0;
                for (int i = 0; i < m.length; i++) {
                    sum += m[i][columnIndex];
                }
                return sum;

    }
}
