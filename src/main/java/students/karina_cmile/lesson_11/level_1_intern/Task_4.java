package students.karina_cmile.lesson_11.level_1_intern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) {

        // ArrayList duplicates
        List<String> groupMembers = new ArrayList<>();
        groupMembers.add("Alena");
        groupMembers.add("Marina");
        groupMembers.add("Anna");
        groupMembers.add("Maris");
        groupMembers.add("Anna");
        groupMembers.add("Marina");
        System.out.println(groupMembers);

        // Integer ArrayList duplicates
        LinkedList<Integer> numbers1 = new LinkedList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(4);
        System.out.println(numbers1);

        // LinkedList duplicates
        List<String> teamMembers = new ArrayList<>();
        teamMembers.add("Vova");
        teamMembers.add("Vova");
        teamMembers.add("Sasha");
        teamMembers.add("Vova");
        teamMembers.add("Sasha");
        System.out.println(teamMembers);


        // Integer LinkedList duplicates
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        System.out.println(numbers);

    }
}
