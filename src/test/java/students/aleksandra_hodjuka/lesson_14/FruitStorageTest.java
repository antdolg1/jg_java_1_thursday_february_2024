package students.aleksandra_hodjuka.lesson_14;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {
    @Test
    public void testGetAllApplesNotEmpty() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> allApples = fruitStorage.getAllApples();
        assertNotNull(allApples);
        assertFalse(allApples.isEmpty());
    }

    @Test
    public void testGetAllApplesContainsRedApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> allApples = fruitStorage.getAllApples();
        boolean containsRedApples = allApples.stream().anyMatch(apple -> "red".equals(apple.getColor()));
        assertTrue(containsRedApples);
    }

    @Test
    public void testGetAllApplesContainsGreenApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> allApples = fruitStorage.getAllApples();
        boolean containsGreenApples = allApples.stream().anyMatch(apple -> "green".equals(apple.getColor()));
        assertTrue(containsGreenApples);
    }

    @Test
    public void testGetAllApplesContainsYellowApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> allApples = fruitStorage.getAllApples();
        boolean containsYellowApples = allApples.stream().anyMatch(apple -> "yellow".equals(apple.getColor()));
        assertTrue(containsYellowApples);
    }

    @Test
    public void testFindApplesByColor() {
        // Arrange
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> inventory = fruitStorage.getAllApples();

        // Act
        List<Apple> greenApples = fruitStorage.findApplesByColorAndWeight(inventory, "green", 50, 200);
        List<Apple> redApples = fruitStorage.findApplesByColorAndWeight(inventory, "red", 100, 200);
        List<Apple> yellowApples = fruitStorage.findApplesByColorAndWeight(inventory, "yellow", 50, 170);

        // Assert
        assertEquals(3, greenApples.size());  // Проверяем количество зеленых яблок
        assertEquals(3, redApples.size());    // Проверяем количество красных яблок
        assertEquals(2, yellowApples.size()); // Проверяем количество желтых яблок
    }

    @Test
    public void testFindApplesByColorAndWeight() {
        // Arrange
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> inventory = fruitStorage.getAllApples();

        // Act
        List<Apple> heavyGreenApples = fruitStorage.findApplesByColorAndWeight(inventory, "green", 50, Integer.MAX_VALUE);
        List<Apple> lightRedApples = fruitStorage.findApplesByColorAndWeight(inventory, "red", 100, Integer.MAX_VALUE);
        List<Apple> heavyYellowApples = fruitStorage.findApplesByColorAndWeight(inventory, "yellow", 50, Integer.MAX_VALUE);

        // Assert
        assertEquals(3, heavyGreenApples.size());    // Проверяем количество тяжелых зеленых яблок
        assertEquals(3, lightRedApples.size());     // Проверяем количество легких красных яблок
        assertEquals(2, heavyYellowApples.size());  // Проверяем количество тяжелых желтых яблок
    }


//    @Test
//    public void testFindRedApples() {
//        FruitStorage fruitStorage = new FruitStorage();
//        List<Apple> inventory = fruitStorage.getAllApples();
//        List<Apple> redApples = fruitStorage.findApples(inventory, new ApplePredicate() {
//            @Override
//            public boolean test(Apple apple) {
//                return "red".equals(apple.getColor());
//            }
//        });
//        assertFalse(redApples.isEmpty());
//        for (Apple apple : redApples) {
//            assertEquals("red", apple.getColor());
//        }
//    }

    @Test
    public void testFindRedApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> redApples = fruitStorage.findApples(inventory, apple -> "red".equals(apple.getColor()));
        assertFalse(redApples.isEmpty());
        for (Apple apple : redApples) {
            assertEquals("red", apple.getColor());
        }
    }

    @Test
    public void testFindGreenApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> greenApples = fruitStorage.findApples(inventory, apple -> "green".equals(apple.getColor()));
        assertFalse(greenApples.isEmpty());
        for (Apple apple : greenApples) {
            assertEquals("green", apple.getColor());
        }
    }


//    @Test
//    public void testFindHeavyApples() {
//        FruitStorage fruitStorage = new FruitStorage();
//        List<Apple> inventory = fruitStorage.getAllApples();
//        List<Apple> heavyApples = fruitStorage.findApples(inventory, new ApplePredicate() {
//            @Override
//            public boolean test(Apple apple) {
//                return apple.getWeight() > 150;
//            }
//        });
//        assertFalse(heavyApples.isEmpty());
//        for (Apple apple : heavyApples) {
//            assertTrue(apple.getWeight() > 150);
//        }
//    }

    @Test
    public void testFindHeavyApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> heavyApples = fruitStorage.findApples(inventory, apple -> apple.getWeight() > 150);
        assertFalse(heavyApples.isEmpty());
        for (Apple apple : heavyApples) {
            assertTrue(apple.getWeight() > 150);
        }
    }
//    @Test
//    public void testFindLightApples() {
//        FruitStorage fruitStorage = new FruitStorage();
//        List<Apple> inventory = fruitStorage.getAllApples();
//        List<Apple> lightApples = fruitStorage.findApples(inventory, new ApplePredicate() {
//            @Override
//            public boolean test(Apple apple) {
//                return apple.getWeight() < 150;
//            }
//        });
//        assertFalse(lightApples.isEmpty());
//        for (Apple apple : lightApples) {
//            assertTrue(apple.getWeight() < 150);
//        }
//    }

    @Test
    public void testFindLightApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> lightApples = fruitStorage.findApples(inventory, apple -> apple.getWeight() < 150);
        assertFalse(lightApples.isEmpty());
        for (Apple apple : lightApples) {
            assertTrue(apple.getWeight() < 150);
        }
    }
//    @Test
//    public void testFindHeavyGreenApples() {
//        FruitStorage fruitStorage = new FruitStorage();
//        List<Apple> inventory = fruitStorage.getAllApples();
//        List<Apple> heavyGreenApples = fruitStorage.findApples(inventory, new HeavyGreenApplePredicate());
//        assertFalse(heavyGreenApples.isEmpty());
//        for (Apple apple : heavyGreenApples) {
//            assertTrue(apple.getWeight() > 150);
//            assertEquals("green", apple.getColor());
//        }
//    }
@Test
public void testFindHeavyGreenApples() {
    FruitStorage fruitStorage = new FruitStorage();
    List<Apple> inventory = fruitStorage.getAllApples();
    List<Apple> heavyGreenApples = fruitStorage.findApples(inventory, apple -> apple.getWeight()> 150 && "green".equals(apple.getColor()));
    assertFalse(heavyGreenApples.isEmpty());
    for (Apple apple : heavyGreenApples) {
        assertTrue(apple.getWeight() > 150);
        assertEquals("green", apple.getColor());
    }
}
}