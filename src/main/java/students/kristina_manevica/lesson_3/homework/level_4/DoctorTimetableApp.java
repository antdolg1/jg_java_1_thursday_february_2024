package students.kristina_manevica.lesson_3.homework.level_4;

class DoctorTimetableApp {
    public static void main(String[] args) {

        DoctorAppointment firstDoctorMorningVisit = new DoctorAppointment("Kaspars Stepanovs",
                "Pneumonia", 65.00);
        DoctorAppointment firstDoctorLunchVisit = new DoctorAppointment("Arturs Anisimovs",
                "Gastritis", 89.00);

        DoctorAppointment secondDoctorMorningVisit = new DoctorAppointment("Ilona Vilkoite",
                "Sore throat", 25.00);
        DoctorAppointment secondDoctorLunchVisit = new DoctorAppointment("Andris Neimanis",
                "Headache", 45.00);

        DoctorTimetable firstDoctorTimetable = new DoctorTimetable("Baiba Rozentale",
                "Pneumonologist", "01.03.2024.", firstDoctorMorningVisit, firstDoctorLunchVisit);
        DoctorTimetable secondDoctorTimetable = new DoctorTimetable("Kristina Manevica",
                "Neurolog", "02.03.2024.", secondDoctorMorningVisit, secondDoctorLunchVisit);

        String firstDoctorMorningPatient = firstDoctorMorningVisit.getPatientName() + ", " + firstDoctorMorningVisit.getDiagnosis() + ", " + firstDoctorMorningVisit.getPrice() + " euro";
        String firstDoctorLunchPatient = firstDoctorLunchVisit.getPatientName() + ", " + firstDoctorLunchVisit.getDiagnosis() + ", " + firstDoctorLunchVisit.getPrice() + " euro";

        String secondDoctorMorningPatient = secondDoctorMorningVisit.getPatientName() + ", " + secondDoctorMorningVisit.getDiagnosis() + ", " + secondDoctorMorningVisit.getPrice() + " euro";
        String secondDoctorLunchPatient = secondDoctorLunchVisit.getPatientName() + ", " + secondDoctorLunchVisit.getDiagnosis() + ", " + secondDoctorLunchVisit.getPrice() + " euro";

        String firstDoctorTimetableData = firstDoctorTimetable + firstDoctorMorningPatient + firstDoctorLunchPatient;
        String secondDoctorTimetableData = secondDoctorTimetable + secondDoctorMorningPatient + secondDoctorLunchPatient;

        System.out.println("First doctor timetable: " + firstDoctorTimetable);
        System.out.println("First doctor : ");
        System.out.println();
    }
}