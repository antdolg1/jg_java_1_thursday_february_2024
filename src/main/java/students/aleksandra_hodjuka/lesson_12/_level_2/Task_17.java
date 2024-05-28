package students.aleksandra_hodjuka.lesson_12._level_2;

public class Task_17 {
    //Почему класс AccessDeniedException в нашем случае
    //лучше наследовать от Exception, а не от RuntimeException?
    //
    //class AccessDeniedException extends Exception {
    //
    //}
    //В вашем случае, исключение AccessDeniedException может возникнуть
    // во время выполнения программы, когда у пользователя отсутствуют необходимые права доступа.
    // Поскольку это исключение связано с правами доступа и контролем доступа, его следует
    // рассматривать как checked exception.
   // Checked Exceptions (Exception): Это те исключения, которые компилятор Java требует обработать или объявить.
    //Unchecked Exceptions (RuntimeException): Это те исключения, которые наследуются от класса RuntimeException или
    // его подклассов.
    // Они обычно связаны с ошибками в программе, такими как деление на ноль или доступ
    // к несуществующему элементу массива.Обработка таких исключений не является обязательной.

}
