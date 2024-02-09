package students.ruslan_k.lesson_2;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        System.out.print("Please input INT: ");
        int source = scan.nextInt();
        for(i=1; i<=10; i++)
            System.out.println(source + " x " + i + " = " + source*i);


    }
}
