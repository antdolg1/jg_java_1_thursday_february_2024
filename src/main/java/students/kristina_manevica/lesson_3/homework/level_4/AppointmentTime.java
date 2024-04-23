package students.kristina_manevica.lesson_3.homework.level_4;

class AppointmentTime {

    private String time;
    private DoctorAppointment appointment;

    public AppointmentTime(String time, DoctorAppointment appointment) {
        this.time = time;
        this.appointment = appointment;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public DoctorAppointment getAppointment() {
        return appointment;
    }

    public void setAppointment(DoctorAppointment appointment) {
        this.appointment = appointment;
    }
}
