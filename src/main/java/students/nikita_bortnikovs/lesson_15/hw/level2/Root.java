package students.nikita_bortnikovs.lesson_15.hw.level2;

import lombok.Getter;

@Getter
class Roots {
    private Double x1;
    private Double x2;

    public Roots() {
        this.x1 = null;
        this.x2 = null;
    }

    public Roots(double x) {
        this.x1 = x;
        this.x2 = null;
    }

    public Roots(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public boolean hasRoots() {
        return x1 != null || x2 != null;
    }
}