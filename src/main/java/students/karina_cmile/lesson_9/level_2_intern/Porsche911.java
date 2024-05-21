package students.karina_cmile.lesson_9.level_2_intern;

public class Porsche911 extends Car {
    private int topSpeed;

    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }
    @Override
    public String toString() {
        return "Porsche911: "+ "Release Year " + releaseYear + ", " + "Top speed " + topSpeed + "km/h";
    }
}
