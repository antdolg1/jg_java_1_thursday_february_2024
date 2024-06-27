package students.igors_melkins.lesson_3.level_1;



public class RobotApp {

    public static void main(String[] args) {

        Robot MyNameIsRobot1 = new Robot("Igors");

        Robot MyNameIsRobot2 = new Robot("Andrejs");


        System.out.println("Igors = " + MyNameIsRobot1.getMyNameIsRobot());
        System.out.println("Andrejs = " + MyNameIsRobot2.getMyNameIsRobot());

        MyNameIsRobot1.setMyNameIsRobot("Maksims");
        MyNameIsRobot2.setMyNameIsRobot("Anatolijs");

        System.out.println("MyNameIsRobot1 changed name is " + MyNameIsRobot1.getMyNameIsRobot());
        System.out.println("MyNameIsRobot2 changed name is " + MyNameIsRobot2.getMyNameIsRobot());

    }
    //add lesson3

}
