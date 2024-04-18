package Generics;

import java.util.Arrays;

public class Comparision implements Comparable<Comparision> {

    int rno;
    float marks;

    public Comparision(int a, float b) {
        this.rno = a;
        this.marks = b;
    }

    @Override
    public int compareTo(Comparision o) {
        // if ==0 then both are same
        // if <0 then o.marks is greater
        // if >0 then o.marks is lesser
        return (int) (this.marks - o.marks);
    }

    @Override
    public String toString() {
        return marks + " " + rno;
    }

    public static void main(String[] args) {
        Comparision kunal = new Comparision(12, 67.34f);
        Comparision rahul = new Comparision(4, 67.34f);
        if (kunal.compareTo(rahul) < 0) {
            System.out.println("Rahul is greater");
        } else if (kunal.compareTo(rahul) > 0) {
            System.out.println("Kunal is greater");
        } else {
            System.out.println("Both are equal");
        }

        // List of students
        Comparision arpit = new Comparision(1, 87.34f);
        Comparision karan = new Comparision(9, 42.34f);
        Comparision shivam = new Comparision(15, 51.34f);

        Comparision[] list = { kunal, rahul, karan, arpit, shivam };
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }

}
