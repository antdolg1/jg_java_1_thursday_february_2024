package teacher.lesson_16;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExample {
    private static final Logger logger = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {

        logger.info("This is information message");
        logger.warning("This is a warning message");

        int value = 22;
        logger.info("Value is: " + value);

        try {
            //simulate exception
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "An error occured");
        }

    }

}

//third-party logging frameworks
//Log4j
//Logback
//SLF4J
//Log4j 2
//Tinylog
