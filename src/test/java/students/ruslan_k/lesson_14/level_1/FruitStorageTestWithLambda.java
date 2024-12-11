package students.ruslan_k.lesson_14.level_1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;


public class FruitStorageTestWithLambda {
    List<Apple> dataForTest;
    FruitStorage apples = new FruitStorage();

    @Test
    public void findRedApplesTestUsedLambda() {
        int expectValue = 460;
        dataForTest = apples.getAllApples();
        List<Apple> actualList = apples.findApples(dataForTest,
                (Apple apple)->"red".equals(apple.getColor()));

        int realCountOfApples = 0;
        for (Apple element : actualList) {
            realCountOfApples += element.getWeight();
        }
        Assertions.assertEquals(expectValue, realCountOfApples);
    }

    @Test
    public void findGreenApplesTestUsedLambda() {
        int expectValue = 340;
        dataForTest = apples.getAllApples();
        List<Apple> actualList = apples.findApples(dataForTest,
                (Apple apple)-> "green".equals(apple.getColor()));

        int realCountOfApples = 0;
        for (Apple element : actualList) {
            realCountOfApples += element.getWeight();
        }
        Assertions.assertEquals(expectValue, realCountOfApples);
    }

    @Test
    public void findLightApplesTestUsedLambda() {
        int expectValue = 290;
        dataForTest = apples.getAllApples();
        List<Apple> actualList = apples.findApples(dataForTest,
                (Apple apple) -> apple.getWeight() < 150);

        int realCountOfApples = 0;
        for (Apple element : actualList) {
            realCountOfApples += element.getWeight();
        }
        Assertions.assertEquals(expectValue, realCountOfApples);
    }

    @Test
    public void findHeavyApplesTestUsedLambda() {
        int expectValue = 730;
        dataForTest = apples.getAllApples();
        List<Apple> actualList = apples.findApples(dataForTest,
                (Apple apple) -> apple.getWeight() > 150);

        int realCountOfApples = 0;
        for (Apple element : actualList) {
            realCountOfApples += element.getWeight();
        }
        Assertions.assertEquals(expectValue, realCountOfApples);
    }


}