package students.nikola_korovacka.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    // Переопределяю метод equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        if (!title.equals(book.title)) return false;
        return author.equals(book.author);
    }
    //Переопределяю метод hashCode
    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }

    public static class IntegerListDemo {
        public static void main(String[] args) {
            //Создаю список целых чисел
            List<Integer> integerList = new ArrayList<>();
            //Добавляю элементы в конец списка
            integerList.add(10);
            integerList.add(20);
            System.out.println("добавления элементов в конец: " + integerList);
            // Добавляю элемент в начало списка
            integerList.add(0, 5);
            System.out.println("добавления элемента в начало: " + integerList);
            // Узнаю длину списка
            int size = integerList.size();
            System.out.println("Длина списка: " + size);

            //Удаляю элемент из списка по индексу
            integerList.remove(1); //Удаляю элемент с индексом 1
            System.out.println("удаления элемента по индексу: " + integerList);

            //Удаляю элемент из списка по значению
            integerList.remove(Integer.valueOf(20)); // Удаляю элемент со значением 20
            System.out.println("удаления элемента по значению: " + integerList);

            // Проверяем, пустой ли список
            boolean isEmpty = integerList.isEmpty();
            System.out.println("Список пустой? " + isEmpty);
            //Обхожу список и выводим на консоль каждый элемент
            System.out.println("Элементы списка:");
            for (Integer number : integerList) {
                System.out.println(number);
            }
        }
    }
}


