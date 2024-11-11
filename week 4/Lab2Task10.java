import java.util.Scanner;

public class Lab2Task10 {
    public static void main(String[] args) {
        System.out.println("Enter the monthly saving amount:");
        Scanner sc = new Scanner(System.in);
        double saving = sc.nextDouble();
        double value = saving;
        for (int i = 1; i <= 6; i++) {
            value += value * 0.00417;
            value += saving;
        }
        value -= saving;
        System.out.println("After the sixth month, the account value is $");
        System.out.printf("%.2f", value);
    }
}
