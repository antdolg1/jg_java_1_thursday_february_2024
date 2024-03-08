package students.ruslan_k.lesson_4.level_1;

import java.util.Scanner;

class IntCheckThree {
    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);

        int userNumber;
        System.out.print("PLease enter new INT ");
        userNumber=scan.nextInt();
        if(userNumber % 2 ==0) {
            System.out.printf("%s is an even number \n", userNumber);
        } else {
            System.out.printf("%s is an odd number \n", userNumber);

        }
    }
}
