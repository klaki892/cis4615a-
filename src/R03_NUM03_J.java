import java.io.*;
import java.nio.ByteBuffer;

/******************************************************************************
 *  Compilation:  javac R03_NUM03_J.java
 *  Execution:    java R03_NUM03_J
 *
 *  calls method which may interpret an unsigned value as a signed value incorrectly
 *
 ******************************************************************************/
public class R03_NUM03_J {

    public static void main(String[] args) throws IOException {

        ByteBuffer b = ByteBuffer.allocate(32);
        b.putInt(Integer.MIN_VALUE);//unsigned this is the max signed value + 1, signed is negative value
        //remember max signed val in java is 2147483647


        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(b.array()));
        System.out.println(Integer.MAX_VALUE + "(unsigned) + " + 1 + "(unsigned) = " + getInteger(dis) + "(unsigned)");
    }

    /*
     * Rule 03. NUmeric Types and Operations(NUM)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/NUM03-J.+Use+integer+types+that+can+fully+represent+the+possible+range+of++unsigned+data
     *
     * Rule 03-NUM03
     */

    public static long getInteger(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
    }
}