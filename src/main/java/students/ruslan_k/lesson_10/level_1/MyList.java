package students.ruslan_k.lesson_10.level_1;

public interface MyList {
    boolean add(Object list); //add element to the end of the list
    boolean add(Object list, int position); //add element to the indicate position
    boolean del(Object list); // delete last element of the list, return result as boolean
    boolean del(Object list, int position); // delete indicated element, return result as boolean
    Object get(int position); // return indicated element;
    Object getFirst(); // return first element
    Object getLast(); // return last element



}
