import java.util.Scanner;
public class Task15 {  
    
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter two cities: ");
String city1=sc.next();
String city2=sc.next();
int a=(city1.compareTo(city2));
if(a<0){
    System.out.println(city1+city2);
}
    else System.out.println(city2+city1);
}
}


