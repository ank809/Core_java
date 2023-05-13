public class Access {

     private int num;
    String name;
    Access(int num,String name){
        this.num=num;
        this.name=name;
        int [] arr=new int[num];
    }

     // but you can still you it by getter and setter
     public  int getNum(){              // it gets the value
        return num;
     }
     public void setNum( int num){   // it sets the value
        this.num=num;;
     }
    
}
