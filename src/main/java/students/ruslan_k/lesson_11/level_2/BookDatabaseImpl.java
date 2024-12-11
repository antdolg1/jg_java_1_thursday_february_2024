package students.ruslan_k.lesson_11.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase {

    List<Book> bookList = new ArrayList<>();

    @Override
    public Long save(Book book) {
        Long bookId = 0L;

        try {
            if (!bookList.contains(book)) {
                bookId = bookList.getLast().getId() + 1L;
            }

        } catch (Exception e) {
            bookId = 1L;
        } finally {
            if (!bookId.equals(0L)) {
                book.setId(bookId);
                bookList.addLast(book);
            }


        }
        return bookId;
    }

    @Override
    public boolean delete(Long bookId) {
        if (bookList.isEmpty()) {
            return false;
        }
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId().equals(bookId)) {
                bookList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        if (bookList.isEmpty()) {
            return false;
        }
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).equals(book)) {
                bookList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {

        Optional<Book> book = Optional.empty();
        for(Book element: bookList){
            if( element.getId().equals(bookId)){
                book= Optional.of(element);
            }
        }

        return book;
    }

    @Override
    public List<Book> findByAuthor(String author){
        List<Book> finalList = new ArrayList<>();
        for(Book element: bookList){
            if(element.getAuthor().equals(author)){
                finalList.add(element);
            }
        }
        return finalList;
    }

    @Override
    public List<Book> findByTitle(String title){
        List<Book> finalList = new ArrayList<>();
        for(Book element: bookList){
            if(element.getTitle().equals(title)){
                finalList.add(element);
            }
        }
        return finalList;
    }
    public int countAllBooks(){
        return bookList.size();
    }

    public void deleteByAuthor(String author){
        for(int i = 0; i<bookList.size(); i++){
            if(bookList.get(i).getAuthor().equals(author)){
                bookList.remove(i);
                i--;
            }
        }
    }

    public void deleteByTitle(String title){
        for(int i = 0; i<bookList.size(); i++){
            if(bookList.get(i).getTitle().equals(title)){
                bookList.remove(i);
                i--;
            }
        }
    }

}
