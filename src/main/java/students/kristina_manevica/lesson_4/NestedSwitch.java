package students.kristina_manevica.lesson_4;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        System.out.println("Enter burger type: chicken, beef, fish");

        Scanner scanner = new Scanner((System.in));
        String userChoice = scanner.nextLine();

        userChoice = userChoice.toLowerCase();

        switch (userChoice) {
            case "chicken":
                System.out.println("Choise souce: 1 - tomato, 2 - sinepes");
                int souce = scanner.nextInt();
                switch (souce) {
                    case 1:
                        System.out.println("You have chicken and tomato");
                        break;
                    case 2:
                        System.out.println("You have chicken ar sinepem");
                        break;
                    default:
                        System.out.println("Nothing");
                        break;
                }
                break;
            case "beef":
                System.out.println("Choise souce: 1 - tomato, 2 - sinepes");
                int souceBeaf = scanner.nextInt();
                switch (souceBeaf) {
                    case 1:
                        System.out.println("You have beef and tomato");
                        break;
                    case 2:
                        System.out.println("You have beef ar sinepem");
                        break;
                    default:
                        System.out.println("Nothing");
                }
        }
    }
}
