package students.aleksandra_hodjuka.lesson_8;

class Trader {
    private String fullName;
    private String city;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public static void main(String[] args) {
        Trader trader = new Trader("Pokemon", "Riga");
        Trader trader1 = new Trader("Alien","Riga");

    }
}
