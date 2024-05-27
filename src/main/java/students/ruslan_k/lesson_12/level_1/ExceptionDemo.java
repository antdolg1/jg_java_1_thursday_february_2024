package students.ruslan_k.lesson_12.level_1;

// Task 5
//java.lang.Exception
public class ExceptionDemo {

    public static void main(String[] args) {

        Throwable throwable=null;
        Exception simpleEx = new Exception();
        Exception exceptWithMsg = new Exception("This is Exception");
        Exception exceptionWithThrow = new Exception(throwable);
        Exception exceptionWithThrowAndMessage = new Exception("This is Exception",throwable);
    }

}

