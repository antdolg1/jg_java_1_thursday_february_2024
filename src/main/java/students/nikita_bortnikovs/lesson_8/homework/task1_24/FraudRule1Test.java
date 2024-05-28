package students.nikita_bortnikovs.lesson_8.homework.task1_24;

import org.junit.Assert;
import org.junit.Test;

public class FraudRule1Test {
    @Test
    public void testRule1ClassIsFraudWhenTraderIsPokemon() {
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 100);
        FraudRule1 fraudRule1 = new FraudRule1("1");
        Assert.assertTrue(fraudRule1.isFraud(transaction));
        System.out.println("Test passed - Transaction for Name Pokemon denied" );
    }
    @Test
    public void testRule1ClassIsNotFraudWhenTraderNameIsNotPokemon() {
        Trader trader = new Trader("Other Name", "Riga");
        Transaction transaction = new Transaction(trader, 100);
        FraudRule1 fraudRule1 = new FraudRule1("1");
        Assert.assertFalse(fraudRule1.isFraud(transaction));
        System.out.println("Test passed - Transaction for Other Name is not denied" );
    }
}
