import java.util.Arrays;

/******************************************************************************
 *  Compilation:  javac R13_FIO09_J.java
 *  Execution:    java R13_FIO09_J
 *
 * uses the write method to print out integers in the range of 0 - 255
 *
 ******************************************************************************/

public class R13_FIO09_J {

    public static void main(String[] args) {

        System.out.println("Testing System.out.write() on the following values:");
        int[] arr  = {72,69,76, 76, 79, 500};
        System.out.println(Arrays.toString(arr));

        /*
         * Rule 13. Input Output(FIO)
         * Corrected code per:
         * https://wiki.sei.cmu.edu/confluence/display/java/FIO09-J.+Do+not+rely+on+the+write%28%29+method+to+output+integers+outside+the+range+0+to+255
         *
         * Rule 13-FIO09
         */
        for (int i : arr) {
            // Perform range checking
            int value = Integer.valueOf(i);
            if (value < 0 || value > 255) {
                throw new ArithmeticException("Value is out of range");
            }

            System.out.write(value);
            System.out.flush();
        }
    }

}
