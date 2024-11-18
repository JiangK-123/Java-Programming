package com.HJK.hello;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Task14(Q1) {
    public static void main(String[] args) {

                // Example 2D array
                int[][] matrix = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9},
                        {10, 11, 12}
                };

                System.out.println("Original Matrix:");
                printMatrix(matrix);

                // Shuffle the rows of the matrix
                shuffle(matrix);

                System.out.println("\nShuffled Matrix:");
                printMatrix(matrix);
            }

            public static void shuffle(int[][] m) {
                Random random = new Random();
                for (int i = m.length - 1; i > 0; i--) {
                    int j = random.nextInt(i + 1); // Random index between 0 and i
                    // Swap rows m[i] and m[j]
                    int[] temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }

            public static void printMatrix(int[][] m) {
                for (int[] row : m) {
                    for (int val : row) {
                        System.out.print(val + " ");
                    }
                    System.out.println();
                }
    }
}
