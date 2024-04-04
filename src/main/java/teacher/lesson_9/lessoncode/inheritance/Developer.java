package teacher.lesson_9.lessoncode.inheritance;

public class Developer extends Employee {
    int bonus = 1000;

    public static void main(String[] args) {
        Developer dev = new Developer();
        System.out.println("Developer salary is: " + dev.salary);
        System.out.println("Developer bonus is: " + dev.bonus);
//        System.out.println("Developer tax rate is: " + dev.taxRate); //приватные поля не наследуются

        Employee employee = new Employee();
        System.out.println("Employee salary is: " + employee.salary);
//        System.out.println("Employee bonus is: " + employee.bonus); won't work cause Employee doesn't have such a field
    }
}
