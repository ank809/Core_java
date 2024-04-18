package Generics;

import java.util.ArrayList;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        data = new int[DEFAULT_SIZE];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void resize() {
        System.out.println("Resize method called");
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    // We will create our own add func to add item in array list
    public void addItem(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    // Func to remove item
    public int remove() {
        int removed = data[--size];
        return removed;
    }

    // Get element at index
    public int getELement(int index) {
        return data[index];
    }

    // Size
    public int getSize() {
        return size;
    }

    // Set index
    public void setIndex(int element, int index) {
        data[index] = element;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {
        // ArrayList list = new ArrayList<>();
        CustomArrayList list = new CustomArrayList();
        list.addItem(12);
        list.addItem(17);
        list.addItem(12);
        list.addItem(17);
        list.display();
        System.out.println(list.getSize());
        System.out.println(list.remove());
        // Here <Integer> is parametrised datatype
        // ArrayList is of generic type
        ArrayList<Integer> list2 = new ArrayList<>();
    }

}
