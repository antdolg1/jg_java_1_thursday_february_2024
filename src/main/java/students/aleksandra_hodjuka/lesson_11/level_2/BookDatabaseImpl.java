package students.aleksandra_hodjuka.lesson_11.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


class BookDatabaseImpl implements BookDatabase {

    private List<Book> books;
    private Long nextBookId;

    public BookDatabaseImpl() {
        this.books = new ArrayList<>();
        this.nextBookId = 1L; // Инициализируем следующий id как 1
    }

    @Override
    public Long save(Book book) {
        // Присваиваем книге id и увеличиваем nextId для следующей книги
        book.setId(nextBookId);
        nextBookId++;
        // Добавляем книгу в список
        books.add(book);
        // Возвращаем присвоенный id
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getId().equals(bookId)) {
                books.remove(i);
                return true; // Книга удалена
            }
        }
        return false; // Книга с указанным id не найдена
    }

    @Override
    public boolean delete(Book book) {
        for (int i = 0; i < books.size(); i++) {
            Book bookToDelete = books.get(i);
            if (bookToDelete.equals(book)) {
                books.remove(i);
                return true; // Книга удалена
            }
        }
        return false; // Книга не найдена
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
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        {
            List<Book> booksToRemove = new ArrayList<>();
            for (Book book : books) {
                if (book.getAuthor().equals(author)) {
                    booksToRemove.add(book);
                }
            }
            books.removeAll(booksToRemove);
        }

    }

    @Override
    public void deleteByTitle(String title) {
        {
            List<Book> booksToRemove = new ArrayList<>();
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    booksToRemove.add(book);
                }
            }
            books.removeAll(booksToRemove);
        }

    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }
}
