package students.kristina_manevica.lesson_3.homework.level_1;

class RobotApp {
    public static void main(String[] args) {

        Robot robotOne = new Robot("Valli");
        Robot robotTwo = new Robot("Eva");

        String robotOneName = robotOne.getName();
        String robotTwoName = robotTwo.getName();

        System.out.println("First robot name: " + robotOneName);
        System.out.println("Second robot name: " + robotTwoName);

        robotOne.setName("R2-D2");
        robotTwo.setName("C-3PO");

        System.out.println("New first robot name: " + robotOne.getName());
        System.out.println("New second robot name: " + robotTwo.getName());
    }
}
