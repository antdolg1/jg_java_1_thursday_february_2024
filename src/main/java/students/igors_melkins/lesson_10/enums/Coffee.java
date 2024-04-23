package students.igors_melkins.lesson_10.enums;

public class Coffee {
    private String type;
    private CoffeeSize size;

    public Coffee(String type, CoffeeSize size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public CoffeeSize getSize() {
        return size;
    }

    @Override
    public String toString() {
        return type + "("+ size.toString()+ ")" + size.getOunces() + " oz ";
    }
}
