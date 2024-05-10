package students.aleksandra_hodjuka.lesson_14;

public class HeavyApplePredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
