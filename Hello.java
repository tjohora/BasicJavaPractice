import java.util.Scanner;
public class Hello 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String name;
        System.out.println("Hello, can you enter your name please.");
        name = keyboard.nextLine();
        System.out.println("Nice to meet you, " + name);
        int age;
        System.out.println("Can you enter your age.");
        age = keyboard.nextInt();
        System.out.println("Your age is " + age);
        double salary;
        System.out.println("Can you enter your salary please.");
        salary = keyboard.nextDouble();
        System.out.println("Your salary is " + salary);
    }
}
