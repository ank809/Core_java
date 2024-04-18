package Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

// Lambda Functions are basically oneline functions 
// Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method
public class Lambda_Functions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }

        list.forEach((item) -> System.out.println(item * 2));

        // Consumer interface to store a lambda expression in a variable
        Consumer<Integer> fun = (n) -> System.out.println(n);
        list.forEach(fun);

        // (parameter1, parameter2) -> expression
        Operation sum = (a, b) -> a + b;
        Operation mul = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        Lambda_Functions func = new Lambda_Functions();
        System.out.println(func.operate(10, 2, sub));
        System.out.println(func.operate(10, 2, sum));
        System.out.println(func.operate(10, 2, mul));
    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

    public interface Operation {
        int operation(int a, int b);

    }
}
