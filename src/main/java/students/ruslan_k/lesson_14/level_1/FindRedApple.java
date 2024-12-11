package students.ruslan_k.lesson_14.level_1;

public class FindRedApple implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("red");
    }
}
