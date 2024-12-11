package students.ruslan_k.lesson_8.level_1;//package students.ruslan_k.lesson_8.level_1;


class Trader {
    private String fullName;
    private String city;
    private String country;

    Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    String getFullName() {
        return fullName;
    }

    String getCity() {
        return city;
    }

    String getCountry() {
        return country;
    }
}
