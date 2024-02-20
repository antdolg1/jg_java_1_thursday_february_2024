package students.slava_subacius.lesson_3.level_3;

public class Book {
    private String title;
    private String author;
    private int releaseYear;
    private String chapter1;
    private String chapter2;

    public Book(String title, String author, int releaseYear, String chapter1, String chapter2) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public String getChapter1() {
        return chapter1;
    }
    public String getChapter2() {
        return chapter2;
    }


}
