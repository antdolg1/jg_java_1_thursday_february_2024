package students.nikita_bortnikovs.lesson_15.hw.level2;

class QuadEqSrp {

    public Roots calc(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            return discriminantGreaterThanZero(a, b, discriminant);
        } else if (discriminant == 0) {
            return discriminantEqualsZero(a, b);
        } else {
            return discriminantLessThanZero();
        }
    }

    private Roots discriminantGreaterThanZero(double a, double b, double discriminant) {
        double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        return new Roots(x1, x2);
    }

    private Roots discriminantEqualsZero(double a, double b) {
        double x = -b / (2 * a);
        return new Roots(x);
    }

    private Roots discriminantLessThanZero() {
        return new Roots();
    }
}
