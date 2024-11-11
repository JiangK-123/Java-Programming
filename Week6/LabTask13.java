import java.util.Scanner;

public class LabTask13 {
    public static void main(String[] args) throws Exception {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter first integer: ");
			int a = scan.nextInt();
			
			System.out.println("Enter second integer: ");
			int b = scan.nextInt();

			while ((a % b) != 0) {
				int c = a % b;
				a = b;
				b = c;
			}
			System.out.println("The greatest common divisor for " + a+" and "+b+" is "+b);
		}
		
	 }

	


    

