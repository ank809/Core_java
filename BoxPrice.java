public class BoxPrice {

    double price;
    BoxPrice(){
        super();
        this.price=-1;
    }
    // BoxPrice(double price){
    //     super();
    //     this.price=price;
    // }
    public BoxPrice(BoxPrice other){
        super();
       this.price=other.price ;
    }

    public BoxPrice(double l , double w, double h, double weight, double price){
        super();
        this.price= price;
    }
     public BoxPrice(double size, double weight, double price){
        super();
        this.price=price;
    }
    
}
