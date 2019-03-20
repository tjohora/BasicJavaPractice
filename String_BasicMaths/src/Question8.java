import java.util.Random;
public class Question8 {
    public static void main(String[] args)
    {
        Random rand = new Random();
        
        int smallest = 50;
        int biggest = 0;
        int total = 0;
        int evenNums = 0;
        int i;
        
        for(i=1; i<=10;i++)
        {
            int randNum = 1+rand.nextInt(50);
            System.out.println(randNum);
            total = total + randNum;
            
            if (randNum >= biggest)
            {
                biggest = randNum;
            }
            if (randNum <= smallest)
            {
                smallest = randNum;
            }
            if (randNum%2 == 0)
            {
                evenNums = evenNums + 1;
            }
        }
        System.out.println("The smallest number generated is " + smallest);
        System.out.println("The biggest number generated is " + biggest);
        System.out.println("The total of the numbers generated is " + total);
        System.out.println("The number of even number generated is " + evenNums);

    }
}
