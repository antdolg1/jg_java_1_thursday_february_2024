package teacher.lesson_7.lessoncode.another_package;

import teacher.lesson_7.lessoncode.package_one.BaseClass;

public class SubClass extends BaseClass {
    void accessProtectedMembers() {
        protectedField = 10; //доступ к защищённому полю из подкласса
        protectedMethod();//достук к защищённому методу из подкласса
    }
}
