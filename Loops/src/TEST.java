import java.util.Scanner;
public class TEST 
{
 public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);      
        for(int ctr = 1; ctr <=35; ctr++)
        {
            System.out.println("Enter the child's name:");
            String child =  keyboard.nextLine();
            System.out.println("Enter the child's age:");
            int age =  keyboard.nextInt();
           System.out.println(child +" does not have Mr.Escalante for a teacher.");
        }
    }
}
