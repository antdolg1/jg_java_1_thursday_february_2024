package students.ruslan_k.lesson_6.level_2;


import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {

        String dayName;
        int dayNumber = DayOfTheWeekDetector.getDayNumber();
        dayName = DayOfTheWeekDetector.getDayName(dayNumber);
        if (dayName != null) {
            System.out.printf("Day of a week with number %s was named \"%s\" (ISO 8601). \n", dayNumber, dayName);
            System.out.println("Exception USA, Israel, Canada and some of African countries");
            System.out.printf("Short name is \"%s\"\n", DayOfTheWeekDetector.getShortDayName(dayNumber));
        } else {
            System.out.println("For You laws have never been written !");
        }
    }
}

class DayOfTheWeekDetector {

    static int getDayNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    static String getDayName(int dayNumber) {
        String[] dayName = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (dayNumber >= 1 && dayNumber <= 7) {
            return dayName[dayNumber - 1];
        } else {
            return null;
        }
    }

    static String getShortDayName(int dayNumber) {
        switch (dayNumber) {
            case 1 -> {
                return "Mon";
            }
            case 2 -> {
                return "Tue";
            }
            case 3 -> {
                return "Wed";
            }
            case 4 -> {
                return "Thu";
            }
            case 5 -> {
                return "Fri";
            }
            case 6 -> {
                return "Sat";
            }
            case 7 -> {
                return "Sun";
            }
            default -> {
                return null;
            }
        }
    }

    static String getShortDayName(String dayName) {
        switch (dayName) {
            case "Monday" -> {
                return "Mon";
            }
            case "Tuesday" -> {
                return "Tue";
            }
            case "Wednesday" -> {
                return "Wed";
            }
            case "Thursday" -> {
                return "Thu";
            }
            case "Friday" -> {
                return "Fri";
            }
            case "Saturday" -> {
                return "Sat";
            }
            case "Sunday" -> {
                return "Sun";
            }
            default -> {
                return null;
            }
        }
    }
}