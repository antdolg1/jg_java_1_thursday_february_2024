package students.nikola_korovacka.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

public class BookListContainsDemo {
    public static void main(String[] args) {
        //список книг
        List<Book> books = new ArrayList<>();
        //объекты книг
        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");
        //Добавляю книги в список
        books.add(book1);
        books.add(book2);
        //Проверяю, есть ли книга в списке
        Book bookInTheList = new Book("A1", "B1");
        boolean containsBook = books.contains(bookInTheList); // должно быть true
        System.out.println("Книга есть в списке? " + containsBook);
        //Проверяю, нет ли книги в списке
        Book bookNotInTheList = new Book("A3", "B3");
        boolean notContainsBook = books.contains(bookNotInTheList); // должно быть false
        System.out.println("Книги нет в списке? " + notContainsBook);
    }
}
