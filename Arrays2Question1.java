import java.util.Scanner; //lets us use scanners
import java.util.Random; //lets us use random number generators
public class Arrays2Question1 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);//new scanner called "KEYBOARD"
        int average=0,count=0,smallestNum=50,userNum,userTotal=0;
        Random randNum = new Random();//new random element
        int randomArray[] = new int[10];//new array,10 elements large
        for (int i = 0; i< 10; i++) 
        {
            randomArray[i] = randNum.nextInt(51)+1;//get random numbers between 1-50
            System.out.print(randomArray[i] +" ");//outputing array
            average += randomArray[i];//getting total for average later
            if (randomArray[i]>25)
            {
                count++; //counting the amount of integers above 25
            }
            if (randomArray[i]<smallestNum)
            {
                smallestNum=randomArray[i];//if the random number is smaller, it becomes the smallest
            }
        }
        System.out.print("\n");//next line("hitting enter")
        System.out.println("The average is "+ average/10);//print total divided by amount of elements(10)
        System.out.println("The number of integers above 25 is " + count);//print integers above 25
        System.out.println("The smallest number is "+smallestNum);//print smallest number
        System.out.println("Enter a number:");
        userNum = keyboard.nextInt();//user prompted to enter a number
        for (int j = 0; j< 10; j++)
        {
            if(randomArray[j]> userNum)
            {
                System.out.print(randomArray[j] + " ");//numbers larger than user number is printed
                userTotal += randomArray[j];//numbers larger than user number is added together to get total
            }
        }
        System.out.print("\n");//next line
        System.out.println("The total of number above user number is " + userTotal);//print total from earlier
        System.out.print("The random array +5 is ");
        for (int k=0; k<10; k++) {                       
            System.out.print(randomArray[k]+5 + " ");//array created is displayed with all values added 5            
        }

    }
}
