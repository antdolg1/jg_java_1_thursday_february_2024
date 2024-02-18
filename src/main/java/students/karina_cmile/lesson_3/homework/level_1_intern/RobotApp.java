package students.karina_cmile.lesson_3.homework.level_1_intern;

import students.karina_cmile.lesson_3.lessoncode.Apple;

public class RobotApp {
    public static void main(String[] args) {

        Robot robot1 = new Robot ("Kosmophone");
        Robot robot2 = new Robot ("Limpopo");

        String name1 = robot1.getName();
        System.out.println(robot1.getName());

        String name2 = robot2.getName();
        System.out.println(robot2.getName());

    }
}
