
public class ArraysExample3 
{
    public static void main(String[] args)
    {
        String [] languages = {"French", "JavaScript", "Sign Language", "Klingon"};
        
        System.out.print("The array element values are: ");
        for(int i = 0; i<languages.length; i++)
        {
            if(i==languages.length-1)
            {
                System.out.println(languages[i] + ".\n");
            }
            else
            {
                System.out.println(languages[i] + " , ");
            }
        }
    }
}
