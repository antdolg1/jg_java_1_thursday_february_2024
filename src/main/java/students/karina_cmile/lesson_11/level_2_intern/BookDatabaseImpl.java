package students.karina_cmile.lesson_11.level_2_intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase{

    private List<Long> bookList= new ArrayList<>();
    private Long Id;

    @Override
    public Long save(Book book) {
        this.Id= book.getId();
        bookList.add(Id);
        Id++;
        return Id;
    }
    @Override
    public boolean delete(Long bookId) {
        for (Long b : bookList) {
            System.out.println(b); // output for checking
            if (b.equals(Id)){
                bookList.remove(bookId);
            }
            return true;
        }
        return false;
    }
    @Override
    public boolean delete(Book book) {
        for (Long t : bookList) {
            System.out.println(t); // output for checking
            if (t.equals(book)){
                bookList.remove(book);
            }
            return true;
        }

        return false;
    }
    @Override
    public Optional<List<Long>> findById(Long bookId) {
        for (Long b : bookList) {
            System.out.println(b);
            boolean findId = bookList.contains(Id);
                return Optional.of(bookList);
            }
        return Optional.empty();
    }
    @Override
    public Optional<List<Long>> findByAuthor(String author) {
        boolean findAuthor;
        if (bookList.contains(author)) findAuthor = true;
        else findAuthor = false;
        return Optional.empty();
        }

    @Override
    public List<Book> findByTitle(String title) {
        boolean findTitle;
        if (bookList.contains(title)) {
            findTitle = true;
        } else findTitle = false;
        return null;
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
    }
    @Override
    public void deleteByTitle(String title) {
    }
}

