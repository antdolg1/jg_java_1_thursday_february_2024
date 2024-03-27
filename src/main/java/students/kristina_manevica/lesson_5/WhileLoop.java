package students.kristina_manevica.lesson_5;

import java.util.Scanner;

class WhileLoop {
    public static void main(String[] args) {

        int i = 5;
        while (i < 5) {
            System.out.println("i= " + i);
            i++;
        }

        //uvelichit i
        i = i + 1;

        //ili
        i += 1;
        i += 2;

        //ili
        i++; //vsegda na odnu edinicu uvelichivajet

        //umenwajem
        i = i - 1;
        i -= 2;
        i--;

        byte countDown = 5;

        while (countDown >= 1) {
            System.out.println("Till start: " + countDown);
            countDown--;
        }
        System.out.println("Start!");

        //beskonechnij cikl
        /*
        while (1 > 0) {
            System.out.println("OMG");
        }*/

        int attemptCount = 3;
        String password = "0000";
        Scanner scanner = new Scanner(System.in);

        while (attemptCount > 0) {
            System.out.println("Enter pin");
            if (password.equals(scanner.nextLine())) {
                System.out.println("Welcome!");
                break;
            }
            attemptCount--;
            System.out.println("Wrong password. Enter one more time");

            if (attemptCount == 0) {
                System.out.println("You are blocked, 3 times wrong password!");
            }
        }
    }
}
