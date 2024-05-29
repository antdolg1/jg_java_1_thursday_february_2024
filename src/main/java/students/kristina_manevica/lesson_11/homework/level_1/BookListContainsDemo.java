package students.kristina_manevica.lesson_11.homework.level_1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class BookListContainsDemo {

    public static final Logger logger = Logger.getLogger(BookListContainsDemo.class.getName());

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Book bookOne = new Book("J.R.R. Tolkien", "A Middle English Vocabulary");
        books.add(bookOne);

        Book booksInList = new Book("J.R.R. Tolkien", "A Middle English Vocabulary");
        Book booksNotInList = new Book("K.Manevica", "I Love QAs");

        boolean containsBook = books.contains(booksInList);
        logger.info("BookOne in the list: " + containsBook);

        boolean notContainsBook = books.contains(booksNotInList);
        logger.info("BookTwo in the list: " + notContainsBook);
    }
}