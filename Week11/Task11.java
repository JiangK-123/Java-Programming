package com.HJK.hello;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

                // Define the 2D array for weekly hours
                int[][] weeklyHours = {
                        {2, 4, 3, 4, 5, 8, 8}, // Employee 0
                        {7, 3, 4, 3, 3, 4, 4}, // Employee 1
                        {3, 3, 4, 3, 3, 2, 2}, // Employee 2
                        {9, 3, 4, 7, 3, 4, 1}, // Employee 3
                        {3, 5, 4, 3, 6, 3, 8}, // Employee 4
                        {3, 4, 4, 6, 3, 4, 4}, // Employee 5
                        {3, 7, 4, 8, 3, 8, 8}, // Employee 6
                        {6, 3, 5, 9, 2, 7, 9}  // Employee 7
                };

                // Create a 2D array to store employee index and total hours
                int[][] employeeTotals = new int[weeklyHours.length][2];

                // Calculate total hours for each employee
                for (int i = 0; i < weeklyHours.length; i++) {
                    int total = 0;
                    for (int j = 0; j < weeklyHours[i].length; j++) {
                        total += weeklyHours[i][j];
                    }
                    employeeTotals[i][0] = i;  // Employee index
                    employeeTotals[i][1] = total; // Total hours
                }

                // Sort the employees by total hours in descending order
                Arrays.sort(employeeTotals, Comparator.comparingInt((int[] a) -> a[1]).reversed());

                // Display the results
                System.out.println("Employee | Total Hours");
                for (int[] employee : employeeTotals) {
                    System.out.printf("   %d     |     %d\n", employee[0], employee[1]);
                }
                
    }
}
