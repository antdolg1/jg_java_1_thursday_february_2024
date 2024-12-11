package students.ruslan_k.lesson_14.level_1;

public class FindHeavyApple implements ApplePredicate{
    private static final int ETHALON_WEIGHT = 150;
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > ETHALON_WEIGHT;
    }
}
