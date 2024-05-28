package students.aleksandra_hodjuka.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

class Task_2 {

    //java.util.List может хранить только ссылки на объекты, а не примитивные типы данных напрямую.
    // Примитивные типы могут быть использованы в  List через Integer, Double, Boolean и т.д.
    public static void main(String[] args) {
        // Создание ArrayList для хранения Integer
        List<Integer> integerList = new ArrayList<>();

        // Добавление примитивных типов данных в List
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

        // Вывод элементов списка
        System.out.println("Список integerList:");
        for (Integer num : integerList) {
            System.out.println(num);
        }

        // Создание ArrayList для хранения String
        List<String> stringList = new ArrayList<>();

        // Добавление строк в List
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");

        // Вывод элементов списка
        System.out.println("Список stringList:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }

}