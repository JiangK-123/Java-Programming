import java.util.Scanner;
public class Lab2Task2 {
        public static void main(String[] args) {
            Scanner scanner=new
            Scanner(System.in);
            int seconds=scanner.nextInt();
            int minutes=(seconds/60);
            int remainingSeconds=(seconds%60);
            System.out.println("The minutes is "+minutes);
            System.out.println("The remainingSeconds is "+remainingSeconds);
        }                       
}
