import java.util.Scanner;
public class LabTask10{
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS=175;
        final int CHAR_PER_LTNE=25;

        for(int i=0;i<NUMBER_OF_CHARS;i++){
            char ch=RandomCharacter.getRandomLowCaseLetter();
            if((i+1)%(CHAR_PER_LTNE)==0)
            System.out.println(ch);
            else
            System.out.print(ch);
        }
        
    }
    public class RandomCharacter{
        public static char getRandomCharacter(char ch1,char ch2){
            return(char)(ch1+Math.random()*(ch2-ch1+1));
        }
        public static char getRandomLowCaseLetter(){
            return getRandomCharacter('a','z');
        }
        public static char getRandomUpperCaseLetter(){
            return getRandomCharacter('A','Z');
        }
    }

}
