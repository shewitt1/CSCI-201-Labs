
/**
 * Write a description of class ComputePi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ComputePi
{
    public static void main(String[] args) {
        double denom = 1;
        double sign = 1;
        double pi = 0;
        double inc = 1;
        
        while (inc > 0.0000001) {
            pi += sign * inc;
            denom += 2;
            sign *= -1;
            inc = 1.0/denom;
        }
        pi = 4.0 * pi;
        System.out.println(pi);
        
    }
}
