package com.HJK.hello;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        char[][] answers={
                {'A','B','A','C','C','D','E','E','A','D'},
                {'D','B','A','B','C','A','E','E','A','D'},
                {'E','D','D','A','C','B','E','E','A','D'},
                {'C','B','A','E','D','C','C','E','A','D'},
                {'A','B','D','C','C','D','E','E','A','D'},
                {'B','B','E','C','C','D','E','E','A','D'},
                {'B','B','A','C','C','D','E','E','A','D'},
                {'E','B','E','C','C','D','E','E','A','D'}};

                char[] keys={'D','B','D','C','C','D','E','A','E','A','D'};
                for(int i=0;i<answers.length;i++){
                    int correctAnswers=0;
                    for(int j=0;j<answers[i].length;j++){
                        if(answers[i][j]==keys[j]){
                            correctAnswers++;
                        }
                    }
                    System.out.println("Student "+i+" 's correct is "+correctAnswers);
                }
    }
}
