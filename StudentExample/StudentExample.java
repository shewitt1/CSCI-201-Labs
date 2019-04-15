
/**
 * Write a description of class StudentExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentExample
{
    public static void main(String[] args) {
        Student currentStudent = new Student(930364473, "Pat", "Rick", "patrick@unca.edu");
        Student currentStudent2 = new Student(930364474, "Stacy", "Rick", "srick@unca.edu");
        
        System.out.printf("Student1: %s \n", currentStudent);
        System.out.printf("Student2: %s \n", currentStudent2);
    }
}
