import java.util.Scanner;

public class Question4 
{
  public static void main(String[] args) 
  { 
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter you weight (in kilograms)");
    
    double weight = keyboard.nextDouble();
    
    System.out.println("Enter your height(in metres)");
    
    double height = keyboard.nextDouble();
    
    double BMI = weight / height / height;
    if (BMI >= 30.0)
    {
        System.out.println("You are obese");
    }
    else if ((BMI >= 25.0) && (BMI <= 29.9))
    {
        System.out.println("You are overweight");
    }
    else if ((BMI >= 18.5) && (BMI <= 24.9))
    {
        System.out.println("You are normal");
    }
    else 
    {
        System.out.println("You are underweight");
    }
  }
}