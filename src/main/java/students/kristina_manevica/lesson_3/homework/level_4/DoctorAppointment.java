package students.kristina_manevica.lesson_3.homework.level_4;

class DoctorAppointment {

    private String patientName;
    private String diagnosis;
    private double price;

    public DoctorAppointment(String patientName, String diagnosis, double price) {
        this.patientName = patientName;
        this.diagnosis = diagnosis;
        this.price = price;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public double getPrice() {
        return price;
    }
}
