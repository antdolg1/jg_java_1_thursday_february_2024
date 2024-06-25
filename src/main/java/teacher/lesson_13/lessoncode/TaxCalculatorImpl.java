package teacher.lesson_13.lessoncode;

import java.math.BigDecimal;

public class TaxCalculatorImpl implements TaxCalculator{

    @Override
    public double calculate25PercentTax(double income) {
        if (income < 0) {
            throw new IllegalArgumentException("Income cannot be negative");
        }
        return income * 0.25;
    }

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        return null;
    }
}
