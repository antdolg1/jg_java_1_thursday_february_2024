package students.arturs_novikovs.lesson_14;

public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple){
        return "green".equals(apple.getColor());
    }
}
