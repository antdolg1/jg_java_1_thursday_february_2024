package students.nikita_bortnikovs.lesson_8.homework.task1_24;

import org.junit.Assert;
import org.junit.Test;

public class FraudRule2Test {
    @Test
    public void testRule2ClassIsFraudWhenTransactionIsTooBig() {
        Trader trader = new Trader("Other name", "Riga");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudRule2 fraudRule2 = new FraudRule2("2");
        Assert.assertTrue(fraudRule2.isFraud(transaction));
        System.out.println("Test passed - Transaction for >100000 is  denied" );

}
    @Test
    public void testRule2ClassIsFraudWhenTransactionIsLess10000() {
        Trader trader = new Trader("Other name", "Riga");
        Transaction transaction = new Transaction(trader, 999);
        FraudRule2 fraudRule2 = new FraudRule2("2");
        Assert.assertFalse(fraudRule2.isFraud(transaction));
        System.out.println("Test passed - Transaction for 999 is not denied" );

    }
}
