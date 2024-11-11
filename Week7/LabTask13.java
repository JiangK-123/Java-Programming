import java.util.Scanner;
public class LabTask13{
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                
                System.out.print("Enter a hexadecimal number: ");
                String hex = input.nextLine();
                
                int decimalValue = hexToDecimal(hex.toUpperCase());
                
                System.out.println("The decimal value for hex number " + hex + " is " + decimalValue);
                
                input.close();
            }
        
            // Method to convert a hexadecimal string to decimal
            public static int hexToDecimal(String hex) {
                int decimalValue = 0;
                for (int i = 0; i < hex.length(); i++) {
                    char hexChar = hex.charAt(i);
                    decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
                }
                return decimalValue;
            }
        
            // Method to convert a single hex character to its decimal value
            public static int hexCharToDecimal(char ch) {
                if (ch >= 'A' && ch <= 'F')
                    return 10 + ch - 'A';
                else // ch is '0', '1', ..., '9'
                    return ch - '0';
            }     
    }
