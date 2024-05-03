public class OOPS {

    public static void main(String[] args) {
        Student ankita = new Student("Ankita Thakur", 1, 89.6f);
        System.out.println(ankita.name);
        System.out.println(ankita.rno);
        System.out.println(ankita.marks);
        Student akshita = new Student(ankita);
        System.out.println(akshita.name);
        System.out.println(akshita.rno);
        System.out.println(akshita.marks);

        Student random2 = new Student();
        System.out.println(random2.name);
        System.out.println(random2.rno);
        System.out.println(random2.marks);

    }

}

class Student {
    int rno;
    String name;
    float marks;

    Student(Student other) {
        this.name = other.name; // here this is replace by akshita and other is replaced by ankita
        this.rno = other.rno;
        this.marks = other.marks;
    }

    // Student arpit= new Student("Arpit", 12, 89.5f);
    // here this will be replaced by arpit and you can create the data of as many
    // student as you wants
    // you can also skip this but then you have to change the bject name as it will
    // not be able to identify about which object you are talking
    // So the best practice is to use this keyword only
    Student(String name, int rno, float marks) {
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }

    // this is how we call constructor inside a constructor

    Student() {
        this("Astha", 4, 90.5f); // this keyword also helps in calling constructor inside a constructor
    }
}
