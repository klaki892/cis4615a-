import java.io.File;

/******************************************************************************
 *  Compilation:  javac R02_XP00_J.java
 *  Execution:    java R02_XP00_J
 *
 *  calls delete file when it should do something with the return value
 *
 ******************************************************************************/
public class R02_XP00_J {
    public static void main(String[] args) {

        deleteFile();
        System.out.println("successfully finished deleteFile()");

    }

    /*
     * Rule 02. Expressions (EXP)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/EXP00-J.+Do+not+ignore+values+returned+by+methods
     *
     *Rule 02-EXP00
     */
    public static void deleteFile(){

        File someFile = new File("someFileName.txt");
        // Do something with someFile
        if (!someFile.delete()) {
            // Handle failure to delete the file
            System.err.println("Could not delete the file, please do it manually.");
        }

    }

}