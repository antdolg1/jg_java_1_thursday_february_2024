package teacher.lesson_11.lessoncode;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        //добавление элементов
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Kiwi");
        System.out.println(fruits);

        Set<String> uniqueFruits = new LinkedHashSet<>(fruits);
        System.out.println(uniqueFruits);

        //вставка элемента на конкретную позицию
        fruits.add(1, "Blueberry");

        String fruit = fruits.get(2); //получим элемент на третьей позиции "Banana"
        System.out.println("Fruit at index 2: " + fruit);


        System.out.println("Fruit at index 0: " + fruits.get(0));
        //замена элемента на определённой позиции
        fruits.set(0, "Orange");
        System.out.println("Fruit at index 0: " + fruits.get(0));

        //удаление элемента
        fruits.remove(0);
        System.out.println("Fruit at index 0: " + fruits.get(0));
        fruits.remove("Blueberry"); //удалит первое вхождение "Blueberry"
        System.out.println("Fruit at index 0: " + fruits.get(0));

        //размер списка
        int fruitsSize = fruits.size();
        System.out.println("Total fruits: " + fruitsSize);

        boolean hasApple = fruits.contains("Apple");
        System.out.println("Fruits list contains Apple? " + hasApple);

        boolean hasBanana = fruits.contains("Banana");
        System.out.println("Fruits list contains Banana? " + hasBanana);
        System.out.println("________");

        //проход по элементам списка
        for (String f : fruits) {
            System.out.println(f);
        }

        //очистка списка
        fruits.clear();

        //проверка пустой ли список
        boolean isEmpty = fruits.isEmpty();

        System.out.println("Fruits list is empty? " + isEmpty);
        System.out.println("Size: " + fruits.size());
    }
}
