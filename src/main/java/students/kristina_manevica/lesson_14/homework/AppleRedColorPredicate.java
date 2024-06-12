package students.kristina_manevica.lesson_14.homework;

public class AppleRedColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor());
    }
}