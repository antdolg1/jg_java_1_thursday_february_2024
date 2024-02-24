package students.ruslan_k.lesson_4.level_3;

import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int userNr1, userNr2, userNr3;

        System.out.print("PLease enter new 1-st INT ");
        userNr1 = scan.nextInt();
        System.out.print("PLease enter new 2-nd INT ");
        userNr2 = scan.nextInt();
        System.out.print("PLease enter new 3-rd INT ");
        userNr3 = scan.nextInt();
/*
        boolean test1=userNr1 == userNr2;
        boolean test2=userNr2 == userNr3;
        boolean test3=userNr1 == userNr3;
        if(test1 && test2)
            System.out.println("All numbers are equal");
        else if(test1)
        {
            System.out.println("1-st and 2-nd numbers are equals");
        }
        else if (test2)
        {
            System.out.println("2-nd and 3-rd numbers are equals");
        }
        else if (test3)
        {
            System.out.println("1-st and 3-rd numbers are equals");
        }
        else
        {
            System.out.println("All numbers are different");
        }
*/
    int result=0;
    result=(userNr1 == userNr2) ? result ^ 1 : result;
    result=(userNr2 == userNr3) ? result ^ 2 : result;
    result=(userNr3 == userNr1) ? result ^ 4 : result;
    switch (result){
        case 0:
            System.out.println("All numbers are different");
            break;
        case 1 :
            System.out.println("1-st and 2-nd numbers are equals");
            break;
        case 2:
            System.out.println("2-nd and 3-rd numbers are equals");
            break;
        case 4  :
            System.out.println("1-st and 3-rd numbers are equals");
            break;
        default:
            System.out.println("All numbers are equal");
            break;

    }
        // System.out.println(result);




    }
}
