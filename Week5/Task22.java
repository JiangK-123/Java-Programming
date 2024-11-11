import java.util.Scanner;
public class Task22{
public static void main(String[] args){
Scanner input = new Scanner( System.in);
System.out.print("Enter a decimal value:");
int deciaml = input.nextInt();
String hex = "";
while(deciaml != 0){
int hexValue = deciaml%16;
char hexDigit = (hexValue <= 9 && hexValue >= 0)?(char)(hexValue +'0'):(char)(hexValue -10 + 'A' );
hex = hexDigit + hex;
deciaml = deciaml / 16;
}
System.out.println("The hex value is "+ hex);
}
} 



