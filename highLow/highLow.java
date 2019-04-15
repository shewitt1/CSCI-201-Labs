import java.util.Scanner;
/**
 * To find highest value in a sequence of numbers
 *
 * @author Spencer Hewitt
 * @version 2/20/19
 * 
 * 
 * Assume sequence ends with a negative value
 * ask for number
 * get number
 * while number not negative
 *    if number > maxNumber 
 *    maxNumber = number
 *   ask for number
 *   get number
 * 
 * 
 *
 */
public class highLow
{
    public static void main(String[] args) {
        int maxNumber = Integer.MIN_VALUE; //lowest possible value for int datatype
        int minNumber = Integer.MAX_VALUE; //highest possible value for int datatype
        Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter a number:");
        int number = keyboard.nextInt();
        double sum = 0;
        int count = 0;
        
        
        while (number >= 0) {
            
            if (number > maxNumber) {
                maxNumber = number;
            }//if
            
            if (number < minNumber) {
                minNumber = number;
            }//if
            sum = sum + number;
            count++;
            
            System.out.println("Please enter another number:");
            number = keyboard.nextInt();
        }//while

        
        if (maxNumber == Integer.MIN_VALUE || minNumber == Integer.MAX_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("Your highest number was " + maxNumber + ".");
            System.out.println("Your lowest number was " + minNumber + ".");
            double average = sum / count;
            System.out.println("Your average number was " + average + ".");
        }

        
    }
}
