package students.nikola_korovacka.lesson_14;

public class AppleGreenAndHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
