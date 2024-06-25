package students.nikola_korovacka.lesson_14;

public class AppleLightWeightPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return apple.getWeight() < 150;
    }
}

