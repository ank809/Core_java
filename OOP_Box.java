public class OOP_Box {
    double l;
    double w;
    double h;
   double weight;
    OOP_Box(){
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }
    // for cube
    OOP_Box(double size){
      // acting as an object class  super(); 
        this.h=size;
        this.l=size;
        this.w=size;
    }
    OOP_Box(double l , double w, double h){
        this.h=h;
        this.l=l;
        this.w=w;
    }
    OOP_Box(OOP_Box old){
        this.h=old.h;
        this.w=old.w;
        this.l=old.l;
    }
    public void information(){
        System.out.println("Box is running");
    }
    
}
