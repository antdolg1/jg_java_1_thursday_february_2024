package teacher.lesson_10.lessoncode.quizz_app;

public class QuizApp {
    public static void main(String[] args) {

        Quiz quiz = new Quiz(2);

        //Add multiple-choice question
        String question = "Which programming language is officially recommended by Google for Android development?";
        String[] choices = {"C#", "Ruby", "Java", "Kotlin"};
        Question multipleChoiceQuestion = new MultipleChoiceQuestion(question, choices, 4);
        quiz.addQuestion(0, multipleChoiceQuestion);

        //Add true-false question
        String question2 = "Java is object-oriented language?";
        Question trueFalseQuestion = new TrueFalseQuestion(question2, true);
        quiz.addQuestion(1, trueFalseQuestion);

        quiz.conductQuiz();

    }
}
