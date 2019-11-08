import java.math.BigInteger;

/******************************************************************************
 *  Compilation:  javac R04_STR03_J.java
 *  Execution:    java R04_STR03_J
 *
 * encodes noncharacter data as a string, which will change the value if handled incorrectly.
 *
 ******************************************************************************/
public class R04_STR03_J {
    public static void main(String[] args) {

        BigInteger x = new BigInteger("530500452766");
        System.out.println("original value: " + x.toString());
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray);
        byteArray = s.getBytes();
        x = new BigInteger(byteArray);
        System.out.println("new value: " + x.toString());
    }
}
