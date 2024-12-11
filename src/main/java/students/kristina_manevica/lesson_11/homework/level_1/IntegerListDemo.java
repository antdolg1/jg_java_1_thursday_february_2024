package students.kristina_manevica.lesson_11.homework.level_1;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(i);
            System.out.println(i);
        }

        System.out.println(numbers.size());

        numbers.remove(0);
        numbers.remove(Integer.valueOf(2));

        boolean isEmpty = numbers.isEmpty();
        System.out.println(isEmpty);
    }
}