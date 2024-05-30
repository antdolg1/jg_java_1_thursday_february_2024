package students.arturs_novikovs.lesson_8.level_1;

class FraudDetector {
private FraudRule[] fraudRules;

public FraudDetector(FraudRule[] fraudRules) {
    this.fraudRules = fraudRules;
}

public boolean isFraud(Transaction transaction) {
    for (FraudRule rule : fraudRules) {
        if (!rule.isFraud(transaction)) {
            continue;
        }
        return true;
    }
    return false;
}
}
