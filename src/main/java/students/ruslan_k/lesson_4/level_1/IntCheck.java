package students.ruslan_k.lesson_4.level_1;

import java.util.Scanner;

class IntCheck {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int userNumber;
        System.out.print("PLease enter new INT ");
        userNumber=scan.nextInt();
        if(userNumber >0) {
            System.out.printf("%s is an positive number \n", userNumber);
        } else if (userNumber < 0){
            System.out.printf("%s is an negative number \n", userNumber);
        }
    }

}
