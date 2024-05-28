package teacher.lesson_11.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class ListCheckApp {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        //добавление элементов
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add(null);
        System.out.println(fruits);

    }
}
