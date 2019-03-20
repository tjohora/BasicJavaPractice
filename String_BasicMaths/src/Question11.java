import java.util.Scanner;
public class Question11 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String name;
        char firstLetter;
        int nameEnd;
        
        System.out.println("Enter your name");
        name = keyboard.nextLine();
        firstLetter = name.charAt(0);
        nameEnd = name.indexOf(" ");
        
        
        //System.out.println("Your name in pig latin is " + );
    }
}
