
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends StudentExample
{
    //====== Instance Variables =======//
    public long id;
    public String fName;
    public String lName;
    public String email;
    
    
    
    //methods//
    
    Student (long initId, String initFirst, String initLast, String initEmail) {
        id = initId;
        fName = initFirst;
        lName = initLast;
        email = initEmail;
        
    }
    
    public void setFirstName(String newFirstName) {
        fName = newFirstName;
    }
    
    public void setLastName(String newLastName) {
        lName = newLastName;
    }
    
    public String toString() {
        return fName + " " + lName + "\n" + email + "\n";
    }

}
