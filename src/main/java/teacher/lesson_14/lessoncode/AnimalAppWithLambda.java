package teacher.lesson_14.lessoncode;

import java.util.ArrayList;
import java.util.List;


public class AnimalAppWithLambda {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        Animal animal1 = new Animal("shark", false, true);
        animals.add(animal1);

        animals.add(new Animal("duck", true, true));
        animals.add(new Animal("dog", false, true));
        animals.add(new Animal("kangaroo", false, false));
        animals.add(new Animal("eagle", true, false));

        printInfo(animals, (Animal a) -> {
            return a.isCanSwim();
        });

        printInfo(animals, a -> a.isCanFly()); //тоже самое что printInfo(animals, new CheckCanFly());

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
