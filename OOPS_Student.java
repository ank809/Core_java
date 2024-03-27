import java.util.Scanner;

public class OOPS_Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int age = sc.nextInt();
        int r = sc.nextInt();
        int[] marks = { 1, 2, 3, 4, 5 };
        StudentDetails stud1 = new StudentDetails(a, age, marks, r);
        System.out.println(stud1.name);
        for (int i = 0; i < stud1.marks.length; i++) {
            System.out.println(stud1.marks[i]);
        }
        sc.close();
    }
}

class StudentDetails {
    String name;
    int age;
    int[] marks;
    int rollno;

    StudentDetails(String name, int age, int[] marks, int rollno) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.rollno = rollno;
    }
}