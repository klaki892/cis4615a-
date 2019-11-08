import java.security.SecureRandom;
import java.util.Random;

/******************************************************************************
 *  Compilation:  javac R49_MSC02_J.java
 *  Execution:    java R49_MSC02_J
 *
 * Produces a set of random numbers which will be used for sensitive access later
 *
 ******************************************************************************/

public class R49_MSC02_J {

    /*
     * Rule 49. Miscellaneous(MSC)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/MSC02-J.+Generate+strong+random+numbers
     *
     *Rule 49-MSC02
     */
    public static void main(String[] args){

        System.out.println("Your super secret numeric passcode: ");

        SecureRandom number = new SecureRandom();
        // Generate 20 integers 0..20
        for (int i = 0; i < 20; i++) {
            // Generate another random integer in the range [0, 20]
            int n = number.nextInt(21);
            System.out.print(n  + " ");
        }

        System.out.println("\nRun again to generate the next passcode");


    }
}
