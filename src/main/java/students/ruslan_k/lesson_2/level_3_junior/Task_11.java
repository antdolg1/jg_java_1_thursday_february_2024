package students.ruslan_k.lesson_2.level_3_junior;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result=0;
        for (int i=1; i<=3; i++) {
            System.out.print(i + " number : ");
            int a = scan.nextInt();
            result +=a;
        }

        System.out.println("Average is " + result/3.0 );
    }
}
