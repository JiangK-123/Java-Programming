package com.HJK.hello;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

                // Initialize the 4x4 matrix
                int[][] matrix = new int[4][4];

                // Fill the matrix with random 0s and 1s
                Random random = new Random();
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        matrix[i][j] = random.nextInt(2); // Randomly assign 0 or 1
                    }
                }

                // Print the matrix
                System.out.println("Generated 4x4 matrix:");
                for (int[] row : matrix) {
                    for (int val : row) {
                        System.out.print(val);
                    }
                    System.out.println();
                }

                // Find the row with the most 1s
                int maxRowIndex = -1;
                int maxRowCount = 0;
                for (int i = 0; i < matrix.length; i++) {
                    int rowCount = 0;
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (matrix[i][j] == 1) {
                            rowCount++;
                        }
                    }
                    if (rowCount > maxRowCount) {
                        maxRowCount = rowCount;
                        maxRowIndex = i;
                    }
                }

                // Find the column with the most 1s
                int maxColIndex = -1;
                int maxColCount = 0;
                for (int j = 0; j < matrix[0].length; j++) {
                    int colCount = 0;
                    for (int i = 0; i < matrix.length; i++) {
                        if (matrix[i][j] == 1) {
                            colCount++;
                        }
                    }
                    if (colCount > maxColCount) {
                        maxColCount = colCount;
                        maxColIndex = j;
                    }
                }

                // Display the results
                System.out.println("The largest row index: " + maxRowIndex);
                System.out.println("The largest column index: " + maxColIndex);
    }
}
