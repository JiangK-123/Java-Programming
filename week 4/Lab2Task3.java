import java.util.Scanner;
public class Lab2Task3 {
        public static void main(String[] args) {
           			
			int nowday = 2;
			int day = 100 % 7;
	switch (day) {
	        case 0:
	            System.out.println("Today is Tuseday");
	            break;
	        case 1:
	            System.out.println("Today is Wendesday");
	            break;
	        case 2:
	            System.out.println("Today is Thusday");
	            break;
	        case 3:
	            System.out.println("Today is Friday");
	            break;
	        case 4:
	            System.out.println("Today is Saturday");
	            break;
	        case 5:
	            System.out.println("Today is Sunday");
	            break;
	        case 6:
	            System.out.println("Today is Monday");
	            break;
	        default:
	            break;
	        }

        }                       
}
