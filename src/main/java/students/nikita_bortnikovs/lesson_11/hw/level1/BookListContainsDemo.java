//package students.nikita_bortnikovs.lesson_11.hw.level1;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class BookListContainsDemo {
//    public static void main(String[] args) {
//
//
//    List<Book> books = new ArrayList<>();
//        System.out.println(books);
//
//    Book book1 = new Book("A1", "B1");
//    Book book2 = new Book("A2", "B2");
//
//        books.add(book1);
//        books.add(book2);
//        System.out.println(books);
//
//    Book bookInTheList = new Book("A1", "B1");
//    boolean containsBook = books.contains(bookInTheList); // должно быть true
//        System.out.println(containsBook);
//
//    Book bookNotInTheList = new Book("A3", "B3");
//    boolean notContainsBook = books.contains(bookNotInTheList); // должно быть false
//        System.out.println(notContainsBook);
//}
//}