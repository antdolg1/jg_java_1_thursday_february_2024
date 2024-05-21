package students.arturs_novikovs.lesson_4.lesson;

public class Lesson_4 {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int num3 = 45;
        int biggestNumber = maxOfThreeNumbers(num1, num2, num3);

        System.out.println("biggerst number is : " + biggestNumber);
    }
    public static int maxOfTwoNumbers(int num1, int num2,int num3){
        if (num1 > num2)
            return num1;{
        return num2;
    }
}

public static int maxOfThreeNumbers ( int num1, int num2, int num3){
    if (num1 >= num2 && num1 >=num3){
    return num1;
    } else if (num2>= num1 && num2 >= num3) {
        return num2;
    } else {
        return num3;
    }
}
}


