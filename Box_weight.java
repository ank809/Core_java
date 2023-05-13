public class Box_weight extends OOP_Box {
    double weight;
    public Box_weight(){
    this.weight=-1;
 }

    public   Box_weight(double l, double w, double h, double weight){
        super(l , w, h); // this is used to call th parent class constructor
                         //used to initialize values present in parent class
                         // object 
        this.weight=weight;
       //  super(l , w, h);  the parent class can not be initialised after the child class as it does not care abot what child class have that why 
            // it  is always declared before the child class
        // System.out.println(this.weight);    // both of these will work in a same manner the but the only difference is that
        // System.out.println(super.weight) ;    // if the super class also has a varibale of type weight and you only want to 
                                             // access it then we use this super keyword

       
    }
    Box_weight(double size, double weight){
        super(size);
        this.weight=weight;
    }
    
    Box_weight(Box_weight other){
        super(other);
       weight=other.weight;
    }
}
// It will not be able to call those variables which are declared private in parent class
// parent class also cannot access the child class but child class can until it is not private

