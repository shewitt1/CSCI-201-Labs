import java.util.Scanner;
/**
 * Write a description of class bankProcessing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bankProcessing
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double interestRate = 0.05;
        double deposit = 0;
        double withdraw = 0;
        
        System.out.println("Enter beginning balance: ");
        double balance = keyboard.nextDouble();
        
        System.out.println("Enter transaction: ");
        String transaction = keyboard.next();
        transaction.toLowerCase();
        
        while (!transaction.equals("quit")) {
            if (transaction.equals("deposit")) {
                System.out.println("Enter amount you would like to deposit: ");
                deposit = keyboard.nextDouble();
                balance += deposit;
                System.out.println("New Balance: " + balance + "\n");
                System.out.println("Enter transaction: ");
                transaction = keyboard.next();
            } 
            
            else if (transaction.equals("withdraw")) {
                System.out.println("Enter amount you would like to withdraw: ");
                withdraw = keyboard.nextDouble();
                balance -= withdraw;
                System.out.println("New Balance: " + balance + "\n");
                System.out.println("Enter transaction: ");
                transaction = keyboard.next();
            } 
            
            else if (transaction.equals("interest")) {
                balance = balance + (0.05*balance);
                System.out.println("New Balance: " + balance + "\n");
                System.out.println("Enter transaction: ");
                transaction = keyboard.next();
            } 
            
            else {
                System.out.println(transaction + " is an invalid transaction code");
                System.out.println("Enter transaction: ");
                transaction = keyboard.next();
            }
           
        }
            
            
            
        }
        
        
        
    }
