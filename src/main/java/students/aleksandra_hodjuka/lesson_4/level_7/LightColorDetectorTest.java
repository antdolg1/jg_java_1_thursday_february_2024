package students.aleksandra_hodjuka.lesson_4.level_7;

class LightColorDetectorTest {
    private LightColorDetector lightColorDetector;

    public LightColorDetectorTest(LightColorDetector lightColorDetector) {
        this.lightColorDetector = lightColorDetector;
    }

    public static void main(String[] args) {
        LightColorDetector lightDetector = new LightColorDetector();
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest(lightDetector);

        lightColorDetector.testViolet(405);
        lightColorDetector.testBlue(475);
        lightColorDetector.testGreen(505);
        lightColorDetector.testYellow(585);
        lightColorDetector.testOrange(619);
        lightColorDetector.testRed(620);
        lightColorDetector.testInvisible(760);
    }

    public void testResult(String testName, boolean result) {
        if (result) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

    public void testViolet(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        testResult("testViolet", result.equals("Violet"));
    }

    public void testBlue(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        testResult("testBlue", result.equals("Blue"));
    }

    public void testGreen(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        testResult("testGreen", result.equals("Green"));
    }

    public void testYellow(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        testResult("testYellow", result.equals("Yellow"));
    }

    public void testOrange(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        testResult("testOrange", result.equals("Orange"));
    }

    public void testRed(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        testResult("testRed", result.equals("Red"));
    }

    public void testInvisible(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        testResult("testInvisible", result.equals("Invisible Light"));
    }
}
