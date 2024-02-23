package students.kristina_manevica.lesson_3.homework.level_4;

import javax.sound.midi.Soundbank;

class DoctorTimetableApp {
    public static void main(String[] args) {

        DoctorAppointment firstDoctorMorningPatient = new DoctorAppointment("Kaspars Stepanovs",
                "Pneumonia", 65.00);
        DoctorAppointment firstDoctorLunchPatient = new DoctorAppointment("Arturs Anisimovs",
                "Gastritis", 89.00);

        DoctorAppointment secondDoctorMorningPatient = new DoctorAppointment("Ilona Vilkoite",
                "Sore throat", 25.00);
        DoctorAppointment secondDoctorLunchPatient = new DoctorAppointment("Andris Neimanis",
                "Headache", 45.00);

        AppointmentTime firstDocMorningAppointment = new AppointmentTime("10:00-12:00", firstDoctorMorningPatient);
        AppointmentTime firstDocLunchAppointment = new AppointmentTime("14:00-16:00", firstDoctorLunchPatient);

        AppointmentTime secondDocMorningAppointment = new AppointmentTime("10:00-12:00", secondDoctorMorningPatient);
        AppointmentTime secondDocLunchAppointment = new AppointmentTime("14:00-16:00", secondDoctorLunchPatient);

        DoctorTimetable firstDoctorTimetable = new DoctorTimetable("Baiba Rozentale",
                "Pneumonologist", "01.03.2024.", firstDocMorningAppointment, firstDocLunchAppointment);
        DoctorTimetable secondDoctorTimetable = new DoctorTimetable("Kristina Manevica",
                "Neurolog", "02.03.2024.", secondDocMorningAppointment, secondDocLunchAppointment);

        String firstDocMorningPatientData = firstDoctorMorningPatient.getPatientName() + ", " +
                firstDoctorMorningPatient.getDiagnosis() + ", " + firstDoctorMorningPatient.getPrice() + " euro";
        String firstDocLunchPatientData = firstDoctorLunchPatient.getPatientName() + ", " +
                firstDoctorLunchPatient.getDiagnosis() + ", " + firstDoctorLunchPatient.getPrice() + " euro";

        String secondDocMorningPatientData = secondDoctorMorningPatient.getPatientName() + ", " +
                secondDoctorMorningPatient.getDiagnosis() + ", " + secondDoctorMorningPatient.getPrice() + " euro";
        String secondDocLunchPatientData = secondDoctorLunchPatient.getPatientName() + ", " +
                secondDoctorLunchPatient.getDiagnosis() + ", " + secondDoctorLunchPatient.getPrice() + " euro";

        String firstDoctorTimetableData = firstDoctorTimetable.getDoctorName() + ", " +
                firstDoctorTimetable.getDoctorSpeciality() + ", " + firstDoctorTimetable.getDate();
        String secondDoctorTimetableData = secondDoctorTimetable.getDoctorName() + ", " +
                secondDoctorTimetable.getDoctorSpeciality() + ", " + secondDoctorTimetable.getDate();

        System.out.println("First doctor timetable: " + firstDoctorTimetableData);
        System.out.println("Morning (10:00-12:00) appointment: " + firstDocMorningPatientData);
        System.out.println("Lunch (14:00-16:00) appointment: " + firstDocLunchPatientData);
        System.out.println("");
        System.out.println("Second doctor timetable: " + secondDoctorTimetableData);
        System.out.println("Morning (10:00-12:00) appointment: " + secondDocMorningPatientData);
        System.out.println("Lunch (14:00-16:00) appointment: " + secondDocLunchPatientData);
    }
}