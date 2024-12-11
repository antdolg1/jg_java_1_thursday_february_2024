package students.ruslan_k.lesson_14.level_1;

public class FindGreenApple implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green");
    }
}
