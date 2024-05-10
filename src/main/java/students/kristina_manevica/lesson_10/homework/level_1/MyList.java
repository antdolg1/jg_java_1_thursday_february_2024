package students.kristina_manevica.lesson_10.homework.level_1;

public interface MyList<E> {

    //add element byr adding order
    void add(E element);

    //add element in certain index
    void add(int index, E element);

    //is present?
    boolean isPresent(E element);

    //delete by index
    void delete(int index);

    //delete by element value
    void delete(E element);

    //know element's index
    void elementIndex(E element);

    //delete all elements in the list
    void clear(Object list);

    //is list empty?
    boolean isEmpty(Object list);

}