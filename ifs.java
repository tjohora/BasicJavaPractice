import java.util.Scanner;
public class Excercise1 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int num1;
        System.out.println("Enter first number.");
        num1 = keyboard.nextInt();
        int num2;
        System.out.println("Enter second number.");
        num2 = keyboard.nextInt();
        int num3;
        System.out.println("Enter third number.");
        num3 = keyboard.nextInt();
        int total = num1 + num2 + num3;
        int average = total/3;
        int biggest;
        int smallest;
        
        if ((num1 > num2) && (num1 > num3)){
            biggest = num1;
        }
        else if ((num2 > num1) && (num2 > num3)){
            biggest = num2;
        }
        else
        {
            biggest = num3;
        }
        
        if ((num1 < num2) && (num1 < num3)){
            smallest = num1;
        }
        else if ((num2 < num1) && (num2 < num3)){
            smallest = num2;
        }
        else
        {
            smallest = num3;
        }
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
        System.out.println("The biggest number is " + biggest);
        System.out.println("The smallest number is " + smallest);
    }
}
