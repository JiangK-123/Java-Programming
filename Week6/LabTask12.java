import java.util.Scanner;

public class LabTask12 {
    public static void main(String[] args) throws Exception {

     int count=0;  
     int number=0;       
     for(int i = 2;count < 50; i++)
    	 
	     {
	    	 int isprime = 1;         
	    	 for(int n=2;n<i;n++)   
	    	 { 
	    		 if(i%n==0)           
	    		 {
	    			 isprime=0;
	    			 break;
	    		 }
	    	 }
	    		 if(isprime==1) 
	    		 {
	    			 System.out.print(i+" ");
	    			 number=number+1; 
	    			 count=count+1;
	    			 	 if(number%10==0)
	    			 	 {
	    				 System.out.println();
	    		         }
	    		 }
	     }
		
	 }

        }


    

