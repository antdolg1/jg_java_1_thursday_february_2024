package students.nikola_korovacka.lesson3;

public class RobotApp {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Nikola");
        Robot robot2 = new Robot("Milana");

        robot1.setName("Janis");
        robot2.setName("Peteris");

        System.out.println("Robot 1 name: " + robot1.getName());
        System.out.println("Robot 2 name: " + robot2.getName());

    }
}
