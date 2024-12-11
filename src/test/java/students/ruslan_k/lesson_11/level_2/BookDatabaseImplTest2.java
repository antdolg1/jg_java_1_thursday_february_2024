package students.ruslan_k.lesson_11.level_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class BookDatabaseImplTest2 {
    public BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
    Book book11 = new Book("a1", "t1");
    Book book12 = new Book("a1", "t2");
    Book book22 = new Book("a2", "t2");
    Book book21 = new Book("a2", "t1");
    Book book33 = new Book("a3", "t3");
    List<Book> biblio = new ArrayList<>();



    @Test
    public void addingBookToBiblio_Test() {
        assertEquals(1L, bookDatabase.save(book11)); // Adding first book
        assertEquals(2L, bookDatabase.save(book12)); // Adding second book
        assertEquals(0L, bookDatabase.save(book11)); // Try to add book, same as first
        assertEquals(3L, bookDatabase.save(book22)); // Try to add book, same as first
        assertEquals(4L, bookDatabase.save(book21)); // Try to add book, same as first
        assertEquals(5L, bookDatabase.save(book33)); // Try to add book, same as first
    }
}
