package students.ruslan_k.lesson_4.level_2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int userNumber1, userNumber2;

        System.out.print("PLease enter new 1-st INT ");
        userNumber1 = scan.nextInt();
        System.out.print("PLease enter new 2-nd INT ");
        userNumber2 = scan.nextInt();
        if(userNumber1==userNumber2){
            System.out.println("Both numbers are equals");
        }
        else if (userNumber1 > userNumber2) {
            System.out.printf("%s is greater \n", userNumber1);
        } else {
            System.out.printf("%s is greater \n", userNumber2);
        }
    }
}
