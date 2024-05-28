package teacher.lesson_13.lessoncode;

public class TaxCalculatorImpl implements TaxCalculator{

    @Override
    public double calculate25PercentTax(double income) {
        if (income < 0) {
            throw new IllegalArgumentException("Income cannot be negative");
        }
        return income * 0.25;
    }
}
