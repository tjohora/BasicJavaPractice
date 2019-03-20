// Box  - Define & use 2 methods -
//			  drawLine has no parameters & no return value.
//			  drawBox has one parameters, the depth of the box

import java.util.Scanner;
public class Box
{
    public static void main(String[] args)
    {
        String character;
	int size;
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter size of box:");
	size = keyboard.nextInt();
        System.out.println("Enter character of box:");
        character = keyboard.nextLine();
	System.out.println("\nProgram output:");
	drawBox(character,size);
	System.out.println("\n\nProgram Complete");
}

// *** Method draws box of stars - (5 wide & depth deep)
    public static void drawBox(String character,int depth)
    {
        int i;

        for (i=1; i<= depth; i++)
        {
            drawLine(character);
        }
    }

// *** Method draws a line of 5 asterisks on the screen &
//     moves cursor onto next line

    public static void drawLine(String letter)
    {
        int i;

        for(i=1; i<= 5; i++)
        {
            System.out.print(letter);
        }
        System.out.println("\n");
    }
}
