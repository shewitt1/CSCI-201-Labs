
/**
 * Gets input of name, hours worked, and payrate, then computes them to find gross pay.
 *
 * @author Spencer Hewitt
 * @version 1/27/19
 */
import java.util.Scanner;
public class PayCheck
{

    
    /*
     * 1. Ask user for name
     * 2. Get name
     * 3. Ask user for payrate
     * 4. Get payrate
     * 5. Ask user for hours worked
     * 6. Get hours worked.
     * 7. Compute Gross pay
     * 8. Print
     * 
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
      
        System.out.println("Enter employee name");
        String name = input.nextLine();
        
        System.out.println("Enter hours worked");
        int hoursWorked = input.nextInt();
        
        System.out.println("Enter pay rate");
        double payRate = input.nextDouble();
                
            
        double grossPay = hoursWorked * payRate;  
         
         System.out.println(name + "'s gross pay is $" + grossPay + ".");
    }

}
