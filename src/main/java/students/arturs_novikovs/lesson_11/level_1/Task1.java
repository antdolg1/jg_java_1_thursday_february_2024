package students.arturs_novikovs.lesson_11.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
public class Task1 {
    public static final Logger logger = Logger.getLogger(Task1.class.getName());

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(2);

        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        numbers.set(0, -2);

        logger.info("Numbers: " + numbers);

        List<String> names = new LinkedList<>();

        names.add("One");
        names.add("Two");
        names.add("Three");
        names.set(0, "Zero");

        logger.info("Names: " + names);
    }
}
