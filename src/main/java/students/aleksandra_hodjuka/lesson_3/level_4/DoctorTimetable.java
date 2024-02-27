package students.aleksandra_hodjuka.lesson_3.level_4;

public class DoctorTimetable {

    String nameOfTheDoctor;
    String speciality;
    String dateOfAppointment;
    String timeOfAppointment1;
    String timeOfAppointment2;
    String nameOfThePatient;
    String diagnose;
    int price;

    public DoctorTimetable(String nameOfTheDoctor, String speciality, String dateOfAppointment,
                            String timeOfAppointment1, String timeOfAppointment2,String nameOfThePatient, String diagnose, int price) {
        this.nameOfTheDoctor = nameOfTheDoctor;
        this.speciality = speciality;
        this.dateOfAppointment = dateOfAppointment;
        this.timeOfAppointment1 = timeOfAppointment1;
        this.timeOfAppointment2 = timeOfAppointment2;
        this.nameOfThePatient = nameOfThePatient;
        this.diagnose = diagnose;
        this.price = price;


        class Appointment {
            String nameOfThePatient;
            String diagnose;
            int price;

            public Appointment(String nameOfThePatient, String diagnose, int price) {
                this.nameOfThePatient = nameOfThePatient;
                this.diagnose = diagnose;
                this.price = price;
            }
        }




    }

    public String getNameOfTheDoctor() {return this.nameOfTheDoctor;}
    public String getSpeciality() {return this.speciality;}
    public String getDateOfAppointment() {return this.dateOfAppointment;}
    public String getTimeOfAppointment1() {return this.timeOfAppointment1;}
    public String getTimeOfAppointment2() {return this.timeOfAppointment2;}
    public String getNameOfThePatient() {return this.nameOfThePatient;}
    public String getDiagnose() {return this.diagnose;}
    public int getPrice() {return this.price;}






}
