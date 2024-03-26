package students.nikita_bortnikovs.lesson_8.homework.task1_24;

import org.junit.Assert;
import org.junit.Test;

public class FraudDetectorTest {

    @Test
    public void testIsFraudWhenTraderIsPokemon() {
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 100);
        FraudRule1 fraudRule1 = new FraudRule1("1");
        Assert.assertTrue(fraudRule1.isFraud(transaction));
        ;
        System.out.println("Test passed - Transaction for Name Pokemon denied");
    }

    @Test
    public void testIsFraudWhenTraderIsNotPokemon() {
        Trader trader = new Trader("Other name", "Riga");
        Transaction transaction = new Transaction(trader, 100);
        FraudRule1 fraudRule1 = new FraudRule1("1");
        Assert.assertFalse(fraudRule1.isFraud(transaction));
        System.out.println("Test passed - Transaction for Other Name is not denied");
    }

    @Test
    public void testIsFraudWhenTransactionIsTooBig() {
        Trader trader = new Trader("Other name", "Riga");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudRule2 fraudRule2 = new FraudRule2("2");
        Assert.assertTrue(fraudRule2.isFraud(transaction));
        System.out.println("Test passed - Transaction for 1000000 is denied");
    }

    @Test
    public void testIsFraudWhenTransactionAmountIsOk() {
        Trader trader = new Trader("Other name", "Riga");
        Transaction transaction = new Transaction(trader, 500);
        FraudRule2 fraudRule2 = new FraudRule2("2");
        Assert.assertFalse(fraudRule2.isFraud(transaction));
        System.out.println("Test passed - Transaction for 500 is not denied");
    }

    @Test
    public void testIsFraudWhenCitySydney() {
        Trader trader = new Trader("Other name", "Sydney");
        Transaction transaction = new Transaction(trader, 500);
        FraudRule3 fraudRule3 = new FraudRule3("3");
        Assert.assertTrue(fraudRule3.isFraud(transaction));
        System.out.println("Test passed - Transaction for City Sydney is  denied");
    }

    @Test
    public void testIsFraudWhenCityIsNotSydney() {
        Trader trader = new Trader("Other name", "Riga");
        Transaction transaction = new Transaction(trader, 500);
        FraudRule3 fraudRule3 = new FraudRule3("3");
        Assert.assertFalse(fraudRule3.isFraud(transaction));
        System.out.println("Test passed - Transaction for Other City then Sydney is not denied");
    }

    @Test
    public void testIsFraudWhenCityIsJamaica() {
        Trader trader = new Trader("Other name", "Jamaica");
        Transaction transaction = new Transaction(trader, 500);
        FraudRule3 fraudRule3 = new FraudRule3("3");
        Assert.assertTrue(fraudRule3.isFraud(transaction));
        System.out.println("Test passed - Transaction for Jamaica is  denied");
    }

    @Test
    public void testIsFraudWhenCityIsGermanyAndAmountHi1000() {
        Trader trader = new Trader("Other name", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        FraudRule4 fraudRule4 = new FraudRule4("4");
        Assert.assertTrue(fraudRule4.isFraud(transaction));
        ;
        System.out.println("Test passed - Transaction for Germany >1000 is  denied");
    }

    @Test
    public void testIsFraudWhenCityIsNotGermanyAndAmountHi1000() {
        Trader trader = new Trader("Other name", "Riga");
        Transaction transaction = new Transaction(trader, 1001);
        FraudRule4 fraudRule4 = new FraudRule4("4");
        Assert.assertFalse(fraudRule4.isFraud(transaction));
        ;
        System.out.println("Test passed - Transaction for Riga and amount >1000 is not  denied");
    }

    @Test
    public void testIsFraudWhenCityIsGermanyAndAmountLo1000() {
        Trader trader = new Trader("Other name", "Germany");
        Transaction transaction = new Transaction(trader, 999);
        FraudRule4 fraudRule4 = new FraudRule4("4");
        Assert.assertFalse(fraudRule4.isFraud(transaction));
        ;
        System.out.println("Test passed - Transaction for Germany and amount less 1000  is not  denied");
    }

}
