import java.util.Scanner;
import java.lang.Math;
public class Task24{
public static void main(String[] args){
	
			try(Scanner input = new Scanner(System.in);) {
				try {
					System.out.print("Enter a letter: ");
					char c = input.next().charAt(0);
					
					System.out.println(c+" is a "+(isVowel(c) ? "vowel" : "consonant"));
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	 
	
		public static boolean isVowel(char c) {
			char ch = Character.toLowerCase(c);	
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				return true;	
			else if('a' <= ch && ch <= 'z')	
				return false;
			else 	
				throw new IllegalArgumentException(c+" is an invalid input");
		}
	
	
}



