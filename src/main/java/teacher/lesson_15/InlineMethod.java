package teacher.lesson_15;

public class InlineMethod {

    String registerForDrivingExamTernaryVersion(int age) {
        return isAdult(age) ? "You are allowed to register for the driving test!" : "You must be 18 or more to register for driving test!";
    }

    String registerForDrivingExam(int age) {
        if (isAdult(age)) {
            return "You are allowed to register for the driving test!";
        } else {
            return "You must be 18 or more to register for driving test!";
        }
    }

    boolean isAdult(int age) {
        return age >= 18;
    }

}
