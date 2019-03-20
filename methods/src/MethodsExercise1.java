import java.util.Scanner;
public class MethodsExercise1 
{
    public static void main(String[] args)
    {
        String firstName,secondName;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first name:");
        firstName = keyboard.nextLine();
        System.out.println("Enter surname name:");
        secondName = keyboard.nextLine();
        reverse(firstName,secondName);
        
    }
    
    public static void reverse(String firstName,String secondName)
    {
        System.out.println(secondName+", "+firstName);
    }
}
