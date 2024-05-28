package students.arturs_novikovs.lesson_4.lesson;

import java.util.Scanner;

public class Lesson_4_2{
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int count = 1;
    int userInputValue;

    do {
        System.out.println("pozalujsta vvedite cislo ot 1 do 100:");
        userInputValue = scanner.nextInt();
    } while (userInputValue != 7);
    System.out.println("pozdravljaem ! vi ugodali");
    do {
        System.out.println("znacenie scetcika ravno " + count);
        count++;
    }while (count < 11);
    }
}