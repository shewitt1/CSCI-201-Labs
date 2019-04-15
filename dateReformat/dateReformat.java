import java.util.Scanner;
/**
 * Reformats the inputted date into the European style of date format.
 *
 * @author Spencer Hewitt
 * @version 2/4/19
 * 
 * Ask for date
 * Store date in variable date
 * Create 3 new variables to add substrings to
 * Call them newMonth, newDay, and newYear
 * Get the substring from character 0 to character 2 for the newMonth
 * Get the substring from character 3 to character 5 for the newDay
 * Get the substring from character 6 to character 10 for the newYear
 * Print out everything and tell the user the new date
 * 
 * 
 */
public class dateReformat
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter date(MM/DD/YYYY)");
        String date = keyboard.nextLine();
        
        //creates blank string variables to add substrings to
        String newMonth = "";
        String newDay = "";
        String newYear = "";
        
        //adds the substrings of the date string into the variables created before
        newMonth = date.substring(0,2);
        newDay = date.substring(3,5);
        newYear = date.substring(6,10);
        
        
        //prints out original date and then the european format date
        System.out.println("You entered: " + date);
        System.out.println("\nDate in European Format:" + newDay + "." + newMonth + "." + newYear);
        // Dr. Mec's way of printing instead of adding variables with +
        System.out.printf("Date in European Format: %s.%s.%s\n", newDay, newMonth, newYear);
    }
}
