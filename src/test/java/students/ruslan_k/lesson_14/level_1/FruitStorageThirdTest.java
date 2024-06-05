package students.ruslan_k.lesson_14.level_1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static org.junit.Assert.*;


public class FruitStorageThirdTest {

    List<Apple> dataForTest;
    FruitStorage apples = new FruitStorage();

    @Test
    public void findRedApplesTestUsedAnonymousClass() {
        int expectValue = 460;
        dataForTest = apples.getAllApples();
        List<Apple> actualList = apples.findApples(dataForTest,
                new ApplePredicate()
                {
                    public boolean test(Apple apple){
                        return "red".equals(apple.getColor());
                    }
                }
        );

        int realCountOfApples = 0;
        for (Apple element : actualList) {
            realCountOfApples += element.getWeight();
        }
        Assertions.assertEquals(expectValue, realCountOfApples);
    }

    @Test
    public void findGreenApplesTestUsedAnonymousClass() {
        int expectValue = 340;
        dataForTest = apples.getAllApples();
        List<Apple> actualList = apples.findApples(dataForTest,
                new ApplePredicate()
                {
                    public boolean test(Apple apple){
                        return "green".equals(apple.getColor());
                    }
                }
        );

        int realCountOfApples = 0;
        for (Apple element : actualList) {
            realCountOfApples += element.getWeight();
        }
        Assertions.assertEquals(expectValue, realCountOfApples);
    }

    @Test
    public void findLightApplesTestUsedAnonymousClass() {
        int expectValue = 290;
        dataForTest = apples.getAllApples();
        List<Apple> actualList = apples.findApples(dataForTest,
                new ApplePredicate()
                {
                    public boolean test(Apple apple){
                        return apple.getWeight()<150;
                    }
                }
        );

        int realCountOfApples = 0;
        for (Apple element : actualList) {
            realCountOfApples += element.getWeight();
        }
        Assertions.assertEquals(expectValue, realCountOfApples);
    }

    @Test
    public void findHeavyApplesTestUsedAnonymousClass() {
        int expectValue = 730;
        dataForTest = apples.getAllApples();
        List<Apple> actualList = apples.findApples(dataForTest,
                new ApplePredicate()
                {
                    public boolean test(Apple apple){
                        return apple.getWeight()>150;
                    }
                }
        );

        int realCountOfApples = 0;
        for (Apple element : actualList) {
            realCountOfApples += element.getWeight();
        }
        Assertions.assertEquals(expectValue, realCountOfApples);
    }
}