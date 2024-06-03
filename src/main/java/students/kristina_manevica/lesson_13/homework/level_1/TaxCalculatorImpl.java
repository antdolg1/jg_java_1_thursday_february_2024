package students.kristina_manevica.lesson_13.homework.level_1;

import java.math.BigDecimal;
//import java.math.RoundingMode;

public class TaxCalculatorImpl implements TaxCalculator {
    @Override
    public BigDecimal calculateTax(BigDecimal income) throws IllegalArgumentException {
        BigDecimal taxRate = new BigDecimal("0.25");
        if (income.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("No negative tax rates!");
        }
        return income.multiply(taxRate);//.setScale(2, RoundingMode.HALF_UP);
    }
}