import java.util.Scanner;
public class Question7 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        double total = 0;
        double average;
        double division = 0;
        
        System.out.println("Enter first number.");
        num1 = keyboard.nextInt();
        System.out.println("Enter second number.");
        num2 = keyboard.nextInt();
        System.out.println("Enter third number.");
        num3 = keyboard.nextInt();
        System.out.println("Enter fourth number.");
        num4 = keyboard.nextInt();
        System.out.println("Enter fifth number.");
        num5 = keyboard.nextInt();
        
        if (num1 >= 11)
        {
            total = total + num1;
            division = division + 1;
        }
        if (num2>= 11)
        {
            total = total + num2;
            division = division + 1;
        }
        if (num3>= 11)
        {
            total = total + num3;
            division = division + 1;
        }
        if (num4>= 11)
        {
            total = total + num4;
            division = division + 1;
        }
        if (num5>= 11)
        {
            total = total + num5;
            division = division + 1;
        }
        
        if (total == 0)
        {
            System.out.println("0");
        }
        else
        {
            average = total / division;
            System.out.println("The average of the numbers 11 or above is " + average);
        }
    }
}
