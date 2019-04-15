import java.util.Scanner;
/**
 * Counts the number of vowels in a string
 *
 * @author Spencer Hewitt
 * @version 2/22/19
 */
public class vowelCount
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //initiates scanner

        System.out.println("Input your string: "); //gets string input
        String str = keyboard.nextLine();

        int vowels = 0; //calls variables for loop and string length
        int strLength = str.length();
        
        str.toLowerCase(); //sets string to lower case to make it case sensitive

        
        for (int i = 0; i < strLength; i++) { //initiates for loop

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
            || str.charAt(i) == 'o' || str.charAt(i) == 'u') { //checks every character to see if it is a vowel
                vowels++; //counts vowel variable up every time it scans a vowel

            } //end if
        } //end for
        
        
        System.out.println("There are " + vowels + " vowels in your string."); //prints number of vowels
       
    }
}
