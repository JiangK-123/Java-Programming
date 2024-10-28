package com.HJK.hello;

import java.util.ArrayList;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        int[] mylist=new int[10];

        System.out.println("Array before shuffling: ");
        for (int i = 0; i < mylist.length; i++) {
            mylist[i]=(int)(Math.random()*mylist.length);
            System.out.println(mylist[i]+" ");
        }

        System.out.println("\nArray after shuffling: ");


        for (int i = 0; i < mylist.length; i++) {
            int j=(int)(Math.random()*mylist.length);
            int temp=mylist[i];
            mylist[i]=mylist[j];
            mylist[j]=temp;
            System.out.println(mylist[i]+" ");

        }

        float max=mylist[0];
        int indexOfMax=0;
        for (int i = 1; i < mylist.length; i++) {
            if(mylist[i]>max){
                max=mylist[i];
                indexOfMax=i;
            }

        }
        System.out.println();
        System.out.println("Largest element in the array is: "+max);
        System.out.println("The index of the largest element is: "+indexOfMax);
    }
}

