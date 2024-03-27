public class OOP_1 {
    public static void main(String[] args) {
        // kunal.name= "Kunal Kushwaha";

        // kunal.marks=90.5f;
        // System.out.println(kunal.name);
        // System.out.println(kunal.rno);
        // System.out.println(kunal.marks);
        // System.out.println(rohit.name);
        // System.out.println(rohit.rno);
        // System.out.println(rohit.marks);
        // kunal.greetings();
        // rohit.greetings();
        // Calling with the help of constructors
        // But if I want to pass values in constructors as arguments then
        Student ankita = new Student(1, "Ankita Thakur", 98.4f);
        System.out.println(ankita.name);
        System.out.println(ankita.rno);
        System.out.println(ankita.marks);
    }
}

class Student {
    int rno;
    String name;
    float marks;

    // void greetings(){
    // System.out.println("My name is "+ name);// can also use this.name instead of
    // name
    // // as they both are doiing same thing
    // }
    // Student(){// this is a constructor
    // this.rno=15;
    // this .name= "Kunal Kushwaha";
    // this.marks=88.5f;
    // }
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
