package teacher.lesson_13.lessoncode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @ParameterizedTest
    @CsvSource({"Hello, 5", "Junit, 5", "Testing, 7"})
    void getStringLength(String str, int expectedResult) {
        int actualResult = StringUtils.getStringLenght(str);
        assertEquals(expectedResult, actualResult);
    }

}