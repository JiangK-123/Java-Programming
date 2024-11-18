package com.HJK.hello;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task12(Q1) {
    public static void main(String[] args) {

                // Example matrix
                double[][] matrix = {
                        {1.2, 2.3, 3.4},
                        {4.5, 5.6, 6.7},
                        {7.8, 8.9, 9.0}
                };

                // Example column index
                int columnIndex = 1;

                // Call the method and display the result
                double sum = sumColumn(matrix, columnIndex);
                System.out.println("The sum of column " + columnIndex + " is: " + sum);
            }
            public static double sumColumn(double[][] m, int columnIndex) {
                double sum = 0;
                for (int i = 0; i < m.length; i++) {
                    if (columnIndex < m[i].length) {
                        sum += m[i][columnIndex];
                    }
                }
                return sum;
    }
}
