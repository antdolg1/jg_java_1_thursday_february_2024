package students.aleksandra_hodjuka.lesson_3.level_1;

public class RobotApp {

    public static void main(String[] args) {


        Robot Robot1 = new Robot("Tom");
        Robot Robot2 = new Robot("Jerry");

        System.out.println(STR."Robot 1 name = \{Robot1.getName()}");
        System.out.println(STR."Robot 2 name = \{Robot2.getName()}");

        Robot1.setName("Teddy");
        Robot2.setName("Harry");

        System.out.println(STR."Robot 1 new name = \{Robot1.getName()}");
        System.out.println(STR."Robot 2 new name = \{Robot2.getName()}");








    }


}
