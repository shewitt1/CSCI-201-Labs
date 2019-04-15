import java.util.Scanner;
/**
 * Calculates what letter grade you have based on the number
 *
 *Get grade and store in variable grade
 *if statement (>90=a >80=b >70=c >60=d else F)
 *print grade in if statement
 *
 *
 *
 * @author Spencer Hewitt
 * @version 2/11/19
 */
public class gradeFun
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Input your grade (Number): ");
        double numberGrade = keyboard.nextDouble();
        
        
        
        //wasnt sure if we were supposed to use the grading scale for our class
        // so i used the 10 point one
        if (numberGrade >=90){
            System.out.println("You have an A!");
        } else if (numberGrade >=80) {
            System.out.println("You have a B!");
        } else if (numberGrade >=70) {
            System.out.println("You have a C!");
        } else if (numberGrade >=60) {
            System.out.println("You have a D!");
        } else {
            System.out.println("You have an F!");
        }
   
        
        
        
        
        
        
        
    }
}
