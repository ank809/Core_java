package Collections;

import java.util.List;
import java.util.Vector;

// Vectors are same as ArrayList  but the only difference is that Vectors are synchornized but ArrayList are not i.e Multiple threads
// can access the same object in ArrayList but in vector only one thread can access at a time.
// ArrayList is faster as in vectors you've to wait if other thread is accessing it.

public class Vectors {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();
        vector.add(17);
        vector.add(77);
        vector.add(25);
        vector.add(73);
        vector.add(12);
        System.out.println(vector);
    }

}