package students.kristina_manevica.lesson_13.homework.level_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class TaxCalculatorImplTest {
    /*
    private static TaxCalculatorImpl taxCalculator;

    @BeforeAll
    static void setUp() {
        taxCalculator = new TaxCalculatorImpl();
    }

    @Test
    void calculateTax_WhenIncome_Negative() {
        BigDecimal income = new BigDecimal(-1.00);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            taxCalculator.calculateTax(income);
        });
    }

    @Test
    void calculateTax_WhenIncome_Zero() {
        BigDecimal income = BigDecimal.ZERO;
        BigDecimal actual = taxCalculator.calculateTax(income);
        Assertions.assertEquals(actual, new BigDecimal("0.00"));
    }

    @Test
    void calculateTax_WhenIncome_LessThen20K() {
        BigDecimal income = new BigDecimal(19999.99);
        BigDecimal actual = taxCalculator.calculateTax(income);
        Assertions.assertEquals(actual, new BigDecimal("5000.00"));
    }

    @Test
    void calculateTax_WhenIncome_20K() {
        BigDecimal income = new BigDecimal(20000.00);
        BigDecimal actual = taxCalculator.calculateTax(income);
        Assertions.assertEquals(actual, new BigDecimal("5000.00"));
    }

    @Test
    void calculateTax_WhenIncome_MoreThen20K() {
        BigDecimal income = new BigDecimal(20000.01);
        BigDecimal actual = taxCalculator.calculateTax(income);
        Assertions.assertEquals(actual, new BigDecimal("5000.00"));
    }*/
}