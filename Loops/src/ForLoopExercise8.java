import java.util.Scanner;
public class ForLoopExercise8 
{
    public static void main(String[] args)
    {
        int num1;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a number between 1 and 10.");
        num1 = keyboard.nextInt();
        if(num1 < 1 || num1 > 10)
        {
            System.out.println("I said between 1 and 10!");
        }
        else
        {
            for(int i=1;i<=num1;i++)
            {
                for(i=1;i<=num1;i++)
                {
                    System.out.print("*");
                    System.out.println();
                }
                
            }
        }
    }    
}
