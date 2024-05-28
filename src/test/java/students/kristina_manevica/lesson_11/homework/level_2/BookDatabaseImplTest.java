package students.kristina_manevica.lesson_11.homework.level_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

class BookDatabaseImplTest {

    private static BookDatabaseImpl bookDatabaseImpl;
    private static Logger logger;
    private Book bookOne;
    private Book bookTwo;

    @BeforeEach
    void setUp() {
        bookDatabaseImpl = new BookDatabaseImpl();
        logger = Logger.getLogger(BookDatabaseImplTest.class.getName());

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
            assertNotNull("ID should not be zero", id);
        }

        assertEquals(Long.valueOf(1), bookOneId);
        assertEquals(Long.valueOf(2), bookTwoId);

        logger.info("Book One ID: " + bookOneId);
        logger.info("Book Two ID: " + bookTwoId);
    }

    @Test
    void testDeleteBookFromList_ById() {

        bookDatabaseImpl.save(bookOne);
        bookDatabaseImpl.save(bookTwo);

        Boolean bookOneIsDeleted = bookDatabaseImpl.delete(1L);
        assertTrue("Book One is not deleted!", bookOneIsDeleted);
        assertNull(bookDatabaseImpl.searchBookById(Long.valueOf(1L)), "First book is not deleted!");

        assertNotNull("Second book should not be deleted!", bookDatabaseImpl.searchBookById(Long.valueOf(2L)));
    }
}