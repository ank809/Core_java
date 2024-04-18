package Generics;

public class CustomGenericArrayList<T> {

    private Object[] list;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList() {
        list = new Object[DEFAULT_SIZE];
    }

    public boolean isFull() {
        return size == list.length;
    }

    public void resize() {
        System.out.println("Resize method called");
        Object[] temp = new Object[list.length * 2];
        for (int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }
        list = temp;
    }

    // Add item in list
    public void add(T num) {
        if (isFull()) {
            resize();
        }
        list[size++] = num;
    }

    // Remove
    @SuppressWarnings("unchecked")
    public T remove() {
        T removed = (T) (list[--size]);
        return removed;
    }

    // Get element at index
    @SuppressWarnings("unchecked")
    public T getELement(int index) {
        return (T) (list[index]);
    }

    // Size
    public int getSize() {
        return size;
    }

    // Set index
    public void setIndex(T element, int index) {
        list[index] = element;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }
    }

    public static void main(String[] args) {
        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(2 * i);
        }
        list.display();

        CustomGenericArrayList<String> list2 = new CustomGenericArrayList<>();
        for (int i = 0; i < 14; i++) {
            list2.add("Hello");
        }
        list2.display();
    }
}
