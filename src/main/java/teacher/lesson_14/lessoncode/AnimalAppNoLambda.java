package teacher.lesson_14.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class AnimalAppNoLambda {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        Animal animal1 = new Animal("shark", false, true);
        animals.add(animal1);

        animals.add(new Animal("duck", true, true));
        animals.add(new Animal("dog", false, true));
        animals.add(new Animal("kangaroo", false, false));
        animals.add(new Animal("eagle", true, false));

        printInfo(animals, new CheckCanFly());
        System.out.println();
        printInfo(animals, new CheckCanSwim());
    }

    private static void printInfo(List<Animal> animals, Checker checker) {
        for (Animal animal : animals) {
            if (checker.checkCanFlyOrSwim(animal)) {
                System.out.println(animal + " ");
            }
        }
        System.out.println();
    }
}
