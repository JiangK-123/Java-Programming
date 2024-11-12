package com.HJK.hello;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {


                System.out.println("Please enter the radius of the circle: ");
                Scanner input = new Scanner(System.in);
                double r = input.nextDouble();

                double C = 2 * r * Math.PI;
                double S = r * r * Math.PI;

                System.out.println("The area is：" + S);
                System.out.println("The circumference is：" + C);


    }
}
