package students.kristina_manevica.lesson_14.homework;

public class AppleHeavyWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() >= 150;
    }
}