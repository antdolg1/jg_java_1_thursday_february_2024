package students.nikola_korovacka.lesson_11.level_2;

public class BookDatabaseDemo {
    public static void main(String[] args) {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("Author1", "Title1");
        Long id1 = bookDatabase.save(book1);
        System.out.println("Книга сохранена с ID: " + id1);

        Book book2 = new Book("Author2", "Title2");
        Long id2 = bookDatabase.save(book2);
        System.out.println("Книга сохранена с ID: " + id2);

        // Тестирование других методов
        System.out.println("\nТестирование методов:");
        testMethods(bookDatabase);
    }

    private static void testMethods(BookDatabase bookDatabase) {
        // Удаление книги по ID
        Long bookIdToDelete = 1L;
        boolean deleteByIdResult = bookDatabase.delete(bookIdToDelete);
        System.out.println("Удаление книги с ID=" + bookIdToDelete + ": " + deleteByIdResult);

        // Поиск книги по ID
        Long bookIdToFind = 2L;
        System.out.println("Поиск книги по ID=" + bookIdToFind + ": " + bookDatabase.findById(bookIdToFind));

        // Поиск книг по автору
        String authorToFind = "Author2";
        System.out.println("Поиск книг автора " + authorToFind + ": " + bookDatabase.findByAuthor(authorToFind));

        // Поиск книг по названию
        String titleToFind = "Title2";
        System.out.println("Поиск книг с названием " + titleToFind + ": " + bookDatabase.findByTitle(titleToFind));

        // Количество книг в базе данных
        System.out.println("Всего книг в базе данных: " + bookDatabase.countAllBooks());

        // Удаление книг по автору
        String authorToDelete = "Author2";
        bookDatabase.deleteByAuthor(authorToDelete);
        System.out.println("Удаление всех книг автора " + authorToDelete);
        System.out.println("Текущее количество книг в базе данных: " + bookDatabase.countAllBooks());

        // Удаление книг по названию
        String titleToDelete = "Title1";
        bookDatabase.deleteByTitle(titleToDelete);
        System.out.println("Удаление всех книг с названием " + titleToDelete);
        System.out.println("Текущее количество книг в базе данных: " + bookDatabase.countAllBooks());
    }
}


