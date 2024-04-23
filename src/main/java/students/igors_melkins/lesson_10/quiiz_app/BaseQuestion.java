package students.igors_melkins.lesson_10.quiiz_app;

abstract class BaseQuestion implements Question{

    protected String question;
    public BaseQuestion(String question){
        this.question = question;
    }


    @Override
    public void displayQuestion(){
        System.out.println(question);
    }
}
