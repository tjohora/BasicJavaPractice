import java.util.Scanner;

public class Question3
{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the diameter of a sphere");
    double diameter = keyboard.nextDouble();
    
    double radius = diameter/2;
    
    double volume =  (4/3) * Math.PI * Math.pow(radius, 3);
    
    System.out.println("The volume of the sphere is " + volume);
  }
}