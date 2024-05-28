package students.aleksandra_hodjuka.lesson_11.level_2;

import java.util.List;
import java.util.Optional;

public class TestBookDatabase {
    public static void main(String[] args) {
        // Создаем экземпляр класса BookDatabaseImpl
        BookDatabaseImpl database = new BookDatabaseImpl();


        Book book1 = new Book("Daniel Keyes", "Flowers for Algernon");
        Book book2 = new Book("Anthony Doerr", "Shell Collector");
        Book book3 = new Book("Anthony Doerr", "All the Light We Cannot See");
        Book book4 = new Book("Anthony Doerr", "Cloud Cuckoo Land");

        Long book1Id = database.save(book1);
        Long book2Id = database.save(book2);
        Long book3Id = database.save(book3);
        Long book4Id = database.save(book4);

//        // Удаляем одну из книг по ее id
//        Long bookIdToDelete = book2.getId(); // Получаем id книги, которую будем удалять
//        boolean isDeletedById = database.delete(bookIdToDelete);

//
//        if (isDeletedById) {
//            System.out.println("The book is deleted from the database.");
//        } else {
//            System.out.println("The book with this id is not found in the database.");
//        }
//
//        boolean bookIsDeleted = database.delete(book1);
//        if (bookIsDeleted) {
//            System.out.println("The book is deleted from the database.");
//        } else {
//            System.out.println("The book  is not found in the database.");
//        }
//        // Поиск книги по ее id
        Optional<Book> foundBook1 = database.findById(book1Id);
        if (foundBook1.isPresent()) {
            System.out.println("Book 1 found: " + foundBook1.get());
        } else {
            System.out.println("Book 1 not found.");
        }
        Optional<Book> foundBook2 = database.findById(book2Id);
        if (foundBook2.isPresent()) {
            System.out.println("Book 2 found: " + foundBook2.get());
        } else {
            System.out.println("Book 2 not found.");
        }

        // Поиск книги с несуществующим id
        Optional<Book> notFoundBook = database.findById(999L);
        if (notFoundBook.isPresent()) {
            System.out.println("Book with id 999 found: " + notFoundBook.get());
        } else {
            System.out.println("Book with id 999 not found.");
        }
        // Поиск книг по автору
        List<Book> booksByAuthor1 = database.findByAuthor("Daniel Keyes");
        System.out.println("Books by Daniel Keyes:");
        for (Book book : booksByAuthor1) {
            System.out.println(book.getTitle());
        }

        List<Book> booksByAuthor2 = database.findByAuthor("Anthony Doerr");
        System.out.println("Books by Anthony Doerr ");
        for (Book book : booksByAuthor2) {
            System.out.println(book.getTitle());
        }
        // Поиск книг по несуществующему автору
        List<Book> booksByNonExistingAuthor = database.findByAuthor("Robert Martin");
        System.out.println("Books with the author 'Robert Martin' :");
        if (booksByNonExistingAuthor.isEmpty()) {
            System.out.println("No books found with the author 'Robert Martin'");
        } else {
            for (Book book : booksByNonExistingAuthor) {
                System.out.println(book);
            }
        }

        // Поиск книг по названию
        List<Book> booksByTitle1 = database.findByTitle("Flowers for Algernon");
        System.out.println("Books with the title 'Flowers for Algernon' :");
        for (Book book : booksByTitle1) {
            System.out.println(book);
        }
        List<Book> booksByTitle2 = database.findByTitle("Shell Collector");
        System.out.println("Books with the title 'Shell Collector' :");
        for (Book book : booksByTitle2) {
            System.out.println(book);
        }
        // Поиск книг по несуществующему названию
        List<Book> booksByNonExistingTitle = database.findByTitle("Clean code");
        System.out.println("Books with the title 'Clean code' :");
        if (booksByNonExistingTitle.isEmpty()) {
            System.out.println("No books found with the title 'Clean code'");
        } else {
            for (Book book : booksByNonExistingTitle) {
                System.out.println(book);
            }
        }
        // Получаем общее количество книг в базе данных и выводим на экран
        int count = database.countAllBooks();
        System.out.println("Total number of books: " + count);

        // Удаляем все книги автора "Daniel Keyes"
        String authorToDelete = "Daniel Keyes";
        database.deleteByAuthor(authorToDelete);

        // Выводим оставшиеся книги после удаления
        List<Book> remainingBooks = database.getAllBooks();
        System.out.println("Remaining books after deleting books by author " + authorToDelete + ":");
        for (Book book : remainingBooks) {
            System.out.println(book);
        }
        // Удаляем все книги с названием  "Cloud Cuckoo Land"
        String TitleToDelete = "Cloud Cuckoo Land";
        database.deleteByTitle(TitleToDelete);

        // Выводим оставшиеся книги после удаления
        remainingBooks = database.getAllBooks();
        System.out.println("Remaining books after deleting books by title " + TitleToDelete + ":");
        for (Book book : remainingBooks) {
            System.out.println(book);
        }
        count = database.countAllBooks();
        System.out.println("Total number of books: " + count);
    }

}
