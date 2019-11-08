import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/******************************************************************************
 *  Compilation:  javac R07_ERR00_J.java
 *  Execution:    java R07_ERR00_J
 *
 * loss of checked information because of generalizing the exception
 *
 ******************************************************************************/
public class R07_ERR00_J {

    /*
     * Rule 07. Exceptional Behavior (ERR)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/ERR00-J.+Do+not+suppress+or+ignore+checked+exceptions
     *
     *Rule 0-ERR00
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String filename = "arandomfile";
        System.out.println("reading first line of " + filename+ ":");
         boolean validFlag = false;

        do {
            try (Scanner s = new Scanner(new File(filename))) {
                // If requested file does not exist, throws FileNotFoundException
                // If requested file exists, sets validFlag to true

                System.out.println("Next line: " + s.nextLine());

                validFlag = true;
            } catch (FileNotFoundException e) {
                // Ask the user for a different file name
                System.out.println("couldnt find " + filename + ", supply a new file: ");
                filename = in.nextLine();
            }
        } while (validFlag != true);


            System.out.println("Successfully read file!" );
            in.close();
    }

}
