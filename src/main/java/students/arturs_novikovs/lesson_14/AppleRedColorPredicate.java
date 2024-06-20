package students.arturs_novikovs.lesson_14;

public class AppleRedColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple){
        return "red".equals(apple.getColor());
    }
}
