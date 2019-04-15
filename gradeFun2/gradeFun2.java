

import java.util.Scanner;
/**
 * Write a program that will read in a letter grade and print its UNC Asheville quality points:  
 *
 * @author Spencer Hewitt
 * @version 2/17/19
 */
public class gradeFun2
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Input letter grade:");
        String letterGrade = keyboard.next();
        
        if (letterGrade.equals("A")){
            System.out.println("4.00");
        }
        
        else if (letterGrade.equals("A-")) {
            System.out.println("3.67");
        }
        
        else if (letterGrade.equals("B+")) {
            System.out.println("3.33");
        }
        
      else if (letterGrade.equals("B")) {
            System.out.println("3.00");
        }
        
      else  if (letterGrade.equals("B-")) {
            System.out.println("2.67");
        }
        
       else if (letterGrade.equals("C+")) {
            System.out.println("2.33");
        }
        
        else if (letterGrade.equals("C")) {
            System.out.println("2.00");
        }
        
        else if (letterGrade.equals("C-")) {
            System.out.println("1.67");
        }
        
        else if (letterGrade.equals("D+")) {
            System.out.println("1.33");
        }
        
      else  if (letterGrade.equals("D")) {
            System.out.println("1.00");
        }
        
        else if (letterGrade.equals("F")) {
            System.out.println("0.00");
        } 
        
        
        
        
        
        
        
    }
}
