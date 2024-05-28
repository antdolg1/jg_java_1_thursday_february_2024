package students.kristina_manevica.lesson_11.homework.level_2;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.List.*;

public class BookDatabaseImpl implements BookDatabase {

    private List<Book> books = new ArrayList<>();
    private Long bookId = 1L;

    @Override
    public Long save(Book book) {
        book.setId(bookId);
        books.add(book);
        return bookId++;
    }

    @Override
    public boolean delete(Long bookId) {
        return books.removeIf(book -> book.getId().equals(bookId));
    }

    //по-другому не понимаю как проверить что действительно удалилась книга из database
    public Book searchBookById(Long bookId) {
        return books.stream()
                .filter(book -> book.getId().equals(bookId))
                .findFirst()
                .orElse(null);
    }
}