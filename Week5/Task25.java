import java.util.Scanner;
import java.lang.Math;
public class Task25{
public static void main(String[] args){

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String city1 = inputScanner.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = inputScanner.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = inputScanner.nextLine();

        if(city1.compareTo(city2) > 0) // city1 > city2
        {
            if(city2.compareTo(city3) > 0) // city2 > city3
                System.out.println("The three cities in alphabetical order are " + city1 + " " + city2 + " " + city3);
            else //city2 < city3
            {
                if(city1.compareTo(city3) > 0) // city1 > city3
                    System.out.println("The three cities in alphabetical order are " + city2 + " " + city3 + " " + city1);
                else // city1 < city3
                    System.out.println("The three cities in alphabetical order are " + city2 + " " + city1 +  " " + city3);
            }
        }
        else // city1 < city2
        {
            if(city1.compareTo(city3) > 0) // city1 > city3
                System.out.println("The three cities in alphabetical order are " + city3 + " " + city1 + " " + city2);
            else //city1 < city3
            {
                if(city2.compareTo(city3) > 0) // city2 > city3
                    System.out.println("The three cities in alphabetical order are " + city1 + " " + city3 + " " + city2);
                else // city2 < city3
                    System.out.println("The three cities in alphabetical order are " + city1 + " " + city2 + " " + city3);
            }
        }

        inputScanner.close();
    }
}


	




