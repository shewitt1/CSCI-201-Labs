import java.util.Scanner;
/**
 * Calculates GPA based on UNCA's GPA calculations.
 *
 * @author Spencer Hewitt
 * @version 2/25/19
 * 
 * Start while loop
 * Ask for Grade
 * Store grade in variable grade
 * Start if statement 
 * If grade doesn't equal Q keep going
 * Ask for course hours
 * Store course hours in variable courseHours
 * Start if statement
 * Checks input and determines quality point value
 * End second if statement
 * Math for GPA
 * End first if statement
 * End while loop
 * 
 * Another if statement just incase first input is "Q"
 * If gpa hasn't changed, dont print GPA and end program
 */
public class calcGPA 
{
        public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        String grade = "";
        double qualityPoints = 0;
        int count = 0;
        int courseHours = 0;
        double totalCredits = 0;
        int totalHours = 0;
        double qualPoints = 0;
        double totalQualityPoints = 0;
        double gpa = -1;

        while (!grade.equals("Q")) {
            System.out.println("Input Grade: ");
            grade = keyboard.next();
            if(!grade.equals("Q")) {
                System.out.println("Input Course Hours: ");
                courseHours = keyboard.nextInt();

                if (grade.equals("A")) {
                    qualityPoints = 4;
                } else if (grade.equals("A-")) {
                    qualityPoints = 3.67;
                } else if (grade.equals("B+")) {
                    qualityPoints = 3.33;
                } else if (grade.equals("B")) {
                    qualityPoints = 3;
                } else if (grade.equals("B-")) {
                    qualityPoints = 2.67;
                } else if (grade.equals("C+")) {
                    qualityPoints = 2.33;
                } else if (grade.equals("C")) {
                    qualityPoints = 2;
                } else if (grade.equals("C-")) {
                    qualityPoints = 1.67;
                } else if (grade.equals("D+")) {
                    qualityPoints = 1.33;
                } else if (grade.equals("D")) {
                    qualityPoints = 1;
                } else if (grade.equals("F")) {
                    qualityPoints = 0;
                }

                totalCredits += qualityPoints;
                totalHours += courseHours;
                qualPoints = (courseHours * qualityPoints);
                totalQualityPoints += qualPoints;
                
                gpa = (totalQualityPoints / totalHours);
            }
        }
        
        if(gpa != -1) {
        System.out.println("Your GPA is: " + gpa);
    }

    }
}

