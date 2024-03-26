package students.nikita_bortnikovs.lesson_8.homework.task1_24;

import java.util.ArrayList;
import java.util.List;


//на этом этапе уже искал помощь у ЧатГПТ. 24 Задание уже не осилил.
public class FraudDetector {
    private List<FraudRule> fraudRules;

    public FraudDetector(List<FraudRule> fraudRules) {
        List<FraudRule> fraudRulesList = new ArrayList<>();
        fraudRulesList.add(new FraudRule1("1"));
        fraudRulesList.add(new FraudRule2("2"));
        fraudRulesList.add(new FraudRule3("3"));
        fraudRulesList.add(new FraudRule4("4"));
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        this.fraudRules = fraudRules;
    }

    public boolean isFraud(Transaction transaction) {
        for (FraudRule rule : fraudRules) {
            if (rule.isFraud(transaction)) {
                return true;
            }
        }
        return false;
    }
}
