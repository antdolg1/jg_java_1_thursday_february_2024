package students.kristina_manevica.lesson_13.homework.level_1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculatorImpl implements TaxCalculator {

    BigDecimal taxRate25 = new BigDecimal("0.25");
    BigDecimal taxRate40 = new BigDecimal("0.40");

    @Override
    public BigDecimal calculateTax(BigDecimal income) throws IllegalArgumentException {

        if (income.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Negative income not allowed!");
        }

        if (income.compareTo(new BigDecimal("20000")) <= 0) {
            return income.multiply(taxRate25).setScale(2, RoundingMode.HALF_UP);
        } else {
            BigDecimal incomeMoreThen20000 = income.subtract(new BigDecimal("20000"));
            BigDecimal taxAfter20000 = incomeMoreThen20000.multiply(taxRate40).setScale(2,
                    RoundingMode.HALF_UP);
            BigDecimal taxBefore20000 = new BigDecimal("20000").multiply(taxRate25).setScale(2,
                    RoundingMode.HALF_UP);
            return taxBefore20000.add(taxAfter20000);
        }
    }
}