package students.aleksandra_hodjuka.lesson_4.level_7;

public class LeapYearTest {
    public static void main(String[] args) {
        testIsLeapYear();
    }

    public static void testIsLeapYear() {
        LeapYear leapYear = new LeapYear();

        int[] leapYears = {1600, 2000, 2004, 2400};
        int[] nonLeapYears = {1700, 1800, 1900, 2100, 2200, 2300};

        // Проверяем високосные года
        System.out.println("Testing leap years:");
        for (int year : leapYears) {
            if (leapYear.isLeapYear(year)) {
                System.out.println(year + " is a leap year. Test passed.");
            } else {
                System.out.println(year + " is NOT a leap year. Test failed.");
            }
        }

        // Проверяем обычные года
        System.out.println("\nTesting non-leap years:");
        for (int year : nonLeapYears) {
            if (!leapYear.isLeapYear(year)) {
                System.out.println(year + " is NOT a leap year. Test passed.");
            } else {
                System.out.println(year + " is a leap year. Test failed.");
            }
        }
    }

}
