package students.kristina_manevica.lesson_8.homework.level_1;

public class FraudRule2 extends FraudRule {
    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getAmount() > 1000000) {
            return true;
        }
        return false;
    }
}