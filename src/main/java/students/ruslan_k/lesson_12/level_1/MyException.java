package students.ruslan_k.lesson_12.level_1;

class MyFirstException extends Exception { // for Task1

}

class MySecondException extends Exception { // for Task 2

}

class MyThirdException extends Exception { //for Task 3, only one parent class

}

class MyFourthException extends Exception {

    public MyFourthException(){
        super();
    }

    public MyFourthException(String message) {  //for Task 4
        super(message);

    }

}