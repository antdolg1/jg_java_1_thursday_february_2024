package teacher.lesson_13.lessoncode;

import java.math.BigDecimal;

public interface TaxCalculator {

    double calculate25PercentTax(double income);

    BigDecimal calculateTax(BigDecimal income);
}
