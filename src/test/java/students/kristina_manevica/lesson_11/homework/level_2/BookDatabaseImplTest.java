package students.kristina_manevica.lesson_11.homework.level_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

class BookDatabaseImplTest {

    private static BookDatabaseImpl bookDatabaseImpl;
    private Book bookOne;
    private Book bookTwo;

    @BeforeEach
    void setUp() {
        bookDatabaseImpl = new BookDatabaseImpl();

        bookOne = new Book("K.Manevica", "I love QA");
        bookTwo = new Book("I.Ivarton", "It works locally");
    }

    @Test
    void testSaveBookInList() {
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
    void testDeleteBookFromList_ById() {

        bookDatabaseImpl.save(bookOne);
        bookDatabaseImpl.save(bookTwo);

        List<Book> books = bookDatabaseImpl.getBooks();

        boolean bookOneIsDeleted = bookDatabaseImpl.delete(1L);

        //проверка что действительно удалилась первая
        boolean bookOneExists = false;
        for (Book book : books) {
            if (book.getId().equals(1L)) {
                bookOneExists = true;
                break;
            }
        }

        assertFalse(bookOneExists, "First book is not deleted!");

        //проверка что вторая не удалилась
        boolean bookTwoExists = false;
        for (Book book : books) {
            if (book.getId().equals(2L)) {
                bookTwoExists = true;
                break;
            }
        }
        Assertions.assertTrue(bookTwoExists, "Second book should not be deleted!");

        //другие решения, сохраню здесь
        /*assertNull(bookDatabaseImpl.searchBookById(Long.valueOf(1L)), "First book is not deleted!");
        assertNotNull("Second book should not be deleted!", bookDatabaseImpl.searchBookById(Long.valueOf(2L)));*/
    }
}