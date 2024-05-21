package students.arturs_novikovs.lesson_4.lesson;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        byte countDown = 5;
        while (countDown >= 0) {
            System.out.println("do starta: " + countDown);
            countDown--;
        }
        System.out.println("startuem!");
        //while (true)
        //System.out.println("beskone4nostj");
        int attemcCount = 3;
        Scanner scanner = new Scanner(System.in);
        String password = "0000";

        while (attemcCount > 0) {
            System.out.println("pozalujsta vvedite parol:");
            if (password.equals(scanner.nextLine())) {
                System.out.println("dobro pozalovatj");
                break;}
                attemcCount--;}
            System.out.println("nevernij parol poprobujte esjo. ostalosj " + attemcCount + "popitok");
        }
    }
