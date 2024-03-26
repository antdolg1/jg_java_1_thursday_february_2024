package students.nikita_bortnikovs.lesson_8.homework.task1_24;

import org.junit.Assert;
import org.junit.Test;

public class FraudRule4Test {
    @Test
    public void testRule4IsFraudWhenCityIsGermanyAndAmountHi1000() {
        Trader trader = new Trader("Other name", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        FraudRule4 fraudRule4= new FraudRule4("4");
        Assert.assertTrue(fraudRule4.isFraud(transaction));
        System.out.println("Test passed - Transaction for Germany >1000 is  denied" );
    }

    @Test
    public void testRule4IsFraudWhenCityIsOtherThenGermanyAndAmountHi1000() {
        Trader trader = new Trader("Other name", "Riga");
        Transaction transaction = new Transaction(trader, 1001);
        FraudRule4 fraudRule4= new FraudRule4("4");
        Assert.assertFalse(fraudRule4.isFraud(transaction));
        System.out.println("Test passed - Transaction for Riga >1000 is not  denied" );
    }
    @Test
    public void testRule4IsNotFraudWhenCityIsGermanyAndAmountLo1000() {
        Trader trader = new Trader("Other name", "Germany");
        Transaction transaction = new Transaction(trader, 999);
        FraudRule4 fraudRule4= new FraudRule4("4");
        Assert.assertFalse(fraudRule4.isFraud(transaction));
        System.out.println("Test passed - Transaction for Germany <999  is not  denied" );
    }
}
