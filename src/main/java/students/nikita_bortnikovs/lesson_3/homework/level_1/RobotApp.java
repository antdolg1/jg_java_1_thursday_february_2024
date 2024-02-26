package students.nikita_bortnikovs.lesson_3.homework.level_1;

public class RobotApp {
    public static void main(String[] args) {


    Robot robot1 = new Robot("Steve");
    Robot robot2 = new Robot("Rachel");

    System.out.println(robot1.getRobotName());
    System.out.println(robot2.getRobotName());

    robot1.setRobotName("Jerry");
    robot2.setRobotName("Tommy");
    System.out.println(robot1.getRobotName() +"  and  "+ robot2.getRobotName());

}
}
