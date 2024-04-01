package students.aleksandra_hodjuka.lesson_4.level_5;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        testVioletColor();
        testBlueColor();
        testGreenColor();
        testYellowColor();
        testOrangeColor();
        testRedColor();
        testInvisibleLight();
    }

    private static void testInvisibleLight() {
        LightColorDetector detector = new LightColorDetector();
        String result1 = detector.detect(380);
        String result2 = detector.detect(449);
        if (result1.equals("Violet") && result2.equals("Violet")) {
            System.out.println("Violet Color Test: Passed");
        } else {
            System.out.println("Violet Color Test: Failed");
        }
    }

    private static void testRedColor() {
        LightColorDetector detector = new LightColorDetector();
        String result1 = detector.detect(620);
        String result2 = detector.detect(750);
        if (result1.equals("Red") && result2.equals("Red")) {
            System.out.println("Red Color Test: Passed");
        } else {
            System.out.println("Red Color Test: Failed");
        }

    }

    private static void testOrangeColor() {
        LightColorDetector detector = new LightColorDetector();
        String result1 = detector.detect(590);
        String result2 = detector.detect(619);
        if (result1.equals("Orange") && result2.equals("Orange")) {
            System.out.println("Orange Color Test: Passed");
        } else {
            System.out.println("Orange Color Test: Failed");
        }
    }

    private static void testYellowColor() {
        LightColorDetector detector = new LightColorDetector();
        String result1 = detector.detect(570);
        String result2 = detector.detect(589);
        if (result1.equals("Yellow") && result2.equals("Yellow")) {
            System.out.println("Yellow Color Test: Passed");
        } else {
            System.out.println("Yellow Color Test: Failed");
        }
    }

    private static void testGreenColor() {
        LightColorDetector detector = new LightColorDetector();
        String result1 = detector.detect(495);
        String result2 = detector.detect(569);
        if (result1.equals("Green") && result2.equals("Green")) {
            System.out.println("Green Color Test: Passed");
        } else {
            System.out.println("Green Color Test: Failed");
        }

    }

    private static void testBlueColor() {
        LightColorDetector detector = new LightColorDetector();
        String result1 = detector.detect(450);
        String result2 = detector.detect(494);
        if (result1.equals("Blue") && result2.equals("Blue")) {
            System.out.println("Blue Color Test: Passed");
        } else {
            System.out.println("Blue Color Test: Failed");
        }

    }

    private static void testVioletColor() {
        LightColorDetector detector = new LightColorDetector();
        String result1 = detector.detect(380);
        String result2 = detector.detect(449);
        if (result1.equals("Violet") && result2.equals("Violet")) {
            System.out.println("Violet Color Test: Passed");
        } else {
            System.out.println("Violet Color Test: Failed");
        }
    }
}
