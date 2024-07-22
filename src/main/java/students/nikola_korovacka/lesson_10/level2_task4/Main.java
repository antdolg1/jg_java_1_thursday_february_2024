package students.nikola_korovacka.lesson_10.level2_task4;

public class Main {
    public static void main(String[] args) {
        testDetector(new IfVersion());
        testDetector(new Switch());
        testDetector(new Array());
    }

    private static void testDetector(DayOfTheWeekDetector detector) {
        System.out.println("Testing: " + detector.getClass().getSimpleName());
        System.out.println("Day 1: " + detector.detectDayName(1));
        System.out.println("Day 2: " + detector.detectDayName(2));
        System.out.println("Day 3: " + detector.detectDayName(3));
        System.out.println("Day 4: " + detector.detectDayName(4));
        System.out.println("Day 5: " + detector.detectDayName(5));
        System.out.println("Day 6: " + detector.detectDayName(6));
        System.out.println("Day 7: " + detector.detectDayName(7));
        System.out.println("Day 0: " + detector.detectDayName(0));
        System.out.println("Day 8: " + detector.detectDayName(8));
        System.out.println();
    }
}
