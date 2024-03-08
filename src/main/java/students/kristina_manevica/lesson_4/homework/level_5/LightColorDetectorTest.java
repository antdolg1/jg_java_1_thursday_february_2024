package students.kristina_manevica.lesson_4.homework.level_5;

class LightColorDetectorTest {

    LightColorDetector lightColorDetector = new LightColorDetector();

    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        int number1 = 379;
        int number2 = 380;
        int number3 = 449;
        int number4 = 450;
        int number5 = 494;
        int number6 = 495;
        int number7 = 569;
        int number8 = 570;
        int number9 = 589;
        int number10 = 590;
        int number11 = 619;
        int number12 = 620;
        int number13 = 750;
        int number14 = 751;
        String expectedResult1 = "Violet";
        String expectedResult2 = "Blue";
        String expectedResult3 = "Green";
        String expectedResult4 = "Yellow";
        String expectedResult5 = "Orange";
        String expectedResult6 = "Red";
        String expectedResult7 = "Invisible Light";

        lightColorDetectorTest.colorTest(number2, expectedResult1);
        lightColorDetectorTest.colorTest(number3, expectedResult1);
        lightColorDetectorTest.colorTest(number4, expectedResult2);
        lightColorDetectorTest.colorTest(number5, expectedResult2);
        lightColorDetectorTest.colorTest(number6, expectedResult3);
        lightColorDetectorTest.colorTest(number7, expectedResult3);
        lightColorDetectorTest.colorTest(number8, expectedResult4);
        lightColorDetectorTest.colorTest(number9, expectedResult4);
        lightColorDetectorTest.colorTest(number10, expectedResult5);
        lightColorDetectorTest.colorTest(number11, expectedResult5);
        lightColorDetectorTest.colorTest(number12, expectedResult6);
        lightColorDetectorTest.colorTest(number13, expectedResult6);
        lightColorDetectorTest.colorTest(number1, expectedResult7);
        lightColorDetectorTest.colorTest(number14, expectedResult7);
    }

    public void colorTest(int waveLenght, String expectedResult) {

        String actualResult = lightColorDetector.colorDetector(waveLenght);
        System.out.println((actualResult.equals(expectedResult)) ? "Test Passed" : "Error!");
    }
}
