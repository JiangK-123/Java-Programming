import java.util.Scanner;

public class LabTask15 {
    public static void main(String[] args) throws Exception {
    System.out.println("Please iuput strings； ");
    Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean flag=true;
    
		for(int i=0;i<s.length()/2;i++){
			if((s.charAt(i))!=(s.charAt(s.length()-1-i))){
				flag=false;
			}
		}
		if(flag==true){
			System.out.println(s+" is parlindrome");
		}else{
			System.out.println(s+" is not parlindrome");
		}
		
	}

}
