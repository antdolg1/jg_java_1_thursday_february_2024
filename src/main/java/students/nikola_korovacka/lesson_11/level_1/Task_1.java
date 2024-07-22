package students.nikola_korovacka.lesson_11.level_1;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Task_1 {
    public static void main(String[] args) {
        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Frog");
        System.out.println("LinkedList: " + linkedList);

        // Vector
        List<String> vector = new Vector<>();
        vector.add("Giraffe");
        vector.add("Hippo");
        vector.add("Iguana");
        System.out.println("Vector: " + vector);

        // CopyOnWriteArrayList
        List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("Jaguar");
        copyOnWriteArrayList.add("Kangaroo");
        copyOnWriteArrayList.add("Lemur");
        System.out.println("CopyOnWriteArrayList: " + copyOnWriteArrayList);
    }
}
//ArrayList: очень быстрый доступ к элементам по индексу, но не может вставлять или удалять элементы из середины
//LinkedList: быстро вставляет и удаляет элементы, но не может получить доступ к элементам по индексу.
/*Вектор: похож на ArrayList, но синхронизируется, что означает, что он подходит для многопоточной среды, но в целом медленнее.
Используется редко, поскольку медленнее, чем ArrayList, из-за синхронизации.*/
//CopyOnWriteArrayList: Подходит, когда имеется много операций чтения и мало операций записи.