package students.ruslan_k.lesson_11.level_2;


import org.junit.Before;

import org.junit.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


public class BookDatabaseImplTest {

    public BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
    Book book11 = new Book("a1", "t1");
    Book book12 = new Book("a1", "t2");
    Book book22 = new Book("a2", "t2");
    Book book21 = new Book("a2", "t1");
    Book book33 = new Book("a3", "t3");
    List<Book> bookByAuthor = new ArrayList<>();
    List<Book> bookByTitle = new ArrayList<>();

    @Before
    public void preparing() {
        // Preparing biblio
        bookDatabase.save(book11);
        bookDatabase.save(book12);
        bookDatabase.save(book21);
        bookDatabase.save(book22);
        bookDatabase.save(book33);


        bookByAuthor.add(book11);
        bookByAuthor.add(book12);
        bookByTitle.add(book11);
        bookByTitle.add(book21);

        //bookDatabase = new BookDatabaseImpl();
    }

    @Test
    public void deleteBookById_Test() {
        assertTrue(bookDatabase.delete(1l));
        assertFalse(bookDatabase.delete(1l));


    }

    @Test
    public void deleteBookByBook_Test() {
        assertTrue(bookDatabase.delete(book12));
        assertFalse(bookDatabase.delete(book12));
    }

    @Test
    public void findBookById_Test() {
        assertEquals(Optional.of(book12), bookDatabase.findById(2l));
        assertEquals(Optional.empty(), bookDatabase.findById(7l));
    }

    @Test
    public void findBookByAuthor_Test() {
        assertEquals(bookByAuthor, bookDatabase.findByAuthor("a1"));

    }


    @Test
    public void findBookByTitle_Test() {
        assertEquals(bookByTitle, bookDatabase.findByTitle("t1"));

    }

    @Test
    public void countAllBooks_Test() {
        assertEquals(5, bookDatabase.countAllBooks());
    }

    @Test
    public void deleteByAuthor_Test() {
        bookDatabase.deleteByAuthor("a1");
        assertEquals(3, bookDatabase.countAllBooks());
    }

    @Test
    public void deleteByTitle_Test() {
        bookDatabase.deleteByTitle("t1");
        assertEquals(3, bookDatabase.countAllBooks());
    }
}

