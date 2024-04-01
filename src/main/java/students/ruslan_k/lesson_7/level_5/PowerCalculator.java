package students.ruslan_k.lesson_7.level_5;

class PowerCalculator {

    static double powerOf(double base, int power) {
        if (power == 0) return 1.0;

        double result = base;
        boolean isNegative = power < 0;
        power = isNegative ? -power : power;
        for (int i = 1; i < power; i++) {
            result *= base;
        }

        if (isNegative) {
            return (1 / result);
        } else {
            return result;
        }
    }

}
