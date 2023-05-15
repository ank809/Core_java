public  abstract class  Abstract_Parent {
   // final public  abstract class  Abstract_Parent {
     // You cannot have Final Abstract Class as Final prevents it form being inherited
    abstract void career (); 
    abstract void partner();
    int age;
    //  public Abstract_Parent(int age){
    //     this.age=age;
    // }
    
    // WE cannot create abstract constructor
    // Object of abstract class is also not allowed

  //   abstract Abstarct_Parent();   you cannot create abstract constructor as abstract does not have any body

  //  Static  methods canot be Abstract as abstract classes needs to be overriden but static doesn't override 
   //  But static methods can be present inside abstract class
   static void hello(){
    System.out.println("Heloo I am in Parent");
   }
}
