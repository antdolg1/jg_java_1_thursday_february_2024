package students.kristina_manevica.lesson_14.homework.level_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import students.kristina_manevica.lesson_14.homework.*;

import java.util.List;

public class FruitStorageTest {

    private static FruitStorage fruitStorage;
    List<Apple> allApples = fruitStorage.getAllApples();

    @BeforeAll
    static void setUp() {
        fruitStorage = new FruitStorage();
    }

    @Test
    void findAppleBy_GreenColor() {

        List<Apple> greenApples = fruitStorage.findApples(allApples,
                (Apple apple) -> "green".equals(apple.getColor()));

        Assertions.assertTrue(greenApples.stream()
                .allMatch(apple -> "green".equals(apple.getColor())));
    }

    @Test
    void findAppleBy_RedColor() {

        List<Apple> redApples = fruitStorage.findApples(allApples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });

        Assertions.assertTrue(redApples.stream()
                .allMatch(apple -> "red".equals(apple.getColor())));
    }

    @Test
    void findAppleBy_HeavyWeight() {

        List<Apple> heavyApples = fruitStorage.findApples(allApples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() >= 150;
            }
        });

        Assertions.assertTrue(heavyApples.stream()
                .allMatch(apple -> apple.getWeight() >= 150));
    }

    @Test
    void findAppleBy_LightWeight() {

        List<Apple> lightApples = fruitStorage.findApples(allApples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() < 150;
            }
        });

        Assertions.assertTrue(lightApples.stream()
                .allMatch(apple -> apple.getWeight() < 150));
    }






/*
    @Test
    void findAppleBy_YellowColor() {

        List<Apple> yellowApples = fruitStorage.findApplesByColor(allApples, "yellow");

        Assertions.assertEquals(2, yellowApples.size());

        for (Apple apple : yellowApples) {
            Assertions.assertEquals("yellow", apple.getColor());
        }
    }

    @Test
    void findAppleBy_NonExistingColor() {

        List<Apple> blackApples = fruitStorage.findApplesByColor(allApples, "black");

        Assertions.assertEquals(0, blackApples.size());
    }*/

}