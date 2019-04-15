import java.util.Scanner;
/**
 * Takes the input of the cost of the car and the cost of a train ticket, and compares the two.
 *
 * @author Spencer Hewitt
 * @version 1/30/19
 * 
 * 
 * 
 * 1) Input distance from home to work
2) Store in variable workMiles
3) Input fuel efficiency of car
4) Store value in variable milesPerG
5) Input price of one way train ticket
6) Store value in variable trainPrice
7) costOfGas = milesPerG / 4
8) maintenenceCost = workMiles * .05 
9) carCost = costOfGas + maintenenceCost
10) trainCost = trainPrice * 2
11) If carCost > trainCost then print "train is cheaper"
12) else print "car is cheaper"
 */
public class transportCosts
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Input distance from home to work: ");
        int workMiles = keyboard.nextInt();
        
        System.out.println("Input miles per gallon");
        int milesPerG = keyboard.nextInt();
        
        System.out.println("Input price of one-way train ticket: ");
        int trainPrice = keyboard.nextInt();
        
        int costOfGas = (milesPerG / 4);
        
        double maintenenceCost = (workMiles * .05);
        
        double carCost = (costOfGas + maintenenceCost);
        
        int trainCost = (trainPrice * 2);
        
        System.out.println("The cost of the car is $" + carCost + ".");
        System.out.println("The cost of the train is $" + trainCost + ".");
        
        
        if(carCost > trainCost) {
            System.out.println("The Train is cheaper than the car!");
        }
        else {
            System.out.println("The Car is cheaper than the train!");
        }
        
        
    }
}
