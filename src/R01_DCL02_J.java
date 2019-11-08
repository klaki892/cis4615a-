import java.util.Arrays;
import java.util.List;

/******************************************************************************
 *  Compilation:  javac R01_DCL02_J.java
 *  Execution:    java R01_DCL02_J
 *
 * attempts to modify a list of elements during an enhanced for loop to have a new 1st value in the list.
 *
 ******************************************************************************/
public class R01_DCL02_J {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[] {13, 14, 15});
        boolean first = true;

        /*
         * Rule 01. Declarations and Initializations (DCL)
         * Corrected code per:
         * https://wiki.sei.cmu.edu/confluence/display/java/DCL02-J.+Do+not+modify+the+collection%27s+elements+during+an+enhanced+for+statement
         *
         * Rule 01-DCL02
         */

        //NOTE: BECAUSE THIS IS A CODE CLARITY/STYLE CHANGE, THERE IS NO VISIBLE DIFFERENCE IN THE EXAMPLE
        System.out.println("Processing list...");
        for (final Integer i: list) {
            Integer item = i;
            if (first) {
                first = false;
                item = new Integer(99);
            }
            System.out.println(" New item: " + item);
            // Process item
            System.out.println("  index of item: " + list.indexOf(item));
        }

        System.out.println("Modified list?");
        for (Integer i: list) {
            System.out.println("List item: " + i);
        }

    }

}
