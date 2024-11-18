package com.HJK.hello;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        int [][] matrix = new int[3][3];

        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix[0].length;column++){
                matrix[row][column]=(int)(Math.random()*20);
            }
        }

        int maxOfRow=0;
        int indexofMaxRow=0;
        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix[0].length;column++){
                maxOfRow+=matrix[0][column];
            }
        }
        int totalOfThisRow=0;
        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix[0].length;column++){
                totalOfThisRow+=matrix[row][column];
            }
            if(totalOfThisRow>maxOfRow){
                maxOfRow=totalOfThisRow;
                indexofMaxRow=row;
            }
        }
        System.out.println("Row "+indexofMaxRow+" has the maximum sum of "+maxOfRow);
    }
}
