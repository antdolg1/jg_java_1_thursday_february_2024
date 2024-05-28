package students.arturs_novikovs.lesson_4.home_work;
import java.util.Scanner;
class DayOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        System.out.print("Please enter number from 1-7");
        String message = "Your choice is ";
        userNumber = scanner.nextInt();
        switch (userNumber) {
            case 1:
                System.out.println(message + "Monday");
                break;
            case 2:
                System.out.println(message + "Tuesday");
                break;
            case 3:
                System.out.println(message + "Wednesday");
                break;
            case 4:
                System.out.println(message + "Thursday");
                break;
            case 5:
                System.out.println(message + "Friday");
                break;
            case 6:
                System.out.println(message + "Saturday");
                break;
            case 7:
                System.out.println(message + "Sunday");
                break;
            default:
                System.out.println(message + "wrong number. I ask number from 1 till 7!");
        }
    }
}
