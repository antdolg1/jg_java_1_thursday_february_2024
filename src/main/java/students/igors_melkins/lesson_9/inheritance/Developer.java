package students.igors_melkins.lesson_9.inheritance;

public class Developer  extends  Employee {

    int bonus = 1000;

    public static void main(String[] args) {

        Developer dev = new Developer();
        System.out.println("Devoloper salary is :" + dev.salary);
        System.out.println("Devoloper bonus is : " + dev.bonus);
//        System.out.println("Devoloper tax rate is :" +dev.getTaxRate());//приватные поля не наследуются

        Employee employee = new Employee();
        System.out.println("Employee salary is : " + employee.salary);
//        System.out.println("Employee bonus is : " + employee.bonus); won't work cause Employee doesn't have such a field
    }

}
