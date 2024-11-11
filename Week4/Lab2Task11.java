import java.util.Scanner;

public class Lab2Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double account = sc.nextDouble();
        double tax = account * 0.06;
        System.out.print("Sales tax is $");
        System.out.printf("%.2f", tax);
    }
}
