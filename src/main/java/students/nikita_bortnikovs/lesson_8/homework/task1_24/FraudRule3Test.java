package students.nikita_bortnikovs.lesson_8.homework.task1_24;

import org.junit.Assert;
import org.junit.Test;

public class FraudRule3Test {
    @Test
    public void testIsFraudWhenCitySydney() {
        Trader trader = new Trader("Other name", "Sydney");
        Transaction transaction = new Transaction(trader, 500);
        FraudRule3 fraudRule3 = new FraudRule3("3");
        Assert.assertTrue(fraudRule3.isFraud(transaction));
        System.out.println("Test passed - Transaction for Sydney is  denied" );
    }
    @Test
    public void testIsFraudWhenCityJamaica() {
        Trader trader = new Trader("Other name", "Jamaica");
        Transaction transaction = new Transaction(trader, 500);
        FraudRule3 fraudRule3 = new FraudRule3("3");
        Assert.assertTrue(fraudRule3.isFraud(transaction));
        System.out.println("Test passed - Transaction for Jamaica is  denied" );
    }
    @Test
    public void testIsNotFraudWhenCityNotSydneyAndNotJamaica() {
        Trader trader = new Trader("Other name", "Zilupe");
        Transaction transaction = new Transaction(trader, 500);
        FraudRule3 fraudRule3 = new FraudRule3("3");
        Assert.assertFalse(fraudRule3.isFraud(transaction));
        System.out.println("Test passed - Transaction for Zilupe is not denied" );
    }
}
