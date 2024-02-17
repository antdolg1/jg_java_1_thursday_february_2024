package students.ruslan_k.lesson_3.level_1;

class RobotApp {
    public static void main(String[] args) {
        Robot robot1 = new Robot("R2D2");
        Robot robot2 = new Robot("3PO");

        System.out.println("1-st robot's name is " + robot1.getRobotName());
        System.out.println("2-nd robot's name is " + robot2.getRobotName());

        robot1.setRobotName("Clone of R2D2");
        robot2.setRobotName("Clone of 3PO");

        System.out.println("1-st robot's New name is " + robot1.getRobotName());
        System.out.println("2-nd robot's New name is " + robot2.getRobotName());

    }
}
