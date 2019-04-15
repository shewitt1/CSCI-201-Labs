import java.util.Scanner;
/**
 * Write a description of class gradeFun3 here.
 *
 * @author Spencer Hewitt
 * @version 2/18/19
 */
public class gradeFun3
{
    public static final double A_VALUE = 4.0;
    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("Enter letter grade:");
        String letterGrade = keyboard.nextLine();
        letterGrade = letterGrade.toUpperCase();
        double gradeValue;
        
        while (!letterGrade.equals("Q")){
        switch (letterGrade) {
            default : gradeValue = 0.0;
            break;
            case "A" : gradeValue = 4.0;
            break;
            case "B" : gradeValue = 3.0;
            break;
            case "C" : gradeValue = 2.0;
            break;
            case "D" : gradeValue = 1.0;
            break;
            case "F" : gradeValue = 0.0;
        }//end switch
        
        System.out.printf("Lettergrade = %s GradeValue = %1.2f\n", 
            letterGrade, gradeValue);
        
        System.out.println("Enter letter grade:");
        letterGrade = keyboard.nextLine();
        letterGrade = letterGrade.toUpperCase();
            
            
        }//end while
        
        System.out.println("Goodbye!");
    }//main
}//class
