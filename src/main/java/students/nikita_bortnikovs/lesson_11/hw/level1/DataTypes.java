package students.nikita_bortnikovs.lesson_11.hw.level1;

import java.util.ArrayList;
import java.util.List;

public class DataTypes {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

        List<Double> doubleList = new ArrayList<>();

        doubleList.add(3.15);
        doubleList.add(6.15);
        doubleList.add(10.15);


        List<Boolean> booleanList = new ArrayList<>();

        booleanList.add(true);
        booleanList.add(false);
        booleanList.add(true);

        List<String> stringList = new ArrayList<>();

        stringList.add("hi");
        stringList.add("hello");
        stringList.add("goodbye");

        System.out.println("Integer List: " + integerList);
        System.out.println("Double List: " + doubleList);
        System.out.println("Boolean List: " + booleanList);
        System.out.println("String List: " + stringList);
    }
}
