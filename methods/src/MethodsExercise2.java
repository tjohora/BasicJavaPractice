import java.util.Scanner;
public class MethodsExercise2 
{
    public static void main(String[] args)
    {
        double radius;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        radius = keyboard.nextDouble();
        area(radius);
    }
    
    public static double area(double radius)
    {
        double result;
        result = Math.PI*Math.pow(radius,2);
        return result;
    }
}
