package students.slava_subacius.lesson_3.level_1;




public class RobotApp {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Alisa");
        Robot robot2 = new Robot("Nika");
        System.out.println("Robot1 name = " + robot1.getName());
        System.out.println("Robot2 name = " + robot2.getName());

        robot1.setName("Lina");
        robot2.setName("Vasija");

        System.out.println("Robot 1 name = " + robot1.getName());
        System.out.println("Robot 2 name = " + robot2.getName());
    }
}

