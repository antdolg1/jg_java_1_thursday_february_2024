package students.aleksandra_hodjuka.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

class Task_4 {
    //Да, реализации интерфейса java.util.List могут хранить одинаковые элементы.
    public static void main(String[] args) {
        // Создание списка целых чисел
        List<Integer> integerList = new ArrayList<>();

        // Добавление дубликатов в список
        integerList.add(5);
        integerList.add(10);
        integerList.add(5);
        integerList.add(15);
        integerList.add(10);

        // Вывод списка
        System.out.println("List with duplicates: " + integerList);
    }
}
