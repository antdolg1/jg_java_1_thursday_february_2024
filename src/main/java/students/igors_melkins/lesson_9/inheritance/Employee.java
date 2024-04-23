package students.igors_melkins.lesson_9.inheritance;

public class Employee {

    float salary = 4000;
    private int taxRate = 20;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }
}
