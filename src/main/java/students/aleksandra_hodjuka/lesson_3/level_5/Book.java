package students.aleksandra_hodjuka.lesson_3.level_5;

class Book {
    private String title;

    Book(String title) {
        this.title = title;
    }

    String getTitle() {
        return this.title;
    }
}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String title = myBook.getTitle();
        System.out.println("Book title = " + title);
    }
}
