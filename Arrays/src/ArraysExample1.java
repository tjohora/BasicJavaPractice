import java.util.Scanner;
public class ArraysExample1 
{
    public static void main(String[] args)
    {
        Scanner kbrd = new Scanner(System.in);
        System.out.println("Enter how many integers you want:");
        int arraySize = kbrd.nextInt();
        System.out.println();
        int totalArrayContents = 0;
        int [] storeNumbers = new int[arraySize];
        for (int arrayIndex = 0; arrayIndex < arraySize; arrayIndex++)
        {
            System.out.print("Enter integer " + (arrayIndex + 1) + ": ");
            storeNumbers[arrayIndex] = kbrd.nextInt();
        }
        System.out.println("\nThe number of array elements is: " + storeNumbers.length +"\n");
    
        for (int i = 0; i <storeNumbers.length; i++)
        {
            totalArrayContents += storeNumbers[i];
        }
        
        System.out.println("The sum of the array element contents is: " + totalArrayContents + "\n");
    }
}
