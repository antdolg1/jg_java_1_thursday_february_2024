package students.nikola_korovacka.lesson_13;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
public class TaxCalculatorImplTest {

    private TaxCalculator taxCalculator = new TaxCalculatorImpl();

    @Test
    public void shouldPayZeroTaxWhenIncomeIsZero() {
        var income = BigDecimal.ZERO;
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("0.00"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeLessThen20000() {
        var income = new BigDecimal("10000");
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("2500.00"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeEqualTo20000() {
        var income = new BigDecimal("20000");
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("5000.00"));
    }

    @Test
    public void shouldPay25And40PercentTaxWhenIncomeAbove20000() {
        var income = new BigDecimal("30000");
        var expectedTax = new BigDecimal("20000").multiply(new BigDecimal("0.25"))
                .add(new BigDecimal("10000").multiply(new BigDecimal("0.40")));
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(expectedTax, taxToPay);
    }

    @Test
    public void shouldPay25And40PercentTaxWhenIncomeAboveThreshold() {
        var income = new BigDecimal("50000");
        var expectedTax = new BigDecimal("20000").multiply(new BigDecimal("0.25"))
                .add(new BigDecimal("30000").multiply(new BigDecimal("0.40")));
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(expectedTax, taxToPay);
    }
}