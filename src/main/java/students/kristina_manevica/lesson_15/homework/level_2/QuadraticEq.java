package students.kristina_manevica.lesson_15.homework.level_2;

public class QuadraticEq {

    private static double calculateDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public String calc(double a, double b, double c) {
        double discriminant = calculateDiscriminant(a, b, c);

        if (discriminant > 0) {
            return discriminantMoreThanZero(a, b, discriminant);
        } else if (discriminant == 0) {
            return discriminantZero(a, b);
        } else {
            return discriminantLessThanZero();
        }
    }

    private String discriminantMoreThanZero(double a, double b, double discriminant) {
        double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        return String.format("x1 = %.2f, x2 = %.2f", x1, x2);
    }

    private String discriminantZero(double a, double b) {
        double x = -b / (2 * a);
        return String.format("x = %.2f", x);
    }

    private String discriminantLessThanZero() {
        return "Equation has no roots";
    }
}