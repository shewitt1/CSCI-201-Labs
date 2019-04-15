import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class HiLoRandom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HiLoRandom
{
    public static final int RAN_VALUE_COUNT = 73;
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        /*
        for (int count = 1; count<=5;count++) {
            System.out.println("Please enter value " + count + ":");
            int value = keyboard.nextInt();
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
            
        }
        
        
        System.out.println("High: "+ max);
        System.out.println("Low: "+ min);
        */
        Random gen = new Random();
        
        max = 0;
        min = 1000;
        for (int count=1; count<=RAN_VALUE_COUNT; count++) {
            int value = gen.nextInt(1000); //generate an int in the interval [0, 1000)
            System.out.println("Value: " + value);
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
            
        }
        
        System.out.println("High: "+ max);
        System.out.println("Low: "+ min);
        
        
        
        
    }
}
