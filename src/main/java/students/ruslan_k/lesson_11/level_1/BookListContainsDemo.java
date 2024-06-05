package students.ruslan_k.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

public class BookListContainsDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");

        Book book4 = new Book("Author1", "Title1");
        Book book5 = new Book("Author5", "Title5");

        List<Book> biblio = new ArrayList<>();

        biblio.add(book1);
        biblio.add(book2);
        biblio.add(book3);
        if (biblio.contains(book4)) {
            System.out.println("Book is exist");
        }
        if(!biblio.contains(book5)){
            System.out.println("Book is not exist");
        }

    }

}

