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

    public static void deleteFile(){

        File someFile = new File("someFileName.txt");
        // Do something with someFile
        someFile.delete();

    }

}