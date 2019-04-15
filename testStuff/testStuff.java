import java.util.Scanner;
/**
 * Write a description of class testStuff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class testStuff
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double taxRate = 0;
        
        int taxCode = 1;
        switch (taxCode) {
            case 1:
                taxRate = .07;
                break;
            case 2:
                taxRate = .15;
                break;
            case 3:
                taxRate = .21;
                break;
            case 4:
                taxRate = .28;
                break;
            default:
                System.out.println("Invalid tax code given!");
                break;
        }
        
        
        
        
        
    }
}
        
        

        
        
    
