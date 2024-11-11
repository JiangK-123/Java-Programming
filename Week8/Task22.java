package com.HJK.hello;

import java.util.ArrayList;
import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                // Create an array to store 10 double values
                double[] numbers = new double[10];

                // Prompt the user to enter 10 numbers
                System.out.print("Enter 10 numbers: ");
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = input.nextDouble();
                }

                // Find the minimum value using the min method
                double minimum = min(numbers);

                // Display the minimum value
                System.out.println("The minimum number is " + minimum);

                input.close();
            }

            // Method to find the minimum value in an array
            public static double min(double[] array) {
                double minValue = array[0]; // Initialize minValue with the first element
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < minValue) {
                        minValue = array[i];
                    }
                }
                return minValue;
            }
        }
