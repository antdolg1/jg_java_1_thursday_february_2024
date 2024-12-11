package students.kristina_manevica.lesson_15.homework.level_2;

public class Trader {

    private String fullName;
    private String city;

    public Trader(String city, String fullName) {
        this.city = city;
        this.fullName = fullName;
    }

    public String getCity() {
        return city;
    }

    public String getFullName() {
        return fullName;
    }
}