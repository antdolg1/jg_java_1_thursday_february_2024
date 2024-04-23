package students.igors_melkins.lesson_10.quiiz_app;

public class TrueFalseQuestion implements Question {
    private boolean correctAnswer;

    public TrueFalseQuestion(String question, boolean correctAnswer) {
        super();
        this.correctAnswer = correctAnswer;
    }


    @Override
    public QuestionType getType(){
        return QuestionType.TRUE_FALSE;

    }

    @Override
    public void displayQuestion() {

    }

    @Override
    public boolean checkAnswer(String userAnswer){
        boolean selectAnswer = Boolean.parseBoolean(userAnswer);
        return selectAnswer == correctAnswer;

    }
}
