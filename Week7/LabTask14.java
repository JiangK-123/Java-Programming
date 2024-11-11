import java.util.Scanner;
public class LabTask14{
    public static void main(String[] args) {
                // Create a Scanner object for user input
                Scanner input = new Scanner(System.in);
                
                // Prompt the user to enter two integers
                System.out.print("Enter the first integer: ");
                int num1 = input.nextInt();
                
                System.out.print("Enter the second integer: ");
                int num2 = input.nextInt();
                
                // Call the method to find the GCD and display the result
                System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd(num1, num2));
                
                // Close the scanner
                input.close();
            }
        
            // Method to compute the greatest common divisor (GCD)
            public static int gcd(int a, int b) {
                // Using the Euclidean algorithm
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                return a;
            }
        }
