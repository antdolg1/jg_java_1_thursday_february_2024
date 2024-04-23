package students.igors_melkins.lesson_10.enums;

public enum CoffeeSize {
    SMALL(8),
    MEDIUM(12),
    LARGE(16);

    private final int ounces;

    CoffeeSize(int ounces) {
        this.ounces = ounces;
    }

    public int getOunces() {
        return ounces;
    }
}
