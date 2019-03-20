import java.util.Scanner;

public class Question6
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the capital of ireland?");
        String answer = keyboard.nextLine();
        
        if (answer.equals("Dublin") || answer.equals("dublin"))
        {
            System.out.println("You are correct!");
        }
        
        else
        {
            System.out.println("You are incorrect. Please try again.");
        }
    }
}
