package students.kristina_manevica.lesson_8.homework.level_1;

public class FraudRule4 extends FraudRule {
    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCity().equals("Germany") && t.getAmount() > 1000) {
            return true;
        }
        return false;
    }
}