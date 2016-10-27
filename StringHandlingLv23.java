import java.util.Scanner;
public class StringHandlingLv23
{
    public static void main(String args[])
    {
		String word;
		int vowels = 0;
		int blanks = 0;
		int consonants =0;
		char ch;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		word = sc.nextLine();

		for(int i = 0; i < word.length(); i ++)
		{
			ch = word.charAt(i);

			if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || 
			ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
				vowels ++;
			else if(Character.isWhitespace(ch))
				blanks ++;
		}

		System.out.println("Vowels : " + vowels);
		System.out.println("Consonants : " + (word.length()- vowels - blanks) );
    }
}
        