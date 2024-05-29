package students.kristina_manevica.lesson_11.homework.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 {

    public static final Logger logger = Logger.getLogger(Task1.class.getName());

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(2);

        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        numbers.set(0, -2);

        logger.info("Numbers: " + numbers);

        List<String> names = new LinkedList<>();

        names.add("One");
        names.add("Two");
        names.add("Three");
        names.set(0, "Zero");

        logger.info("Names: " + names);
    }

    /*
    1.Первая реализация List - LinkedArray. "Динамический массив" - реализация списка, использующая принципы массива.
    Автоматически увеличивает свой размер при добавлении элемента. Быстрый доступ к элементам по индексу. Разрешает
    дупликаты. Элементы добавляются в конец списка, в каком порядке добавляем эелементы, в таком они и хранятся.
    2.Вторая реализация - LinkedList. Связанный список, основан на двухсвязном списке. Каждый элемент списка содержит
    ссылку на предыдущий и следующий элемент. Из-за ссылок -  более быстрая вставка или удаление элемента, так как надо
    изменить только несколько ссылок.

    Если нужен быстрый доступ по индексу/добавить или удалить в конце списка/ память критична - то выбираем ArrayList.
    Если частая вставка или удаление жлементов посередине - то лучше подойдет LinkedList.
     */
}