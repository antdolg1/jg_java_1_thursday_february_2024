package students.ruslan_k.lesson_9.level_6;

import java.util.ArrayList;

public class ArrayListHierarchy {
    ArrayList<Integer> al = new ArrayList<Integer>();
    // ArrayList<E> extends AbstractList<E> implements List<E>
    // AbstractList<E> extends AbstractCollection<E> implements List<E>
    // AbstractCollection<E> implements Collection<E>

    // List<E> extends SequencedCollection<E>
    // SequencedCollection<E> extends Collection<E>

    // Collection<E> extends Iterable<E>
}
