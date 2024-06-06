package students.arturs_novikovs.lesson_11.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        System.out.println("List Integer elements:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        List<String> names = new LinkedList<>();
        names.add("One");
        names.add("Two");
        names.add("Three");
        names.set(0, "Zero");

        System.out.println("List String elements:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
