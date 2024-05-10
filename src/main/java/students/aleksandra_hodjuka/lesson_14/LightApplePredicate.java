package students.aleksandra_hodjuka.lesson_14;

public class LightApplePredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() < 150;
    }
}
