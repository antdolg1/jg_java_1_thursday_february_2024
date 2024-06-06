package students.arturs_novikovs.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;
public class Task4 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(42);
        }

        System.out.println("List elements: " + numbers);
    }
}
