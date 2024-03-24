package students.aleksandra_hodjuka.lesson_3.level_4;

class DoctorTimetable {

    String nameOfTheDoctor;
    String speciality;
    String dateOfAppointment;
    String timeOfAppointment1;
    String timeOfAppointment2;


    DoctorTimetable(String nameOfTheDoctor, String speciality, String dateOfAppointment,
                    String timeOfAppointment1, String timeOfAppointment2) {
        this.nameOfTheDoctor = nameOfTheDoctor;
        this.speciality = speciality;
        this.dateOfAppointment = dateOfAppointment;
        this.timeOfAppointment1 = timeOfAppointment1;
        this.timeOfAppointment2 = timeOfAppointment2;

    }

    public String getNameOfTheDoctor() {
        return this.nameOfTheDoctor;
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public String getDateOfAppointment() {
        return this.dateOfAppointment;
    }

    public String getTimeOfAppointment1() {
        return this.timeOfAppointment1;
    }

    public String getTimeOfAppointment2() {
        return this.timeOfAppointment2;
    }
}
