import java.util.Scanner;

public class LabTask11 {
    public static void main(String[] args) throws Exception {

            int sum = 0;
            int number = 0;
            while(number< 20){
            number++;
            if(number == 10||number == 11)
            continue;
            sum += number;
            }
            System.out.println("The sum is "+ sum);

        }

}
    
