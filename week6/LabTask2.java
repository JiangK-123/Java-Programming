import java.util.Scanner;

public class LabTask2 {
    public static void main(String[] args) throws Exception {
       
        int number1=(int)(Math.random()*10);
        
        int number2=(int)(Math.random()*10);
        
        
        
        Scanner input = new Scanner(System.in);
       
        System.out.print("whatis"+number1+"+"+number2+"?");
        
        int answer = input.nextInt();
        
        
        while(number1+ number2!=answer){
        
        System.out.print("wrong answer.Try again. what is "+number1+"+"+number2+"?");
        
        answer = input.nextInt();
        
        System.out.println("You got it!");
       
                   
}
}
}

