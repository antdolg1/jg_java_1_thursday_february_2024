package students.ruslan_k.lesson_4.level_5;

public class LCDTestApp {
    public static void main(String[] args) {
        int[] waveUpper = {200, 380, 450, 495, 570, 590, 620, 751};
        int[] waveLower = {379, 449, 494, 569, 589, 619, 750, 800};
        String[] waveColor = {"Invisible Light", "Violet", "Blue", "Green", "Yellow", "Orange", "Red", "Invisible Light"};
        LightColorDetector myLcd = new LightColorDetector();
        for (int i = 0; i < waveColor.length; i++) {
            boolean test = true;
            for (int j = waveUpper[i]; j <= waveLower[i]; j++) {
                if (!waveColor[i].equals(myLcd.getLightColor(j))) {
                    test = false;
                }
            }
            if (test) {
                System.out.printf("Test %s is passed\n", waveColor[i]);
            } else System.out.printf("Test %s is failed\n", waveColor[i]);
        }
    }
}
