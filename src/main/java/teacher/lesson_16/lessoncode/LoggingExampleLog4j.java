package teacher.lesson_16.lessoncode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingExampleLog4j {
    public static final Logger logger = LogManager.getLogger(LoggingExampleLog4j.class);

    public static void main(String[] args) {
        logger.info("This is information message");

        int value = 22;
        logger.info("Value is: " + value);

        try {
            //simulate exception
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("An error occured");
        }
    }
}
