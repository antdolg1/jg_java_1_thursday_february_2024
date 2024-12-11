package students.ruslan_k.lesson_8.level_1;

public class FraudDetector {

    private final FraudRule[] rules;

    FraudDetector(FraudRule[] rules) {
        this.rules = rules;
    }

    String isFraud(Transaction t) {
        for (int i = 0; i < rules.length; i++) {
            if (rules[i].isFraud(t).getFraud()) {
                return rules[i].getRuleName();
            }
        }
        return "";
    }
}
