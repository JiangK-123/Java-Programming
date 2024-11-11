import java.util.Scanner;

public class Example3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of x and y:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 2){
            if(y > 2){
                int z = x + y;
                System.out.println("z is: " + z);
            }
        }
        else
            System.out.println("x is: " + x);
    }
}
