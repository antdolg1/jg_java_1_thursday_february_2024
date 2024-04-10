package teacher.lesson_9.lessoncode.abstraction;

public class DVD implements LibraryItem {

    private String title;
    private String director;
    private boolean available = true;

    public DVD(String title, String director) {
        this.title = title;
        this.director = director;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthorOrDirector() {
        return director;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void checkout() {
        if (available) {
            available = false;
        } else {
            System.out.println("This DVD is already checked out.");
        }
    }

    @Override
    public void returnItem() {
        available = true;
    }

    @Override
    public double calculateLateFee(int daysOverdue) {
        return daysOverdue * LATE_FEE_PER_DAY;
    }
}
