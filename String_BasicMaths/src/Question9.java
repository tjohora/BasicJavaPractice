import java.util.Scanner;
public class Question9 
{
    public static void main(String[]args)
    {
        String sentence;
        int space1;
        int space2;
        int space3;
        String word1;
        String word2;
        String word3;
        String word4;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a sentence with four words.");
        sentence = keyboard.nextLine();
        
        space1 = sentence.indexOf(" ");
        word1 = sentence.substring(0,space1);
        
        space2 = sentence.indexOf(" ",space1+1);
        word2 = sentence.substring(space1+1,space2);
        
        space3 = sentence.indexOf(" ",space2+1);
        word3 = sentence.substring(space2+1,space3);
        
        word4 = sentence.substring(space3+1);
        
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(word4);
        
        
        
    }
}
