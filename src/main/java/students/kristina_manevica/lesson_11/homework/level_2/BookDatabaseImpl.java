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
    //по другому метод delete
    /* public boolean delete(Long bookId) {
        return books.removeIf(book -> book.getId().equals(bookId));
    }*/
    public boolean delete(Long bookId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(bookId)) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).equals(book)) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    //по-другому не понимаю как проверить что действительно удалилась книга из database
    //мне надо днайти книгу из созданных книг
    public List<Book> getBooks() {
        return books;
    }



    /*public Book searchBookById(Long bookId) {
        return books.stream()
                .filter(book -> book.getId().equals(bookId))
                .findFirst()
                .orElse(null);
    }*/
}