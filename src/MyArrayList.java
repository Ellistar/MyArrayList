public class MyArrayList<T> {
    public static final int defaultCapacity = 5;
    public Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[defaultCapacity];
    }

    public void add(Object value) {
        resize();
        elements[size] = value;
        size++;

    }

    public void resize() {
        if (elements.length == size) {
            Object[] newArray = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;
        }
    }

    public void remove(int index) {
        Object[] newerArray = new Object[elements.length - 1];
        System.arraycopy(elements, index + 1, newerArray, index, size - index - 1);
        size--;
        elements = newerArray;
    }

    public void clear() {
        size = 0;
        elements = new Object[defaultCapacity];
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        return elements[index];
    }

}
