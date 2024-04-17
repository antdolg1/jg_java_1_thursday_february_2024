package students.aleksandra_hodjuka.lesson_10.level_1._Task_3;

public interface MyList<E> {
    // Добавляет элемент в конец списка
    void add(E element);

    // Вставляет элемент на указанный индекс в списке
    void insert(int index, E element);

    // Возвращает элемент по указанному индексу
    E get(int index);

    // Устанавливает новое значение элемента по указанному индексу
    void set(int index, E element);

    // Удаляет элемент на указанном индексе из списка
    void remove(int index);

    // Проверяет, содержит ли список указанный элемент
    boolean contains(E element);

    // Очищает список, удаляя все элементы
    void clear();
}
