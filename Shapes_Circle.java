public class Shapes_Circle extends OOP_Shapes {
    @Override       // this is annotation
                     // this will work only when obj of child class is created
                        // used just for check purpose
                        // in override child class have ssame name , same no. of args as that of parent class but the body wiill be diff
       //void area11()// it will give error cause are11 is not present in parent class so it will give error                 
    void area(){
        System.out.println("Area of Cicle is pi*r*r");
    }
    
}
