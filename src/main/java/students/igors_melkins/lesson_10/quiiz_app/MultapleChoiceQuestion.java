package students.igors_melkins.lesson_10.quiiz_app;

public class MultapleChoiceQuestion extends BaseQuestion {

    private int correctChoice;
    private String [] choices;

    public MultapleChoiceQuestion(String question, String[] choices,int correctChoice) {
        super(question);
        this.correctChoice = correctChoice;
        this.choices = choices;
    }

    @Override
    public QuestionType getType(){
        return QuestionType.MULTIPLE_CHOICE;

    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        int selectedAnswer = Integer.parseInt(userAnswer);

        return selectedAnswer == correctChoice;
    }

    @Override
    public void displayQuestion(){
        super.displayQuestion();
        for(int i =0;i < choices.length;i++){
            System.out.println((i+1) + "." + choices[i]);
        }

    }
}
