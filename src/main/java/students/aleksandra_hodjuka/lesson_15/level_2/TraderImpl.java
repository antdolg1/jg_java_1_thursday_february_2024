package students.aleksandra_hodjuka.lesson_15.level_2;

public class TraderImpl implements Trader{
    private final String fullName;
    private final String city;

    public TraderImpl(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }
    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public String getCity() {
        return city;
    }


}
