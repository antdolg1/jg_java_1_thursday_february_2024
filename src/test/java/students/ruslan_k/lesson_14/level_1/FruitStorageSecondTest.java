package students.ruslan_k.lesson_14.level_1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageSecondTest {

    List<Apple> dataForTest;
    FruitStorage apples = new FruitStorage();

    @Test
    public void findGreenApplesTest() {
        int expectValue = 340;
        dataForTest = apples.getAllApples();
        List<Apple> actualList;
        int realCountOfApples = 0;

        actualList = apples.findApples(dataForTest, new FindGreenApple());
        for (Apple element : actualList) {
            realCountOfApples += element.getWeight();
        }
        Assertions.assertEquals(expectValue, realCountOfApples);
    }

    @Test
    public void findRedApplesTest() {
        int expectValue = 460;
        dataForTest = apples.getAllApples();
        List<Apple> actualList;
        int realCountOfApples = 0;
        actualList = apples.findApples(dataForTest, new FindRedApple());
        for (Apple element : actualList) {
            realCountOfApples += element.getWeight();
        }
        Assertions.assertEquals(expectValue, realCountOfApples);
    }

    @Test
    public void findLightApplesTest() {
        int expectValue = 290;
        dataForTest = apples.getAllApples();
        List<Apple> actualList;

        int realCountOfApples = 0;
        actualList = apples.findApples(dataForTest, new FindLightApple());
        for (Apple element : actualList) {
            realCountOfApples += element.getWeight();
        }
        Assertions.assertEquals(expectValue, realCountOfApples);
    }

    @Test
    public void findHeavyApplesTest() {
        int expectValue = 730;
        dataForTest = apples.getAllApples();
        List<Apple> actualList;

        int realCountOfApples = 0;
        actualList = apples.findApples(dataForTest, new FindHeavyApple());
        for (Apple element : actualList) {
            realCountOfApples += element.getWeight();
        }
        Assertions.assertEquals(expectValue, realCountOfApples);
    }

    @Test
    public void findHeavyGreenApplesTest() {
        int expectValue = 200;
        dataForTest = apples.getAllApples();
        List<Apple> actualList;

        int realCountOfApples = 0;
        actualList = apples.findApples(dataForTest, new FindHeavyGreenApple());
        for (Apple element : actualList) {
            realCountOfApples += element.getWeight();
        }
        Assertions.assertEquals(expectValue, realCountOfApples);
    }




}