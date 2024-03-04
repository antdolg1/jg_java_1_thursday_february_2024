package students.aleksandra_hodjuka.lesson_3.level_3;

class Book {
    String title;
    String author;
    String yearOfPrint;


    Book(String title, String author, String yearOfPrint) {
        this.title = title;
        this.author = author;
        this.yearOfPrint = yearOfPrint;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getYearOfPrint() {
        return this.yearOfPrint;
    }
}
