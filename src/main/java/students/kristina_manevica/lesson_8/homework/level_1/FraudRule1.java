package students.kristina_manevica.lesson_8.homework.level_1;

public class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().equals("Pokemon")) {
            return true;
        }
        return false;
    }
}