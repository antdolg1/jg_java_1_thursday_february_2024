package students.aleksandra_hodjuka.lesson_14;

public class GreenApplePredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
