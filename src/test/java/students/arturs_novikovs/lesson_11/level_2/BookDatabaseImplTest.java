package students.arturs_novikovs.lesson_11.level_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BookDatabaseImplTest {

    private static BookDatabaseImpl bookDatabaseImpl;
    private Book bookOne;
    private Book bookTwo;
    private Book bookThree;

    @BeforeEach
    void setUp() {
        bookDatabaseImpl = new BookDatabaseImpl();

        bookOne = new Book("My mom", "Flowers for Algernon");
        bookTwo = new Book("I.Ivarton", "It works locally");
        bookThree = new Book("My mom", "Put on your hat!");
    }

    @Test
    void testSaveBook() {
        Long bookOneId = bookDatabaseImpl.save(bookOne);
        Long bookTwoId = bookDatabaseImpl.save(bookTwo);

        List<Long> bookIds = new ArrayList<>();
        bookIds.add(bookOneId);
        bookIds.add(bookTwoId);

        for (Long id : bookIds) {
            Assertions.assertNotNull(id, "ID should not be zero");
        }

        Assertions.assertEquals(Long.valueOf(1), bookOneId);
        Assertions.assertEquals(Long.valueOf(2), bookTwoId);
    }

    @Test
    void testDeleteBook_ById() {

        bookDatabaseImpl.save(bookOne);
        bookDatabaseImpl.save(bookTwo);

        List<Book> books = bookDatabaseImpl.getBooks();

        bookDatabaseImpl.delete(1L);

        //проверка что действительно удалилась первая книга
        boolean bookOneExists = false;
        for (Book book : books) {
            if (book.getId().equals(1L)) {
                bookOneExists = true;
                break;
            }
        }
        Assertions.assertFalse(bookOneExists, "First book is not deleted!");

        //проверка что вторая книга не удалилась
        boolean bookTwoExists = false;
        for (Book book : books) {
            if (book.getId().equals(2L)) {
                bookTwoExists = true;
                break;
            }
        }
        assertTrue(bookTwoExists, "Second book should not be deleted!");

    }

    @Test
    void testDeleteBook_ByBook() {
        bookDatabaseImpl.save(bookOne);
        bookDatabaseImpl.save(bookTwo);

        List<Book> books = bookDatabaseImpl.getBooks();

        bookDatabaseImpl.delete(bookOne);

        boolean bookOneExists = false;
        for (Book book : books) {
            if (book.equals(bookOne)) {
                bookOneExists = true;
                break;
            }
        }
        Assertions.assertFalse(bookOneExists, "First book is not deleted!");

        boolean bookTwoExists = false;
        for (Book book : books) {
            if (book.equals(bookTwo)) {
                bookTwoExists = true;
                break;
            }
        }
        Assertions.assertTrue(bookTwoExists, "Second book should not be deleted!");
    }

    @Test
    void testFindBook_ById() {
        Long bookOneId = bookDatabaseImpl.save(bookOne);
        Long bookTwoId = bookDatabaseImpl.save(bookTwo);

        Optional<Book> foundBookOne = bookDatabaseImpl.findById(bookOneId);
        Optional<Book> foundBookTwo = bookDatabaseImpl.findById(bookTwoId);
        Optional<Book> notFoundBook = bookDatabaseImpl.findById(3L);

        Assertions.assertTrue(foundBookOne.isPresent(), "Book One is not found!");
        Assertions.assertTrue(foundBookTwo.isPresent(), "Book Two is not found!");

        Assertions.assertEquals(bookOne, foundBookOne.get(), "Book One doesn't match!");
        Assertions.assertEquals(bookTwo, foundBookTwo.get(), "Book Two doesn't match!");

        Assertions.assertFalse(notFoundBook.isPresent(), "Book doesn't exist, should not be found!");
    }

    @Test
    void testFindBook_ByAuthor() {
        bookDatabaseImpl.save(bookOne);
        bookDatabaseImpl.save(bookTwo);
        bookDatabaseImpl.save(bookThree);

        List<Book> booksAuthorFound = bookDatabaseImpl.findByAuthor("My mom");
        List<Book> booksNotExistentAuthor = bookDatabaseImpl.findByAuthor("K.Tolkien");

        Assertions.assertEquals(2, booksAuthorFound.size(), "Should be found 2 books by author: "
                + bookOne.getAuthor());
        Assertions.assertEquals(0, booksNotExistentAuthor.size(), "Should not be found any book");

        for (Book book : booksAuthorFound) {
            Assertions.assertEquals("My mom", book.getAuthor(), "Book with such author should exist!");
        }

        for (Book book : booksNotExistentAuthor) {
            Assertions.assertTrue(booksNotExistentAuthor.isEmpty(), "Found book with non-existing author!");
        }
    }

    @Test
    void testFindBook_ByTitle() {
        bookDatabaseImpl.save(bookOne);
        bookDatabaseImpl.save(bookTwo);

        List<Book> booksTitleFound = bookDatabaseImpl.findByTitle("Flowers for Algernon");
        List<Book> booksNotExistentTitle = bookDatabaseImpl.findByTitle("PR without US");

        Assertions.assertEquals(1, booksTitleFound.size(), "Should be found 1 book by title: "
                + bookOne.getTitle());
        Assertions.assertEquals(0, booksNotExistentTitle.size(), "Should not be found any book by such " +
                "title");

        for (Book book : booksTitleFound) {
            Assertions.assertEquals("Flowers for Algernon", book.getTitle(), "Book with such title should exist!");
        }

        for (Book book : booksNotExistentTitle) {
            Assertions.assertTrue(booksNotExistentTitle.isEmpty(), "Found book with non-existing title!");
        }
    }

    @Test
    void testCountAllBooks() {
        bookDatabaseImpl.save(bookOne);
        bookDatabaseImpl.save(bookTwo);
        bookDatabaseImpl.save(bookThree);

        int totalBooksCount = bookDatabaseImpl.countAllBooks();
        Assertions.assertEquals(3, totalBooksCount, "Total number of books don't match, should be 3!");
    }

    @Test
    void testDeleteBook_ByAuthor() {
        bookDatabaseImpl.save(bookOne);
        bookDatabaseImpl.save(bookTwo);

        bookDatabaseImpl.deleteByAuthor("My mom");

        List<Book> booksAuthorFound = bookDatabaseImpl.findByAuthor("My mom");
        Assertions.assertTrue(booksAuthorFound.isEmpty(), "Books by author My mom is found! Should be deleted!");

        List<Book> booksOtherAuthor = bookDatabaseImpl.findByAuthor("I.Ivarton");
        Assertions.assertFalse(booksOtherAuthor.isEmpty(), "Books by author I.Ivarton is deleted! Should not!");

        int totalBooksCount = bookDatabaseImpl.countAllBooks();
        Assertions.assertEquals(1, totalBooksCount, "Total number of books should be 1 after deletion!");
    }

    @Test
    void testDeleteBook_ByTitle() {
        bookDatabaseImpl.save(bookOne);
        bookDatabaseImpl.save(bookTwo);

        bookDatabaseImpl.deleteByTitle("It works locally");

        List<Book> booksTitleFound = bookDatabaseImpl.findByTitle("It works locally");
        Assertions.assertTrue(booksTitleFound.isEmpty(), "Books by title is found! Should be deleted!");

        List<Book> booksOtherTitle = bookDatabaseImpl.findByTitle("Flowers for Algernon");
        Assertions.assertFalse(booksOtherTitle.isEmpty(), "Books by title is deleted! Should not!");

        int totalBooksCount = bookDatabaseImpl.countAllBooks();
        Assertions.assertEquals(1, totalBooksCount, "Total number of books should be 1 after deletion!");
    }
}