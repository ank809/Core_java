package StaticExample;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        Human human = new Human("Ankita", 19, 100000);
        System.out.println(human.age);
        System.out.println(human.name);
        System.out.println(Human.population);
        System.out.println(human.toString());
        sc.close();
    }

}