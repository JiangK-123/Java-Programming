import java.util.Scanner;

public class LabTask6 {
    public static void main(String[] args) throws Exception {
      
int data;
int sum=0;

// create a scanner
Scanner input = new Scanner(System.in);

// Keep reading data until the input is o

do{

// Read the next data

System.out.print("Enter an integer(the input ends if it is o):");

data = input.nextInt();

sum+= data;

}while(data!=0);

System.out.println("The sum is "+ sum);

      
    }

}
    

