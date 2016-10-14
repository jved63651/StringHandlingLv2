
import java.util.Scanner;

public class StringHandlingLv22
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String words = "";
        char character;
        int length = 0;
        
        System.out.println("Enter string");
        words = sc.nextLine();
        length = words.length();
        
        for (int i = 0; length > 0 ; i++) {
            character = character + words.charAt(length);
            length--;
        }
        System.out.println(character);
    }
}
