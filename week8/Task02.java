package com.HJK.hello;

import java.util.ArrayList;
import java.util.Scanner;

public class Task02{
    public static void main(String[] args) {
        double[] mylist=new double[5];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter "+mylist.length+" Values");
        for (int i = 0; i < mylist.length; i++) {
            mylist[i]=input.nextDouble();
        }
        input.close();
    }
}

