package students.aleksandra_hodjuka.lesson_6.level_6;

public class FizzBuzz {
    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + number;
    }
}
//Этот класс реализует задачу: для чисел, которые делятся на 3 без остатка, возвращается "Fizz",
// для чисел, которые делятся на 5 без остатка, возвращается "Buzz", а для чисел, которые делятся и на 3,
// и на 5 без остатка, возвращается "FizzBuzz". Если число не делится ни на 3, ни на 5 без остатка,
// возвращается само число в виде строки.
//Метод detect можно реализовать и без свойства initialNumber.