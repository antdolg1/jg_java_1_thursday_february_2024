//до 12 таска
package students.nikita_bortnikovs.lesson14.level1;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class FruitStorageTest {

    @Test
    public void main() {

        FruitStorage storage = new FruitStorage();
        List<Apple> greenApples = storage.getGreenApples();
        List<Apple> redApples = storage.getRedApples();
        List<Apple> yellowApples = storage.findApplesByColor(storage.getAllApples(), "yellow");
        List<Apple> heavyApples = storage.findApplesByWeight(storage.getAllApples(), 150);
        List<Apple> lightweightApples = storage.findApplesByWeight(storage.getAllApples(), 50);
        List<Apple> greenGreenApples = FruitStorage.findApples(storage.getAllApples(), new ApplePredicate.AppleGreenColorPredicate());
        List<Apple> redRedApples = FruitStorage.findApples(storage.getAllApples(), new ApplePredicate.AppleRedColorPredicate());
        List<Apple> heavyHeavyApples = FruitStorage.findApples(storage.getAllApples(), new ApplePredicate.AppleHeavyWeightPredicate());
        List<Apple> lightLightWeightApples = FruitStorage.findApples(storage.getAllApples(), new ApplePredicate.AppleLightWeightPredicate());

        Assert.assertTrue(greenApples.stream().allMatch(apple -> "green".equals(apple.getColor())),
                "all green apples are green");

        Assert.assertTrue(greenApples.stream().anyMatch(apple -> apple.getWeight() == 200),
                "should be apple of a 200g weight");
        Assert.assertTrue(greenApples.stream().anyMatch(apple -> apple.getWeight() == 90),
                "should be apple of a 90g weight");
        Assert.assertTrue(greenApples.stream().anyMatch(apple -> apple.getWeight() == 50),
                "should be apple of a 50 weight");

        Assert.assertTrue(redApples.stream().allMatch(apple -> "red".equals(apple.getColor())),
                "all red apples are red");

        Assert.assertTrue(redApples.stream().anyMatch(apple -> apple.getWeight() == 100),
                "should be red apple of a 100 weight");
        Assert.assertTrue(redApples.stream().anyMatch(apple -> apple.getWeight() == 160),
                "should be red apple of a 160 weight");
        Assert.assertTrue(redApples.stream().anyMatch(apple -> apple.getWeight() == 200),
                "should be red apple of a 200 weight");


        assertTrue(yellowApples.stream().allMatch(apple -> "yellow".equals(apple.getColor())),
                "all yellow apples are yellow");
        assertTrue(yellowApples.stream().anyMatch(apple -> apple.getWeight() == 50),
                "should be red apple of a 50 weight");
        assertTrue(yellowApples.stream().anyMatch(apple -> apple.getWeight() == 170),
                "should be red apple of a 170 weight");

        assertEquals(4, heavyApples.size(), "should be 4 apples of more then 150g");


        assertEquals(3, greenGreenApples.size());
        assertTrue(greenGreenApples.stream().allMatch(apple -> "green".equals(apple.getColor())));

        assertEquals(3, redRedApples.size());
        assertTrue(redRedApples.stream().allMatch(apple -> "red".equals(apple.getColor())));

        assertEquals(4, heavyHeavyApples.size());
        assertTrue(heavyHeavyApples.stream().allMatch(apple -> apple.getWeight() > 150));

        assertEquals(4, lightLightWeightApples.size());
        assertTrue(lightLightWeightApples.stream().allMatch(apple -> apple.getWeight() < 150));
    }

    ;
};
