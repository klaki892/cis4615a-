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

        for (int i : arr) {
            // Any input value > 255 will result in unexpected output
            System.out.write(Integer.valueOf(i));
            System.out.flush();
        }
    }

}
