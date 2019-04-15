import java.util.Scanner;
/**
 * Yard sale program that determines the number of items bought and then calculates how much they owe
 *
 *1. Print description and then ask to enter name
 *2. Store name in variable name
 *3. Ask how many items they are buying
 *4. Store in variable itemNum
 *5. call variables subtotal, discount, and total 
 *6. do math for those variables and store them
 *7.Print out receipt
 *
 *
 *
 * @author Spencer Hewitt
 * @version 2/8/19
 */
public class yardSale
{
public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    //Description of what to do for inputs
        System.out.println("Spencer Hewitt's Yard Sale.");
        System.out.println("     All items are $4.99 each.");
        System.out.println("     You receive a $0.50 discount for every 5 items.");
        System.out.println("\nPlease enter your name");
        
        //grabs input of name
        String name = keyboard.nextLine();
        
        System.out.println("Hello " + name + ", please enter the number of items you are buying today: ");
        
        //calls variable itemNum to the number inputted
        int itemNum = keyboard.nextInt();
        
        //math here for all variables to be printed
        double subtotal = itemNum * 4.99;
        double discount = itemNum * 0.10;
        double total = subtotal - discount;
        
        //printed receipt - i dont really like using printf because I like
        //a simple way of printing out things that I can read back to myself
        System.out.println("Receipt for " + name);
        System.out.println("     You bought " + itemNum + " items");
        System.out.println("     Subtotal: $" + subtotal);
        System.out.println("     Discount: $" + discount);
        System.out.println("     Total: $" +  total);
        System.out.println("Thank you for shopping with us.");
    
    
}
}
