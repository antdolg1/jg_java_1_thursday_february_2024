package students.kristina_manevica.lesson_14.homework.level_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FruitStorageTest {

    private static FruitStorage fruitStorage;

    @BeforeAll
    static void setUp() {
        fruitStorage = new FruitStorage();


        // List<Apple> redApples = fruitStorage.findAppleByColor(allApples, "red");
        //  List<Apple> yellowApples = fruitStorage.findAppleByColor(allApples, "yellow");
        // List<Apple> blackApples = fruitStorage.findAppleByColor(allApples, "black");
    }

    @Test
    void findAppleBy_GreenColor() {
        List<Apple> allApples = fruitStorage.getAllApples();
        List<Apple> greenApples = fruitStorage.findApplesByColor(allApples, "green");

        Assertions.assertEquals(3, greenApples.size());

        for (Apple apple: greenApples){
            Assertions.assertEquals("green", apple.getColor());
        }
    }

}