package students.igors_melkins.lesson_9.abstraction;

public class Book implements  LibraryItem {

    private String title;
    private String author;
    private  boolean available = true;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthorOrDirector() {
        return author;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void checkout() {
        if (available){
            available = false;
        } else {
            System.out.println("This book is already checked out");
        }

    }

    @Override
    public void returnItem() {
        available = true;

    }

    @Override
    public double calculateLAteFee(int dayOverdue) {
        return dayOverdue * LATE_FEE_PER_DAY;
    }
}
