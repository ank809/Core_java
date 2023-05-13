public class Box_main {
    public static  void main(String[] args) {
        // OOP_Box box= new OOP_Box(4, 5, 6);
        // System.out.println(box.l+" "+box.w+" "+box.h);
        //OOP_Box box2= new OOP_Box(box);
        // System.out.println(box2.l+" "+box2.w+" "+box2.h);
        // Box_weight box3= new Box_weight();
        // System.out.println(box3.h+" "+ box3.weight);
        // Box_weight box4= new Box_weight(3.0, 4.0, 5.0, 6.0);
        // System.out.println(box4.w+" "+ box4.h+" "+box4.l+" "+box4.weight);

        // parent class also cannot access the child class but child class can until it is not private
        //  OOP_Box box5= new Box_weight();
        //  System.out.println(box5.w+" "+box5.l);    // here  OOP_Box is a parent class so it cannot access the variables of child class i.e weight 
                                                        // but it can access its own variables 
        // you cannot have child reference  variable and a parent object
        // it is giving error because  oop_box doesnot have idea what are the things present below it 
        // so it is not able to initialize the varibales 
        // Box_weight box5= new  OOP_Box();
        //  System.out.println(box5.w+" "+box5.l);

      
    }
    
}
 
