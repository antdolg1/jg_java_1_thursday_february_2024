package students.kristina_manevica.lesson_3.homework.level_4;

class DoctorTimetable {

    private String doctorName;
    private String doctorSpeciality;
    private String date;
    private AppointmentTime morningAppointment;
    private AppointmentTime lunchAppointment;

    public DoctorTimetable(String doctorName, String doctorSpeciality, String date,
                           AppointmentTime morningAppointment, AppointmentTime lunchAppointment) {
        this.doctorName = doctorName;
        this.doctorSpeciality = doctorSpeciality;
        this.date = date;
        this.morningAppointment = morningAppointment;
        this.lunchAppointment = lunchAppointment;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public String getDate() {
        return date;
    }

    public AppointmentTime getMorningAppointment() {
        return morningAppointment;
    }

    public AppointmentTime getLunchAppointment() {
        return lunchAppointment;
    }
}
