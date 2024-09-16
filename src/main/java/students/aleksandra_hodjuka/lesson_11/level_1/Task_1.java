package students.aleksandra_hodjuka.lesson_11.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Task_1 {
    public static void main(String[] args) {
        // Создание ArrayList
        List<Integer> arrayList = new ArrayList<>();

        // Добавление элементов в ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long arrayListDuration = endTime - startTime;
        System.out.println("Добавление элементов в ArrayList заняло: " + arrayListDuration + " наносекунд");

        // Создание LinkedList
        List<Integer> linkedList = new LinkedList<>();

        // Добавление элементов в LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long linkedListDuration = endTime - startTime;
        System.out.println("Добавление элементов в LinkedList заняло: " + linkedListDuration + " наносекунд");

        // Доступ к элементам ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < arrayList.size(); i++) {
            int element = arrayList.get(i);
        }
        endTime = System.nanoTime();
        long arrayListAccessDuration = endTime - startTime;
        System.out.println("Доступ к элементам ArrayList занял: " + arrayListAccessDuration + " наносекунд");

        // Доступ к элементам LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < linkedList.size(); i++) {
            int element = linkedList.get(i);
        }
        endTime = System.nanoTime();
        long linkedListAccessDuration = endTime - startTime;
        System.out.println("Доступ к элементам LinkedList занял: " + linkedListAccessDuration + " наносекунд");
    }
//ArrayList - это динамический массив, который обеспечивает быстрый доступ к элементам по индексу.
// Добавление элементов в конец списка также быстро, но вставка/удаление элементов в середине списка может быть
// медленной, т.к. нужно сдвигать все остальные элементы.
//LinkedList - это двусвязный список, где каждый элемент хранит ссылку на предыдущий и следующий элемент.
// Он обеспечивает быструю вставку/удаление элементов в середине списка за счет изменения ссылок,
// но доступ к элементам по индексу медленнее, чем в ArrayList.
}
