package students.igors_melkins.lesson_10.quiiz_app;

public interface Question {

    QuestionType getType();

    void displayQuestion();

    boolean checkAnswer(String userAnswer);


}
