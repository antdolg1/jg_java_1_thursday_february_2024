package students.ruslan_k.lesson_4.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNr1;  //userNr2, userNr3;

        /*
        System.out.print("PLease enter new 1-st INT ");
        userNr1 = scan.nextInt();
        System.out.print("PLease enter new 2-nd INT ");
        userNr2 = scan.nextInt();
        System.out.print("PLease enter new 3-rd INT ");
        userNr3 = scan.nextInt();
        int resultat=userNr1;
        resultat = resultat<userNr2 ? userNr2 : resultat;
        resultat = resultat<userNr3 ? userNr3 : resultat;
        System.out.printf("%s is MAX \n", resultat);
        */

        int result=0;
        for (int i=1; i<=3 ;i++)
        {
            System.out.printf("PLease enter new %s INT ", i);
            userNr1 = scan.nextInt();
            result=result<userNr1?userNr1: result;
        }
        System.out.printf("%s is MAX \n", result);
    }
}
