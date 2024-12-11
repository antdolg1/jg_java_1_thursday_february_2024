package students.ruslan_k.lesson_8.level_1;

public class FraudDetectionResult {
    private boolean fraud;
    private String ruleName;

    FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    boolean getFraud() {
        return fraud;
    }

    String getRuleName() {
        return ruleName;
    }

}
