package students.aleksandra_hodjuka.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

 class IntegerListDemo {
    public static void main(String[] args) {
        // Создание списка целых чисел
        List<Integer> integerList = new ArrayList<>();

        // Добавление элементов в начало и конец списка
        integerList.add(1); // Добавляем элемент в конец списка
        integerList.add(0, 5); // Добавляем элемент в начало списка
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        // Вывод списка
        System.out.println("The list after adding elements: " + integerList);

        // Узнать длину списка
        System.out.println("List length: " + integerList.size());

        // Удаление элемента из списка по индексу
        integerList.remove(1); // Удаляем элемент по индексу 1
        System.out.println("The list after removing element by index: " + integerList);

        // Удаление элемента из списка без указания индекса
        integerList.remove(Integer.valueOf(5)); // Удаляем элемент со значением 5
        System.out.println("The list after removing element without using it's index: " + integerList);

        // Проверка, является ли список пустым
        System.out.println("Is the list empty? " + integerList.isEmpty());


        // Обход списка и вывод каждого элемента на консоль
        System.out.println("The elements of the list:");
        for (Integer num : integerList) {
            System.out.println(num);
        }
    }

}
