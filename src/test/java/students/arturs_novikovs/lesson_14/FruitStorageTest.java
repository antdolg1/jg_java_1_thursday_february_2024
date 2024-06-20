package students.arturs_novikovs.lesson_14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.util.List;

class FruitStorageTest {

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

        List<Apple> redApples = fruitStorage.findApples(allApples,
                (Apple apple) -> "red".equals(apple.getColor()));

        Assertions.assertTrue(redApples.stream()
                .allMatch(apple -> "red".equals(apple.getColor())));
    }

    @Test
    void findAppleBy_HeavyWeight() {

        List<Apple> heavyApples = fruitStorage.findApples(allApples,
                (Apple apple) -> apple.getWeight() >= 150);

        Assertions.assertTrue(heavyApples.stream()
                .allMatch(apple -> apple.getWeight() >= 150));
    }

    @Test
    void findAppleBy_LightWeight() {

        List<Apple> lightApples = fruitStorage.findApples(allApples,
                (Apple apple) -> apple.getWeight() < 150);

        Assertions.assertTrue(lightApples.stream()
                .allMatch(apple -> apple.getWeight() < 150));
    }

    @Test
    void findAppleBy_GreenColor_And_HeavyWeight() {

        List<Apple> greenHeavyApples = fruitStorage.findApples(allApples,
                (Apple apple) -> "green".equals(apple.getColor()) && apple.getWeight() >= 150);

        Assertions.assertTrue(greenHeavyApples.stream()
                .allMatch(apple -> "green".equals(apple.getColor()) && apple.getWeight() >= 150));
    }

    @Test
    void findAppleBy_NonExistingColor() {

        List<Apple> blackApples = fruitStorage.findApples(allApples,
                (Apple apple) -> "black".equals(apple.getColor()));

        Assertions.assertEquals(0, blackApples.size());
    }
}