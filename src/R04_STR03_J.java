import java.math.BigInteger;

/******************************************************************************
 *  Compilation:  javac R04_STR03_J.java
 *  Execution:    java R04_STR03_J
 *
 * encodes noncharacter data as a string, which will change the value if handled incorrectly.
 *
 ******************************************************************************/
public class R04_STR03_J {

    /*
     * Rule 04. Characters and Strings(STR)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/STR03-J.+Do+not+encode+noncharacter+data+as+a+string
     *
     * Rule 04-STR03
     */
    public static void main(String[] args) {

        BigInteger x = new BigInteger("530500452766");
        System.out.println("original value: " + x.toString());
        String s = x.toString();  // Valid character data
        byte[] byteArray = s.getBytes();
        String ns = new String(byteArray);
        x = new BigInteger(ns);
        System.out.println("new value: " + x.toString());
    }
}
