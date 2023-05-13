public class OOP_Number {
    int sum(int a, int b){   // This is known as method overloading as the name of the method  is same but the no. of args, datatype
                             // sequence of datatype, return type is different
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    double sum(double a, int b){
        return a+b;
    }
    
    public static void main(String[] args) {
        OOP_Number obj= new OOP_Number();
        System.out.println(obj.sum(1, 2));
        obj.sum(2.345, 3);
        obj.sum(1,6,8);
    } 
    
}
