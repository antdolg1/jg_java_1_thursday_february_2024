package students.nikola_korovacka.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

/*java.util.List может хранить только объекты, а не примитивные типы данных.
примитивные типы, такие как int, char, boolean и другие, не считаются объектами.
Однако Java предоставляет классы-обёртки, такие как Integer, Character, Boolean,
которые позволяют помещать примитивные типы в List*/
public class Task_2 {
    public static void main(String[] args) {
        //List, который хранит объекты типа String
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        System.out.println("String List: " + stringList);
        //List, который хранит объекты типа Integer
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println("Integer List: " + integerList);

        //List, который хранит объекты типа Boolean
        List<Boolean> booleanList = new ArrayList<>();
        booleanList.add(true);
        booleanList.add(false);
        System.out.println("Boolean List: " + booleanList);
    }
}

