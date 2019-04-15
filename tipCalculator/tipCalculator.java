import java.util.Scanner;
/**
 * Takes input of total price and prints 18% tip, 20% tip, and 22% tip.
 *
 * @author Spencer Hewitt
 * @version 1/30/19
 * 
 * 
 * Ask user for name
 * store input in variable name
 * Ask user for total price
 * store input in variable totalPrice
 * Calculate 18% tip, 20% tip, and 22% tip by
 * multiplying totalPrice by .18, .20, and .22 and storing
 * in 3 separate variables, tip18, tip20, tip22
 * Print tips
 * 
 * 
 * 
 */
public class tipCalculator
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Input name: ");
        String name = keyboard.nextLine();
        
        System.out.println("Input total price of meal: ");
        double totalPrice = keyboard.nextDouble();
        
        double tip18 = (totalPrice * .18);
        double tip20 = (totalPrice * .20);
        double tip22 = (totalPrice * .22);
        
        System.out.println("18% Tip would be: $" + tip18 + ".");
        System.out.println("20% Tip would be: $" + tip20 + ".");
        System.out.println("22% Tip would be: $" + tip22 + ".");
        
        
        
        
        
    }
}
