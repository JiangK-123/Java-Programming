import java.util.Scanner;

public class Example3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score : ");
        double score = input.nextDouble();
        if (score >= 90) {
            score = score * 1.03;
        }
        else score = score * 1.01;
        System.out.println("your payment is " + score);
    }

}
