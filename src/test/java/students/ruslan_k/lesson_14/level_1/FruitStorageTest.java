package students.ruslan_k.lesson_14.level_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

public class FruitStorageTest {

    List<Apple> dataForTest;
    FruitStorage apples = new FruitStorage();


    @ParameterizedTest
    @CsvSource({"green, 340", "red, 460", "yellow, 220"})
    public void testGetApplesByColorWithDifferentColor(String color, int expectValue) {
        dataForTest = apples.getAllApples();
        List<Apple> actualList;
        int realCountOfApples = 0;
        actualList = apples.getApplesByColor(dataForTest, color);
        for (Apple element : actualList) {
            realCountOfApples += element.getWeight();
        }
        Assertions.assertEquals(expectValue, realCountOfApples);

    }

}