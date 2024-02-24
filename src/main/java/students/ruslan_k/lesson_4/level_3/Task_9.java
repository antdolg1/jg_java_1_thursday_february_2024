package students.ruslan_k.lesson_4.level_3;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int userNr1, userNr2, userNr3;

        System.out.print("PLease enter new 1-st INT ");
        userNr1 = scan.nextInt();
        System.out.print("PLease enter new 2-nd INT ");
        userNr2 = scan.nextInt();
        System.out.print("PLease enter new 3-rd INT ");
        userNr3 = scan.nextInt();

        if(userNr1<userNr2 && userNr2<userNr3)
            System.out.println("All numbers are placed in an increasing order");
        else if(userNr3<userNr2 && userNr2<userNr1)
                System.out.println("All numbers are placed in an decreasing order");
            else
                System.out.println("Neither increasing nor decreasing order");
    }
}

