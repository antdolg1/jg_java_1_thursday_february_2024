package students.nikita_bortnikovs.lesson_2.level_1;

import java.util.Scanner;

public class level_1_2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number on the next line...");
        double A = scanner.nextDouble();
        System.out.println("Please enter second number on the next line...");
        double B = scanner.nextDouble();

        double sum = A + B;
        double sub = A - B;
        double mult = A * B;
        double div = A / B;

        System.out.println("The sum of "+ A +" and "+ B +" is equal to "+ sum);
        System.out.println("The sub of "+ A +" and "+ B +" is equal to "+ sub);
        System.out.println("The mult of "+ A +" and "+ B +" is equal to "+ mult);
        System.out.println("The div of "+ A +" and "+ B +" is equal to "+ div);
        System.out.println("Thank you,bye bye!");

    }
}
