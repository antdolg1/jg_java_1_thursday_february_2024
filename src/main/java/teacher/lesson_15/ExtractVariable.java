package teacher.lesson_15;

public class ExtractVariable {

    public static final String EFFICIENCY_INDEX = "BBB";
    public static final String SOCIAL_INDEX_PREFIX = "901";
    private final int minimalSalary = 200;

    boolean calculateRate() {
        boolean isSocialIndexApplied = SOCIAL_INDEX_PREFIX.toLowerCase().indexOf("9") < 1;
        boolean isBBBIndex = EFFICIENCY_INDEX.toLowerCase().indexOf("BB") > 0;
        int userSalary = 100;

        boolean isLessThatMinimalSalary = userSalary < minimalSalary;

        if (isBBBIndex && isSocialIndexApplied && isLessThatMinimalSalary) {
            return true;
        } else {
            return false;
        }
    }
}
