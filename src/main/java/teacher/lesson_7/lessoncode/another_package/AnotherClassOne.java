package teacher.lesson_7.lessoncode.another_package;

import teacher.lesson_4.lessoncode.AgeClassifier;
import teacher.lesson_7.lessoncode.package_one.BaseClass;

public class AnotherClassOne {
    void accessProtectedMembers() {
        BaseClass baseObject = new BaseClass();
        /*
        baseObject.protectedField = 20; //ошибка компиляции, нельзя получить доступ к защищённым членам из другого пакета
        baseObject.protectedMethod(); //ошибка компиляции, нельзя получить доступ к защищённым членам из другого пакета
        */
    }
}
