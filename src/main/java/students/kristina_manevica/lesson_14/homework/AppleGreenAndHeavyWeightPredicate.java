package students.kristina_manevica.lesson_14.homework;

public class AppleGreenAndHeavyWeightPredicate implements ApplePredicate {

    public boolean test (Apple apple) {
        return "green".equals(apple.getColor())
                && apple.getWeight() >= 150;
    }
}