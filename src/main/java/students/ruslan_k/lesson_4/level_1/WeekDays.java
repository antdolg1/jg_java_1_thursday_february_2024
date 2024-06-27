package students.ruslan_k.lesson_4.level_1;

import java.util.Scanner;

class WeekDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber;
        System.out.print("PLease enter number of day of the week : ");
        String message="Your choice is ";
        userNumber = scan.nextInt();
        switch (userNumber){
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
                System.out.println("Please make an appointment with the doctor (lesson 3 lvl 4)");
        }

    }
}
