package students.nikola_korovacka.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) {
        //список целых чисел
        List<Integer> integerList = new ArrayList<>();
        //Добавляю элементы в список, включая дубликаты
        integerList.add(10);
        integerList.add(20);
        integerList.add(10); //дубликат
        integerList.add(30);
        integerList.add(20); //дубликат
        System.out.println("Список с дубликатами: " + integerList);
        //Проверяю наличие дубликатов
        boolean hasDuplicates = false;
        for (int i = 0; i < integerList.size(); i++) {
            for (int j = i + 1; j < integerList.size(); j++) {
                if (integerList.get(i).equals(integerList.get(j))) {
                    hasDuplicates = true;
                    break;
                }
            }
            if (hasDuplicates) {
                break;
            }
        }
        System.out.println("Список содержит дубликаты? " + hasDuplicates);
    }
}

