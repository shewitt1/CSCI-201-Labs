import java.util.Scanner;
/**
 * Approves/Denies a loan based on certain criteria provided by the user.
 *
 * @author Spencer 
 * @version 2/20/19
 */
public class loanApproval
{
    public static void main(String[] args) {    
        double interestRate = 0; //sets interest rate to 0 to not call it later on.

        //start scanning for input

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = keyboard.nextLine();

        System.out.println("Enter your annual salary: ");
        int salary = keyboard.nextInt();

        System.out.println("Enter your FICO score: ");
        int score = keyboard.nextInt();

        System.out.println("Enter your number of years employed");
        int yearsEmployed = keyboard.nextInt();

        System.out.println("Enter requested loan amount: ");
        double loanAmount = keyboard.nextDouble();

        System.out.println("Enter number of financing months (3 to 75): ");
        int financeMonths = keyboard.nextInt();

        //end Scanning for input

        //start if statements
        //checks if salary is less than $25,000
        if (salary < 25000) {
            System.out.println("Loan not approved. Salary is below $25,000");
            return;
        }

        //checks if FICO score is within boundaries and gives interestRate for inputted FICO #
        if (score >= 750) {
            interestRate = .03;
        } else if (score >= 700 && score <= 749) {
            interestRate = .05;
        } else if (score >= 650 && score <= 699) {
            interestRate = .10;
        } else if (score >= 600 && score <= 649) {
            interestRate = .15;
        } else if (score <= 600 || score >= 800) {
            System.out.println("Loan not approved. FICO score is lower than 600 or invalid.");
            return;
        }

        //checks if years employed is less than 2
        if (yearsEmployed < 2) {
            System.out.println("Loan not approved. Must have been employed for at least 2 years.");
            return;
        }

        //checks if loan amount is less than 500 or more than 30% of salary
        if (loanAmount < 500 || loanAmount > (salary * .30)) {
            System.out.println("Loan not approved. Less than $500 or more than 30% of salary.");
            return;
        }
        //checks if finance months is lower than 3 or more than 75
        if (financeMonths < 3 || financeMonths > 75) {
            System.out.println("Loan not approved. Finance months must be between 3 or 75.");
            return;
        }

        //end if statements

        //math for monthly payment and total payment
        double monthlyPayment = interestRate * loanAmount / (1 - Math.pow(1+interestRate,-1*financeMonths));
        double totalAmount = (financeMonths * monthlyPayment);
        double totalInterest = (loanAmount * interestRate);

        //prints out results if loan is accepted
        System.out.println(name + ", your loan of " + loanAmount + " has been approved with an interest rate of " + (interestRate * 100) + "%.");
        System.out.println("Number of finance months: " + financeMonths + ".");
        System.out.println("Monthly Payment: $" + monthlyPayment);
        System.out.println("Total payment after " + financeMonths + " months: " + totalAmount);
        System.out.println("Total interest paid: $" + (totalInterest));
    }
}
