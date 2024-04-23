package students.igors_melkins.lesson_10.quiiz_app;

import java.util.Scanner;

public class Quiz {

    private Question []questions;

    public Quiz(int size ) {
        questions =new Question[size];
    }

    public void addQuestion(int idex,Question question){
        questions[idex] = question;

    }

    public void conductQuiz(){
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions){
            question.displayQuestion();

            String userAnswer = scanner.nextLine();

            if (question.checkAnswer(userAnswer)){
                System.out.println("Correct ");
            } else {
                System.out.println("Incorrect");
            }
            System.out.println();
        }
        System.out.println("Quiz complete");
    }
}
