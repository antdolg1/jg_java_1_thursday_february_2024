package students.nikita_bortnikovs.lesson_11.hw.level1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaLists {

        public static void main(String[] args) {

            List<String> arrayList = new ArrayList<>();
            arrayList.add("milk");
            arrayList.add("coffee");
            arrayList.add("tea");
            arrayList.add("cookies");



            List<String> linkedList = new LinkedList<>();
            linkedList.add("ham");
            linkedList.add("jam");
            linkedList.add("cucumber");
            linkedList.add("salad");

            System.out.println("Array list demo: " + arrayList);
            System.out.println("Linked list demo: " + linkedList);

        }
    }


