package students.ruslan_k.lesson_12.level_2;

public class WrongUserException extends Exception{

    public WrongUserException(){
        super();
    }

    public WrongUserException(String message){
        super(message);
    }

}
