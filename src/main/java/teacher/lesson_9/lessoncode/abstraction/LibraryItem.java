package teacher.lesson_9.lessoncode.abstraction;

public interface LibraryItem {
    // Variables int the interface are implicitly public, static and final
    int MAX_CHECKOUT_DAYS = 21;
    double LATE_FEE_PER_DAY = 0.50;

    // Abstract methods are implicitly public  & abstract
    String getTitle();
    String getAuthorOrDirector();
    boolean isAvailable();
    void checkout();
    void returnItem();
    double calculateLateFee(int daysOverdue);

    default void displayInformation() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author or director: " + getAuthorOrDirector());
        System.out.println("Availability: " + (isAvailable() ? "Available" : "Checked out"));
    }
}
