
public class ArraysExample2 {
    public static void main (String[] args)
    {
        double [] anArray = new double [5];
        
        System.out.println("\nThe number of array elements is: " + anArray.length +"\n");
        
        System.out.println("The default array element values are: ");
        for(int i = 0;i< anArray.length; i++)
        {
            System.out.print(anArray[i] + " , ");
        }
    }
}
