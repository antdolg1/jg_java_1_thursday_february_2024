package students.nikita_bortnikovs.lesson_11.hw.level1;

import java.util.List;
import java.util.ArrayList;

public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        System.out.println(integerList);

        integerList.add(0, 5);
        integerList.add(4, 40);
        System.out.println(integerList);

        int size = integerList.size();
        System.out.println(size);

        integerList.remove(0);
        System.out.println(integerList);

        integerList.remove(Integer.valueOf(40));
        System.out.println(integerList);


        boolean isEmpty = integerList.isEmpty();
        System.out.println(isEmpty);

    }
}