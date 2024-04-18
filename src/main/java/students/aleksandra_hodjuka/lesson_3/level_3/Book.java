package students.aleksandra_hodjuka.lesson_3.level_3;

class Book {
    String title;
    String author;
    String yearOfPrint;
    Chapter chapter;


    Book(String title, String author, String yearOfPrint, Chapter chapter) {
        this.title = title;
        this.author = author;
        this.yearOfPrint = yearOfPrint;
        this.chapter = chapter;
    }

    public String getTitle() {
        return this.title;
    }

    public Chapter getChapter() {
        return this.chapter;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getYearOfPrint() {
        return this.yearOfPrint;
    }
}
