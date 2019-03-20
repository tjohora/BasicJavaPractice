import java.util.Scanner;
   public class DoWhileDemo
{
    public static void main(String[] args) 
    {
        int count, number;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number");
        number = keyboard.nextInt(); 
        
        count = 0;
        do
        {
            System.out.print(count + " ");
            count++;
        }while (count <= number);	       //Note ;
        System.out.println();        
    } 
}
