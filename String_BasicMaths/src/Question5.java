import java.util.Scanner;

public class Question5 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = keyboard.nextLine();
        
        System.out.println(sentence.toUpperCase());
    }
}
