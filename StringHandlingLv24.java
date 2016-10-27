import java.util.Scanner;
public class StringHandlingLv24
{
    public static void main(String args[])
    {
        String word;
        int vowels = 0;
        int blanks = 0;
        int consonants =0;
        char ch;
        int length = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        word = sc.nextLine();

        for(int i = 0; i < word.length(); i ++)
        {
            ch = word.charAt(i);

            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || 
            ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u'    || ch == 'U')
                vowels ++;
            else if(Character.isWhitespace(ch))
                blanks ++;
        }
        
        length = word.length();
        
            if (blanks == length) {
              System.out.println("Nothing entered") ;
             } else {
                    System.out.println("Vowels : " + vowels);
                    System.out.println("Consonants : " + (word.length()- vowels - blanks) );
            }
        }
}

