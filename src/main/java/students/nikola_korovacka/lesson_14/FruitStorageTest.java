package students.nikola_korovacka.lesson_14;


import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FruitStorageTest {

    private FruitStorage storage = new FruitStorage();

    @Test
    public void testFindGreenApples() {
        List<Apple> inventory = storage.getAllApples();
        List<Apple> greenApples = storage.findApples(inventory, new AppleGreenColorPredicate());
        assertEquals(3, greenApples.size());
    }

    @Test
    public void testFindRedApples() {
        List<Apple> inventory = storage.getAllApples();
        List<Apple> redApples = storage.findApples(inventory, new AppleRedColorPredicate());
        assertEquals(3, redApples.size());
    }

    @Test
    public void testFindHeavyApples() {
        List<Apple> inventory = storage.getAllApples();
        List<Apple> heavyApples = storage.findApples(inventory, new AppleHeavyWeightPredicate());
        assertEquals(4, heavyApples.size());
    }

    @Test
    public void testFindLightApples() {
        List<Apple> inventory = storage.getAllApples();
        List<Apple> lightApples = storage.findApples(inventory, new AppleLightWeightPredicate());
        assertEquals(4, lightApples.size());
    }

    @Test
    public void testFindGreenAndHeavyApples() {
        List<Apple> inventory = storage.getAllApples();
        List<Apple> greenAndHeavyApples = storage.findApples(inventory, new AppleGreenAndHeavyWeightPredicate());
        assertEquals(1, greenAndHeavyApples.size());
    }

    @Test
    public void testFindGreenApplesWithLambda() {
        List<Apple> inventory = storage.getAllApples();
        List<Apple> greenApples = storage.findApples(inventory, (Apple apple) -> "green".equals(apple.getColor()));
        assertEquals(3, greenApples.size());
    }

    @Test
    public void testFindRedApplesWithLambda() {
        List<Apple> inventory = storage.getAllApples();
        List<Apple> redApples = storage.findApples(inventory, (Apple apple) -> "red".equals(apple.getColor()));
        assertEquals(3, redApples.size());
    }

    @Test
    public void testFindHeavyApplesWithLambda() {
        List<Apple> inventory = storage.getAllApples();
        List<Apple> heavyApples = storage.findApples(inventory, (Apple apple) -> apple.getWeight() > 150);
        assertEquals(4, heavyApples.size());
    }

    @Test
    public void testFindLightApplesWithLambda() {
        List<Apple> inventory = storage.getAllApples();
        List<Apple> lightApples = storage.findApples(inventory, (Apple apple) -> apple.getWeight() < 150);
        assertEquals(4, lightApples.size());
    }
}
