package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Multidimensional_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(3);

        // Initialize each ArrayList with another ArrayList
        // This loop initializes each inner ArrayList within the list. It iterates three
        // times, and in each iteration,
        // it adds a new empty ArrayList<Integer> to the list.
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            // get the first list and add element in it
            list.get(i).add(a);
        }
        System.out.println(list);
        sc.close();
    }
}
