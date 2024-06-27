package students.arturs_novikovs.lesson_8.level_1;

public class FraudRule1 implements FraudRule{
    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getFullName().equals("Pokemon");
    }
}

