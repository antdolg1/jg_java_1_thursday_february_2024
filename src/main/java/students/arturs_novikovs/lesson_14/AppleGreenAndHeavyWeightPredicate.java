package students.arturs_novikovs.lesson_14;

public class AppleGreenAndHeavyWeightPredicate implements ApplePredicate{
    public boolean test (Apple apple) {
        return "green".equals(apple.getColor())
                && apple.getWeight() >= 150;
    }
}
