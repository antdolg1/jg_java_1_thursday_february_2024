package students.aleksandra_hodjuka.lesson_3.level_3;

class Book {
    String title;
    String author;
    String yearOfPrint;
    String chapter;


    Book(String title, String author, String yearOfPrint,String chapter) {
        this.title = title;
        this.author = author;
        this.yearOfPrint = yearOfPrint;
        this.chapter = chapter;
    }

    public String getTitle() {
        return this.title;
    }
    public String getChapter() {
        return this.chapter;}

    public String getAuthor() {
        return this.author;
    }

    public String getYearOfPrint() {
        return this.yearOfPrint;

    }
}
