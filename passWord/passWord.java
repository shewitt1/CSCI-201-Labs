import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class passWord here.
 *
 * @author Spencer Hewitt
 * @version 2/1/19
 */
public class passWord
{
public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    //Variables
    System.out.println("Enter First Name: ");
    String firstName = keyboard.nextLine();
    
    System.out.println("Enter Middle Name: ");
    String middleName = keyboard.nextLine();
    
    System.out.println("Enter Last Name: ");
    String lastName = keyboard.nextLine();
    
    System.out.println("Enter Birthday(MM/DD/YY): ");
    String bDay = keyboard.nextLine();
    
    String password = "";
    
    
    //Creating password
    
    
    password += lastName.charAt(0);
    password += middleName.charAt(0);
    password += firstName.charAt(0);
    password += bDay.charAt(3);
    password += bDay.charAt(4);
    password += middleName.toUpperCase();
    int length = password.length();
    
    password += length;
    password = password.substring(0,3).toLowerCase() + password.substring(3,password.length());

    
    System.out.println("Your password is: " + password);
    
    
}
}
