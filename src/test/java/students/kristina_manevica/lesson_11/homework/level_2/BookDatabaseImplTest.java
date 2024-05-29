package students.kristina_manevica.lesson_11.homework.level_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BookDatabaseImplTest {

    private static BookDatabaseImpl bookDatabaseImpl;
    private Book bookOne;
    private Book bookTwo;
    private Book bookThree;

    @BeforeEach
    void setUp() {
        bookDatabaseImpl = new BookDatabaseImpl();

        bookOne = new Book("K.Manevica", "I love QA");
        bookTwo = new Book("I.Ivarton", "It works locally");
        bookThree = new Book("K.Manevica", "It is bug, not a feature");
    }

    @Test
    void testSaveBook() {
        Long bookOneId = bookDatabaseImpl.save(bookOne);
        Long bookTwoId = bookDatabaseImpl.save(bookTwo);

        List<Long> bookIds = new ArrayList<>();
        bookIds.add(bookOneId);
        bookIds.add(bookTwoId);

        //попробовала что бы не каждый отдельно проверять на null, не дублировать
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

        //проверка что действительно удалилась первая
        boolean bookOneExists = false;
        for (Book book : books) {
            if (book.getId().equals(1L)) {
                bookOneExists = true;
                break;
            }
        }
        Assertions.assertFalse(bookOneExists, "First book is not deleted!");

        //проверка что вторая не удалилась
        boolean bookTwoExists = false;
        for (Book book : books) {
            if (book.getId().equals(2L)) {
                bookTwoExists = true;
                break;
            }
        }
        assertTrue(bookTwoExists, "Second book should not be deleted!");

        //другие решения, сохраню здесь
        /*assertNull(bookDatabaseImpl.searchBookById(Long.valueOf(1L)), "First book is not deleted!");
        assertNotNull("Second book should not be deleted!", bookDatabaseImpl.searchBookById(Long.valueOf(2L)));*/
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
    void findByAuthor() {
        bookDatabaseImpl.save(bookOne);
        bookDatabaseImpl.save(bookTwo);
        bookDatabaseImpl.save(bookThree);

        List<Book> booksAuthorFound = bookDatabaseImpl.findByAuthor("K.Manevica");
        List<Book> booksNotExistentAuthor = bookDatabaseImpl.findByAuthor("K.Tolkien");

        Assertions.assertEquals(2, booksAuthorFound.size(), "Should be found 2 books by author: "
                + bookOne.getAuthor());
        Assertions.assertEquals(0, booksNotExistentAuthor.size(), "Should not be found any book by");

        for (Book book : booksAuthorFound) {
            Assertions.assertEquals("K.Manevica", book.getAuthor(), "Book with such author should exist!");
        }

        for (Book book : booksNotExistentAuthor) {
            Assertions.assertTrue(booksNotExistentAuthor.isEmpty(), "Found book with non-existing author!");
        }
    }


}