import java.util.Scanner;
public class Question10 
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        double guess;
        double n;
        double r;
        
        System.out.println("Enter a number");
        n = keyboard.nextDouble();
        
        System.out.println("Now guess its root");
        guess = keyboard.nextDouble();
        
        for(int i=1;i<=5;i++)
        {
            r = n/guess;
            guess = (guess+r)/2;
        }
        System.out.println("The root is roughly " + guess);
    }
}
