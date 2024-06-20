package students.arturs_novikovs.lesson_14;

public class AppleHeavyWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple){
        return apple.getWeight()>=150;
    }
}
