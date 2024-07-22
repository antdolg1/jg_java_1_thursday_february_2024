package students.nikola_korovacka.lesson_11.level_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase {

    private List<Book> books = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public Long save(Book book) {
        book.setId(nextId);
        books.add(book);
        nextId++;
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        return books.removeIf(book -> book.getId().equals(bookId));
    }

    @Override
    public boolean delete(Book book) {
        return books.remove(book);
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
            if (book.getAuthor().equalsIgnoreCase(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> booksByTitle = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                booksByTitle.add(book);
            }
        }
        return booksByTitle;
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getAuthor().equalsIgnoreCase(author)) {
                iterator.remove();
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
            }
        }
    }
}


