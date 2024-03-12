package students.aleksandra_hodjuka.lesson_3;

public class RobotApp {
    public static void main(String[] args) {
        Robot Robot1 = new Robot("Alex");
        Robot Robot2 = new Robot("Max");

        System.out.println("Name of Robot1 = " + Robot1.getName());
        System.out.println("Name of Robot2 = " + Robot2.getName());

        Robot1.setName("Alexandrs");
        Robot2.setName("Maximilians");

        System.out.println("Robot 1 changed name is " + Robot1.getName());
        System.out.println("Robot 2 changed name is " + Robot2.getName());




    }
}
