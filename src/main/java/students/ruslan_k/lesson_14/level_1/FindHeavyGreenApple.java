package students.ruslan_k.lesson_14.level_1;

public class FindHeavyGreenApple implements ApplePredicate{
    private static final int REFERENCE_WEIGHT = 150;
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green") && apple.getWeight()> REFERENCE_WEIGHT;
    }
}
