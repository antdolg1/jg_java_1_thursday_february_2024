package students.karina_cmile.lesson_11.level_2_intern;

import java.util.ArrayList;
import java.util.List;

public class BookDatabaseImpl implements BookDatabase{

    private List<Long> bookList= new ArrayList<>();
    private Long Id;
    @Override
    public Long save(Book book) {
        bookList.add(book.getId());
        Id++;
        return null;
    }
}
