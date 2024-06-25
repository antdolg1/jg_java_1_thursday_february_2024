package students.nikola_korovacka.lesson_13;

import java.math.BigDecimal;

public class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        BigDecimal taxPercentBelowThreshold = new BigDecimal("0.25"); // 25% tax rate below threshold
        BigDecimal taxPercentAboveThreshold = new BigDecimal("0.40"); // 40% tax rate above threshold
        BigDecimal threshold = new BigDecimal("20000"); // Threshold for 25% tax rate

        if (income.compareTo(BigDecimal.ZERO) <= 0) {
            return BigDecimal.ZERO; // No tax if income is zero or negative
        } else if (income.compareTo(threshold) <= 0) {
            // Calculate tax at 25% rate for income up to threshold
            return income.multiply(taxPercentBelowThreshold);
        } else {
            // Calculate tax for income above threshold
            BigDecimal taxUpToThreshold = threshold.multiply(taxPercentBelowThreshold);
            BigDecimal excessIncome = income.subtract(threshold);
            BigDecimal taxAboveThreshold = excessIncome.multiply(taxPercentAboveThreshold);
            return taxUpToThreshold.add(taxAboveThreshold);
        }
    }
}