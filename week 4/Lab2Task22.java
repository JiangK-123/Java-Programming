import java.util.Scanner;

public class Lab2Task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                x +=5;
                break;
            case 2:
                x += 10;
            case 3:
                x +=16;
            case 4:
                x +=34;
        }
        System.out.println("The value of x is " + x);
        System.out.println("The value of a is " + a);
    }
}
