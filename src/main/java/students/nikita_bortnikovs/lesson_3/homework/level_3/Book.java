package students.nikita_bortnikovs.lesson_3.homework.level_3;

public class Book {
    String bookName;
    String author;
    int yearPublished;
    int chapterAmount;


    Book(String bookName, String author, int chapterAmount, int yearPublished) {
        this.bookName = bookName;
        this.author = author;
        this.yearPublished = yearPublished;
        this.chapterAmount = chapterAmount;
    }
    String getBookName() {
        return this.bookName;
    }
    String getAuthor() {
        return this.author;
    }
    int getYearPublished() {
        return this.yearPublished;
    }
    int getChapterAmount() {
        return this.chapterAmount;
    }
}
