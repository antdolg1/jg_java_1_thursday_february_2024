package students.aleksandra_hodjuka.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book("Daniel Keyes", "Flowers for Algernon");
        Book book2 = new Book("Anthony Doerr", "Shell Collector");

        books.add(book1);
        books.add(book2);

        Book bookInTheList = new Book("Daniel Keyes", "Flowers for Algernon");
        boolean containsBook = books.contains(bookInTheList);
        System.out.println("The book is in the list: " + containsBook); // должно быть true

        Book bookNotInTheList = new Book("Somerset Maugham", "Of Human Bondage");
        boolean notContainsBook = books.contains(bookNotInTheList);
        System.out.println("The book is not in the list: " + notContainsBook); // должно быть false
    }

}
