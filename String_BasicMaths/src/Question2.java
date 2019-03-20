import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) 
  { 
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter first name");
    String firstName = keyboard.nextLine();
    
    System.out.println("Enter second name");
    String secondName = keyboard.nextLine();
    
    System.out.println("Your gangsta name is " + firstName.charAt(0) + ". Diddy " + secondName + " " + firstName + "-izzle");
  }
}