import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/******************************************************************************
 *  Compilation:  javac R07_ERR00_J.java
 *  Execution:    java R07_ERR00_J
 *
 * loss of checked information because of generalizing the exception
 *
 ******************************************************************************/
public class R07_ERR00_J {

    public static void main(String[] args) {

        String filename = "arandomfile";
        System.out.println("reading first line of " + filename+ ":");
        boolean success = true;
        try {
            Scanner s = new Scanner(new File(filename));

            System.out.println("Next line: " + s.nextLine());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        if (success)
            System.out.println("Successfully read file!" );
    }

}
