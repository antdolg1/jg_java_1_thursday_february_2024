package students.aleksandra_hodjuka.lesson_3.level_4;

public class Appointment {
    String nameOfThePatient;
    String diagnose;
    int price;

    public Appointment(String nameOfThePatient, String diagnose, int price) {
        this.nameOfThePatient = nameOfThePatient;
        this.diagnose = diagnose;
        this.price = price;
    }

    public String getNameOfThePatient() {return this.nameOfThePatient; }
    public String getDiagnose() {return this.nameOfThePatient; }
    public int getPrice() {return this.price; }


}
