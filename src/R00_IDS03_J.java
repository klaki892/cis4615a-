import java.util.logging.Logger;

/******************************************************************************
 *  Compilation:  javac R00_IDS03_J.java
 *  Execution:    java R00_IDS03_J
 *
 *  calls the logger passing an value that needs to be sanitized
 *
 ******************************************************************************/
public class R00_IDS03_J {

    private static final Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());

    public static void main(String[] args){

        boolean loginSuccessful = true;
        String username = "guest\n" +
                "May 15, 2011 2:25:52 PM java.util.logging.LogManager$RootLogger log\n" +
                "SEVERE: User login succeeded for: administrator\n";


        //test login for sanization
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }

    }

}
