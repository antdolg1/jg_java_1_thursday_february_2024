package students.karina_cmile.lesson_11.level_1_intern;

import java.util.ArrayList;
import java.util.List;

public class BookListContainsDemo {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Book book1 = new Book("Gabriel García Marquez", "One Hundred Years of Solitude");
        Book book2 = new Book("Charlotte Bronte", "Jane Eyre");

        books.add(book1);
        books.add(book2);

        Book bookInTheList = new Book("Gabriel García Marquez", "One Hundred Years of Solitude");
        boolean containsBook = books.contains(bookInTheList); // должно быть true
        System.out.println(containsBook);

        Book bookNotInTheList = new Book("Jack London", "The Call of the Wild");
        boolean notContainsBook = books.contains(bookNotInTheList); // должно быть false
        System.out.println(notContainsBook);
    }

}
