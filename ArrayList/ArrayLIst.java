package ArrayList;

import java.util.*;
import java.util.ArrayList;

// When you don't know the size of the array use ArrayList
// Initially the size is fixed in arraylist but when the size reaches to a particular limit, it doubles the size of the array and copies the previous 
// elements into the new array and delete the previous array.

public class ArrayLIst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>(5);
        list.add(0, 10);
        list.add(25);
        list.add(38);
        list.add(74);
        list.add(97);
        System.out.println(list);
        list.set(2, 100);
        System.out.println(list);

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            arr.add(sc.nextInt());
        }
        for (int i = 0; i < 6; i++) {
            // Here list [index] will not work
            System.out.println(arr.get(i));
        }

        sc.close();

    }

}