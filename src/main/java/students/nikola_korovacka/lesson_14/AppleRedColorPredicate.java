package students.nikola_korovacka.lesson_14;

public class AppleRedColorPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor());
    }
}

