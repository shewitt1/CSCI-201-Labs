import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class nestedLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nestedLoops
{
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Input Number:");
       int number = keyboard.nextInt();
       Random gen = new Random(200);
       
       
       for (int row = 0; row < number; row++) {
           for(int col = 0; col < number; col++) {
               int value = gen.nextInt(101);
               System.out.printf("%3d ", value);
            }
            System.out.println();
           
        }
    }
}
