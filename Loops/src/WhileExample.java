import java.util.Scanner;
public class WhileExample
{
  public static void main(String[] args)
  {   
    int num; 
    int count = 0;
    Scanner keyboard = new Scanner(System.in);
            
    // Input num
    System.out.print("Please enter number (sentinel = -1):");
    num = keyboard.nextInt();

    while (num != -1)
    {
      //Process num
      count ++; 
     
      // Input num
      System.out.print("Please enter number (sentinel = -1):");
      num = keyboard.nextInt();
    }

    System.out.println("You entered " + count + " numbers as part of data");
  }
}
