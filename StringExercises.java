//String to use is "Dundalk Institute of Technology"
public class StringExercises 
{
    public static void main(String[] args)
    {
        String String1= "Dundalk Institute of Technology";
        char firstChar,lastChar,fourthChar,fifthChar;
        //int j = 0;
       
        firstChar = String1.charAt(0);
        lastChar = String1.charAt(String1.length()-1);
        System.out.println("1) First character is " + firstChar + " and Last character is " + lastChar);
        
        fourthChar = String1.charAt(3);
        fifthChar = String1.charAt(4);
        System.out.println("2) Fourth character is " + firstChar + " and fifth character is " + lastChar);
        
        System.out.println("3) Deleted first 4 characters: " + String1.substring(4));
        
        System.out.println("4) Last 3 characters capitalized: " + String1.substring(String1.length()-3).toUpperCase());
        
        /*while(String1.charAt(j)==String1.indexOf("i")|| String1.charAt(j)==String1.indexOf("I"))
        {
            j++;
        }
        */
        System.out.println("5) First 'i' is in position " + String1.indexOf("I") + " and the character after it is " + String1.charAt(String1.indexOf("I")+1));
        
        System.out.println("6) Second last charcter: " + String1.charAt(String1.length()-2));
        
        System.out.print("7) Every second letter: ");
        for (int i=0;i<=String1.length()-1;i++)
        {
            if (i%2==1)
            {
                System.out.print(String1.charAt(i));
            }
        }
        System.out.print("\n");
        
        System.out.println("8) First four characters capitalized: " + String1.substring(0,4).toUpperCase()+ String1.substring(4));
        
        System.out.println("9) Deleted last 3 characters: " + String1.substring(0,String1.length()-4));
        
        System.out.println("10) Last 'i' is in position: " + String1.lastIndexOf("i")+ " and the character before it is " + String1.charAt(String1.indexOf("i")-1));
        
        //System.out.println("11)" + boolean Uc = Character.isUpperCase(String1.charAt(2));
    }
}
