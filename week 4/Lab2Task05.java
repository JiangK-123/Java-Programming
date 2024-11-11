import java.util.Scanner;
public class Lab2Task05 {
        public static void main(String[] args) {                    
           
                    Scanner sc = new Scanner(System.in);                   
                    System.out.print("Please enter your fee：");
                    double fee = sc.nextDouble();
                    System.out.print("Please enter the rate of remuneration you plan：");
                    double rate = sc.nextDouble();
                    
                    
                    double choujin = fee * rate /100;
                    double total = fee + choujin;
                                       
                    System.out.println("Your remuneration is:：￥"+choujin+"，The total cost is:：￥"+total);
                }          
                                          
}
