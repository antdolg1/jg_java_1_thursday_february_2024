package students.ruslan_k.lesson_11.level_2;

public class BiblioDemo {
    public static void main(String[] args) {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("J.F.K.", "President");
        Book book2 = new Book("B.Abama", "Another President");
        Book book3 = new Book("A.Lincoln", "I and my slaves");

        CheckBookAdding(bookDatabase.save(book));
        CheckBookAdding(bookDatabase.save(book));

        CheckBookAdding(bookDatabase.save(book2));

        boolean isDeleted =  bookDatabase.delete(2L);

        System.out.println("Is book was deleted ? " + isDeleted);

        CheckBookAdding(bookDatabase.save(book3));
        CheckBookAdding(bookDatabase.save(book2));

        isDeleted = bookDatabase.delete(book);

        System.out.println("Is book was deleted ? " + isDeleted);


    }

    static void CheckBookAdding(Long Id){
        if(!Id.equals(0L)){
            System.out.println("Book was added with Id: " + Id);
        } else {
            System.out.println("Book wasn't added");
        }

    }
}
