package students.karina_cmile.lesson_11.level_1_intern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {

        // Integer ArrayList creation
        List<Integer> groupNumber = new ArrayList<>();
        groupNumber.add(34);
        groupNumber.add(25);
        groupNumber.add(56);
        groupNumber.add(65);
        groupNumber.add(89);
        groupNumber.add(2, 3);
        System.out.println(groupNumber);

        // String ArrayList creation
        List<String> family = new ArrayList<>();
        family.add("Mother");
        family.add("Father");
        family.add("Son");
        family.add("Daughter");
        family.add(4, "Pet");
        System.out.println(family);

        // Integer LinkedList creation
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(9);
        numbers.add(5);
        numbers.add(1,54);
        System.out.println(numbers);

        // String LinkedList creation
        List<String> subjects = new LinkedList<>();
        subjects.add("Math");
        subjects.add("Sport");
        subjects.add("English");
        subjects.add("Programming");
        subjects.add(1,"Music");
        System.out.println(subjects);
    }
}
