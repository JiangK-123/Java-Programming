import java.util.Scanner;
public class LabTask08{
    public static void main(String[] args) {

        System.out.println("The first 50 prime numbers are \n");
        
        printPrimeNumbers(50);
    }
        public static void printPrimeNumbers(int numberofprimes){
        final int NUMBER_OF_PRIMES_PER_LINE=10;//Display 10 per 1ine

        int count =0;//count the number of prime numbers
        
        int number = 2;// A number to be tested for primeness
        

while(count < numberofprimes){

// Print the prime number and increase the count

if(isPrime(number)){

count++;
}// Increase the count
if(count % NUMBER_OF_PRIMES_PER_LINE == 0){

// Print the number and advance to the new line

System.out.printf("%-5d\n",number);
}

else{

System.out.printf("%-5d",number);

//check if the next number is prime

number++;
}
}
        }


public static boolean isPrime(int number){

for(int divisor=2;divisor<=number/2;divisor++){

if(number %divisor ==0){//If true,number is not prime

return false;// number is not a prime

}
}
return true;// number is prime
}
}
