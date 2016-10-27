import java.util.Scanner;

public class StringHandlingLv25
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
     
        String word = "RANDOM" ;
        String guess = "";
        String output = "";
        int points = 0;
                     
        while (points < 6) {
        System.out.println("Guess the six character word");
        guess = sc.nextLine();
        if (Character.toUpperCase(guess.charAt(0)) == ('R')) {
            output = (output + "R");
            points ++;
        } else {
            output = (output + "?");
        }
         if (Character.toUpperCase(guess.charAt(1)) == ('A')) {
            output = (output + "A");
            points ++;
        } else {
            output = (output + "?");
        }
         if (Character.toUpperCase(guess.charAt(2)) == ('N')) {
            output = (output + "N");
            points ++;
        } else {
            output = (output + "?");
        }
         if (Character.toUpperCase(guess.charAt(3)) == ('D')) {
            output = (output + "D");
            points ++;
        } else {
            output = (output + "?");
        }
         if (Character.toUpperCase(guess.charAt(4)) == ('O')) {
            output = (output + "O");
            points ++;
        } else {
            output = (output + "?");
        }
         if (Character.toUpperCase(guess.charAt(5)) == ('M')) {
            output = (output + "M");
            points ++;
        } else {
            output = (output + "?");
        }       
        System.out.println(output);
       }
       System.out.println("Well done, word has been guessed");
    }
}