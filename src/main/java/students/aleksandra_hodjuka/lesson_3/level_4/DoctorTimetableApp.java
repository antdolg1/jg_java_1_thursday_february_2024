package students.aleksandra_hodjuka.lesson_3.level_4;

import java.util.Scanner;

class DoctorTimetableApp {
    String nameOfTheDoctor1 = "SCOTT";
    String nameOfTheDoctor2 = "WHITE";

    public static void main(String[] args) {

        DoctorTimetable doctorTimeTable1 = new DoctorTimetable("James Scott", "Surgeon",
                "4th of March 2024", "10:00", "10:15");
        Appointment appointment1 = new Appointment("Mary Green", "Wrist fracture",
                20);

        DoctorTimetable doctorTimeTable2 = new DoctorTimetable("Jeremy White", "Neurologist",
                "4th of March 2024", "16:00", "16:30");
        Appointment appointment2 = new Appointment("Antony Smile", "Headache", 30);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, choose your doctor : Scott or White");
        String nameOfTheDoctor = scanner.nextLine();
        nameOfTheDoctor = nameOfTheDoctor.toUpperCase();

        if (nameOfTheDoctor.equals("SCOTT")) {
            System.out.println("Date of appointment - " + doctorTimeTable1.getDateOfAppointment());
            System.out.println("Time of appointment - " + doctorTimeTable1.getTimeOfAppointment1() + "---" +
                    doctorTimeTable1.getTimeOfAppointment2());
            System.out.println("Name of the patient - " + appointment1.getNameOfThePatient());
            System.out.println("Diagnose - " + appointment1.getDiagnose());
            System.out.println("Price - " + appointment1.getPrice());

        } else if (nameOfTheDoctor.equals("WHITE")) {
            System.out.println("Date of appointment - " + doctorTimeTable2.getDateOfAppointment());
            System.out.println("Time of appointment - " + doctorTimeTable2.getTimeOfAppointment1() + "---" +
                    doctorTimeTable2.getTimeOfAppointment2());
            System.out.println("Name of the patient - " + appointment2.getNameOfThePatient());
            System.out.println("Diagnose - " + appointment2.getDiagnose());
            System.out.println("Price - " + appointment2.getPrice());
        } else {
            System.out.println("Unknown doctor");
        }
    }
}
