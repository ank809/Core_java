package StaticExample;

/* 

Dot(.) operator binds the instance variables and instance methods with the reference variables.

 Static
 1. Static variable or functions are not associated with objects they are the part of class and do not need
 any object to call them.
 2. They can be modified
 3. We cannot access non-static fields inside a static one but vice versa is true. As non-static fields need
 objects to refer them.
 4. They can be accessed using the class name directly, without needing to create an instance of the class.
 5. Outer class cannot be static but inner can be 
 6. As static fields are not dependent on objects and objects are created at Runtime so the static fields are
 resolved during compile time.

 Final 
 1. Final fields should be initialized at the time of declaration
 2. Final fields is a part of object and they  cannot be modifed after initialization.
 3. For methods, they cannot be overridden by subclasses.
 4. For classes, they cannot be subclassed.
 */
public class Human {
    String name;
    int age;
    int salary;
    static int population = 1;

    Human(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        Human.population += 1;
    }

    // public String toString() {
    // return "H";
    // }
}
