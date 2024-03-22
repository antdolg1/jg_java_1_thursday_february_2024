package students.arturs_novikovs.lesson_3.Robot;

public class RobotApp {
    public static void main(String[] args) {
        Robot robot1 = new Robot("D2R2");
        Robot robot2 = new Robot("Bender");

        System.out.println("Имя первого робота"+ robot1.getRobotName());
        System.out.println("Имя второго робота"+ robot2.getRobotName());

        robot1.setRobotName("D2R2V2");
        robot2.setRobotName("BenderV2");

        System.out.println("Новое Имя первого робота " + robot1.getRobotName());
        System.out.println("Новое Имя второго робота  " + robot2.getRobotName());
    }
}
