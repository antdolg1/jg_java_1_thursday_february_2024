package students.ruslan_k.lesson_13.level_1;

import java.math.BigDecimal;

public class TaxCalculatorImpl implements TaxCalculator {

    private final BigDecimal FIRST_LEVEL = new BigDecimal("20000");
    private final BigDecimal TAX_SECOND_LEVEL = new BigDecimal("0.40");
    private final BigDecimal TAX_FIRST_LEVEL = new BigDecimal("0.25");

    @Override
    public BigDecimal calculateTax(BigDecimal income) {

        if (income.compareTo(FIRST_LEVEL) <= 0) {
            return income.multiply(TAX_FIRST_LEVEL);
        } else {
            var result = income.subtract(FIRST_LEVEL);
            var result2 = result.multiply(TAX_SECOND_LEVEL);
            var result3 = FIRST_LEVEL.multiply(TAX_FIRST_LEVEL);
            return result2.add(result3);
        }
    }
}
