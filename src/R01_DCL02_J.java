import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(new Integer[] {13, 14, 15}));
        ArrayList<Integer> list2  = new ArrayList<>();

        boolean first = true;

        System.out.println("Processing list...");
        for (Integer i: list) {
            if (first) {
                first = false;
                i = new Integer(99);
            }
            System.out.println(" New item: " + i);
            // Process i
            System.out.println("  index of item: " + list.indexOf(i));
        }

        System.out.println("Modified list?");
        for (Integer i: list) {
            System.out.println("List item: " + i);
        }

    }

}
