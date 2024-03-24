package students.karina_cmile.lesson_4.lessoncode;

import java.util.Scanner;

public class NestedSwitchStatement {
    public static void main(String[] args) {

        String askForHelpText = "Wrong combo number entered, please ask for help!";
        System.out.println("Please choose your option. Available: chicken, beef or fish");
        Scanner scanner = new Scanner(System.in);
        String userMainChoice = scanner.nextLine();
        userMainChoice = userMainChoice.toLowerCase();

        switch (userMainChoice) {
            case "chicken":
                System.out.println("Please choose your combo: 1 - burger combo, 2 - nuggets combo");
                int userChickenComboChoice = scanner.nextInt();
                switch (userChickenComboChoice) {
                    case 1:
                        System.out.println("You chose Chicken burger combo!");
                        break;
                    case 2:
                        System.out.println("You chose Chicken nuggets combo!");
                        break;
                    default:
                        System.out.println(askForHelpText);
                }
                break;
            case "beef":
                System.out.println("Please choose your combo: 1 - double burger combo, 2 - stripes combo");
                int userBeefComboChoice = scanner.nextInt();
                switch (userBeefComboChoice) {
                    case 1:
                        System.out.println("You chose Beef double burger combo!");
                        break;
                    case 2:
                        System.out.println("You chose Beef stripes combo!");
                        break;
                    default:
                        System.out.println(askForHelpText);
                }
                break;
            case "fish":
                System.out.println("Please choose your combo: 1 - roll combo, 2 - fillet combo");
                int userFishComboChoice = scanner.nextInt();
                switch (userFishComboChoice) {
                    case 1:
                        System.out.println("You chose Fish roll combo!");
                        break;
                    case 2:
                        System.out.println("You chose Fish fillet combo!");
                        break;
                    default:
                        System.out.println(askForHelpText);
                }
                break;
            default:
                System.out.println("For other options, not listed in menu ask at cash desk!");
        }

    }
}
