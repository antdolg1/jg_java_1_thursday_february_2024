package students.nikola_korovacka.lesson_10.level1_task3;

public class MyArrayList implements MyList {
    private int[] elements;
    private int size;

    public MyArrayList() {
        elements = new int[10]; // Sākotnējais masīva izmērs
        size = 0;
    }

    @Override
    public void add(int element) {
        if (size == elements.length) {
            // Ja masīvs ir pilns, to jāpalielina
            int[] newElements = new int[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        elements[size] = element;
        size++;
    }

    @Override
    public int get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    @Override
    public int size() {
        return size;
    }
}
