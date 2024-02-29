package students.kristina_manevica.lesson_3.homework.level_5;

class BookDemo {
    public static void main(String[] args) {

        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
