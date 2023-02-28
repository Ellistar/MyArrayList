public class MyArrayList {
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
        for (int i = 0, k = 0; i < elements.length; i++) {
            if (i == index) {
                continue;
            }
            newerArray[k++] = elements[i];
        }
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
