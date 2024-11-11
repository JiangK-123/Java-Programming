import java.util.Scanner;

public class Example3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for radius");
        double radius = input.nextDouble();

        if (radius >= 0){
            double area = Math.PI * radius * radius;
            System.out.println("The area for the circle of radius " +radius + " is "+ area);
            input.close();
        }
        else
            System.out.println("Negative input");
    }
}
