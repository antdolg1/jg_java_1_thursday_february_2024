package students.karina_cmile.lesson_3.homework.level_1_intern;

import students.karina_cmile.lesson_3.lessoncode.Apple;

public class RobotApp {
    public static void main(String[] args) {

        Robot robot1 = new Robot ("Kosmophone");
        Robot robot2 = new Robot ("Limpopo");


        System.out.println(robot1.getName());
        System.out.println(robot2.getName());

        robot1.setName("Robocop");
        System.out.println(robot1.getName());
        robot2.setName("Zimbabva");
        System.out.println(robot2.getName());

    }
}
