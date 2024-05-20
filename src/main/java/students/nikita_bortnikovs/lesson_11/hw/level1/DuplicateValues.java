package students.nikita_bortnikovs.lesson_11.hw.level1;

import java.util.ArrayList;
import java.util.List;

public class DuplicateValues {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(10);
        integerList.add(10);

        List<Double> doubleList = new ArrayList<>();

        doubleList.add(3.15);
        doubleList.add(3.15);
        doubleList.add(3.15);


        List<Boolean> booleanList = new ArrayList<>();

        booleanList.add(true);
        booleanList.add(true);
        booleanList.add(true);

        List<String> stringList = new ArrayList<>();

        stringList.add("hi");
        stringList.add("hi");
        stringList.add("hi");


        System.out.println("Integer List: " + integerList);
        System.out.println("Double List: " + doubleList);
        System.out.println("Boolean List: " + booleanList);
        System.out.println("String List: " + stringList);
    }
}
