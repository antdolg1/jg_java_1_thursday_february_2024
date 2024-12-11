package students.ruslan_k.lesson_8.level_1;

public abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    String getRuleName() {
        return this.ruleName;
    }

    abstract FraudDetectionResult isFraud(Transaction t);

}