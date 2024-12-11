package students.ruslan_k.lesson_13.level_1;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class TaxCalculatorImplTest {

    @ParameterizedTest
    @CsvSource({"0, 0.00", "100, 25.00", "20000, 5000.00", "30000, 9000.00"})
    public void calculateTaxParametricTest(String income, String tax) {
        TaxCalculatorImpl taxCalculator = new TaxCalculatorImpl();
        BigDecimal bdIncome = new BigDecimal(income);
        BigDecimal bdTax = new BigDecimal(tax);

        BigDecimal realResult = taxCalculator.calculateTax(bdIncome);
        assertEquals(bdTax, realResult);
    }




}