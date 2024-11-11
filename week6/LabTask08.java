import java.util.Scanner;

public class LabTask08 {
    public static void main(String[] args) throws Exception {
        
        
        System.out.println("Multiplication Table");
        System.out.print("");
        
        for(int j=1;j<=9;j++) System.out.print("  "+j);       
        System.out.println("\n--------------------------------");
         
        
        for(int i=1;i<=9;i++){
        
        System.out.print(i+" | ");
        
        for(int j=1;j<=9;j++){
        
        // Display the product and align properly
        
        System.out.printf("%5d",i*j);
        }
        System.out.println();
          
    }
        }

}
    

