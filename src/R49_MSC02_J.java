import java.util.Random;

/******************************************************************************
 *  Compilation:  javac R49_MSC02_J.java
 *  Execution:    java R49_MSC02_J
 *
 * Produces a set of random numbers which will be used for sensitive access later
 *
 ******************************************************************************/

public class R49_MSC02_J {

    public static void main(String[] args){

        System.out.println("Your super secret numeric passcode: ");

        Random number = new Random(123L);
//...
        for (int i = 0; i < 20; i++) {
            // Generate another random integer in the range [0, 20]
            int n = number.nextInt(21);
            System.out.print(n  + " ");
        }

        System.out.println("\nRun again to generate the next passcode");


    }
}
