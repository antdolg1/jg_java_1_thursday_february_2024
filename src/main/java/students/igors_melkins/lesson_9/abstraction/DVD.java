package students.igors_melkins.lesson_9.abstraction;

public class DVD implements LibraryItem {

    private  String title;
    private  String director;
    private  boolean availible = true ;

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
        return availible;
    }

    @Override
    public void checkout() {
        if (availible){
            availible = false;
        } else {
            System.out.println("This DVD is already checked out");
        }

    }

    @Override
    public void returnItem() {
        availible =  true;

    }

    @Override
    public double calculateLAteFee(int dayOverdue) {
        return dayOverdue * LATE_FEE_PER_DAY ;
    }
}
