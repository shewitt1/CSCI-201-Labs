import java.util.Scanner;
/**
 * Computes the percentage of a cars usage for work and personal use
 * NEED:
 * # of work days
 * odometer reading on day 1
 * odometer reading on the end of the last day
 * one way distance from home and to place of employment
 *----------------------------------------
 *Ask for name
 *Store name
 *Ask for number of work days
 *Store number of work days under variable
 *Ask for odometer reading on day 1
 *Store Odometer reading on day 1 in odometer1
 *Ask for odometer reading on the end of the last day
 *Store reading from last day in odometer2
 *Ask for mileage from home to work
 *Store mileage from home to work in distanceWork
 *Take mileage from home to work and sub
 *Subtract day 1 miles from end of last day miles to get total miles 
 *Store that in totalMiles
 *Multiply distance from home to work * 2 and * # of work days
 *Put work miles into a variable
 *Subtract work miles from total miles 
 * work percentage = work over total
 * personal percentage = 1 - work percentage
 *print out totalmiles, work percent, and personal percent
 *----------------------------------------
 * @author Spencer Hewitt
 * @version 1/30/19
 */
public class WorkMileage
{

   
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String workerName = keyboard.nextLine();
        
        System.out.println("Input number of Work Days: ");
        int daysWorked = keyboard.nextInt();
        
        System.out.println("Enter miles on odometer on day 1: ");
        int odometer1 = keyboard.nextInt();
        
        System.out.println("Enter miles on odometer on final day: ");
        int odometer2 = keyboard.nextInt();
        
        System.out.println("Enter miles from home to work: ");
        double distanceWork = keyboard.nextDouble();
        
        int totalMiles = (odometer2 - odometer1);
        
        double workMiles = ((distanceWork * 2) * daysWorked);
        double personalMiles = (workMiles - totalMiles);
        
        double workPercent = ((workMiles / totalMiles) * 100);
        double personalPercent = (100 - workPercent);
        
        System.out.println("Your total miles are: " + totalMiles + " miles.");
        System.out.println("Your work percentage is: " + workPercent + "% of your total.");
        System.out.println("Your personal percentage is: " + personalPercent + "% of your total.");
    }


}
