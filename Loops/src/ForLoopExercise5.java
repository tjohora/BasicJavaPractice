import java.util.Scanner;
public class ForLoopExercise5 
{
    public static void main(String[] arg)
    {
        Scanner keyboard = new Scanner(System.in);
        int num1;
        int num2;
        int total=1;
        
        System.out.println("Enter first number");
        num1 = keyboard.nextInt();
        System.out.println("Enter second number");
        num2 = keyboard.nextInt();
        if (num1 < num2)
        {
            for(int i=num1;i<=num2;i++)
            {
                total = total * i;
            }
        }
        else
        {
            for(int i=num2;i<=num1;i++)
            {
                total = total * i;
            }
        }
        System.out.println(total);
    }        
}