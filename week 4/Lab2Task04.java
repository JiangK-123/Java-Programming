import java.util.Scanner;
public class Lab2Task04 {
        public static void main(String[] args) {                    
                    System.out.println("Enter the radius and length of a cylinder:");
                    Scanner input = new Scanner(System.in);
                    double radius = input.nextDouble();
                    double length = input.nextDouble();
                    double area = 0.0,volume = 0.0;
                    area =  radius * radius * Math.PI ;
                    volume = radius * radius * Math.PI * length;
                    System.out.println("The area is："+area);
                    System.out.println("The volume is："+ volume);
                  }                            
}