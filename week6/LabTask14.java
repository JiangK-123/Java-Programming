import java.util.Scanner;

public class LabTask14 {
    public static void main(String[] args) throws Exception {

  double m=10000;
  int count= 0;
  while(m<20000)
  {
   m*=(1+0.07);
   count++;
  }
   System.out.println("The Tuition will be double in "+count);
   System.out.println("The Tuition will be "+m+" in "+count+" year ");
 }


		}
