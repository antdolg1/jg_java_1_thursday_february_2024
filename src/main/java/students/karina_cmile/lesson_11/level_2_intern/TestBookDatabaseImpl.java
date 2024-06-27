package students.karina_cmile.lesson_11.level_2_intern;

public class TestBookDatabaseImpl {
    public static void main(String[] args) {
        BookDatabaseImpl database = new BookDatabaseImpl();

        Book book1 = new Book("Марк Твен", "Приключения Тома Сойера");
        Book book2 = new Book("Теодор Драйзер", "Титан");
        Book book3 = new Book("Теодор Драйзер", "Стоик");
        Book book4 = new Book("Аласдер Грей", "Титан");
        Book book5 = new Book("Эрих Мария Ремарк", "Ночь в Лиссабоне");

        Long bookId1 = database.save(book1);
        Long bookId2 = database.save(book2);
        Long bookId3 = database.save(book3);
        Long bookId4 = database.save(book4);
        Long bookId5 = database.save(book4);



    }
}
