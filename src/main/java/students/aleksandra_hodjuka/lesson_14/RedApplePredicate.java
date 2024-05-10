package students.aleksandra_hodjuka.lesson_14;

public class RedApplePredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor());
    }
}
