import java.util.logging.Logger;
import java.util.regex.Pattern;

/******************************************************************************
 *  Compilation:  javac R00_IDS03_J.java
 *  Execution:    java R00_IDS03_J
 *
 *  calls the logger passing an value that needs to be sanitized
 *
 ******************************************************************************/
public class R00_IDS03_J {

    private static final Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());


    /*
    * Rule 00. INput Validation and Data Sanitization (IDS)
    * Corrected code per:
    * https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input
    *
    *Rule 00-IDS03
    */
    public static void main(String[] args){

        boolean loginSuccessful = true;
        String username = "guest\n" +
                "May 15, 2011 2:25:52 PM java.util.logging.LogManager$RootLogger log\n" +
                "SEVERE: User login succeeded for: administrator\n";


        //test login for sanization
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }

    }
    public static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
    }


}
