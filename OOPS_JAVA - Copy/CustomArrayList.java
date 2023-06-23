package OOPS_JAVA;

public class CustomArrayList {

     private int[] data ;
     private static int  DEFAULT_SIZE= 10;
     int size;


     public CustomArrayList(){
        this.data= new int[DEFAULT_SIZE];
     }

     public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
     }
     public boolean isFull(){
        return size==data.length;
     }
     public void resize(){
        int []temp = new int[data.length*2];
        for(int i=0; i<data.length; i++){
            temp[i]=data[i];
        }
        data=temp;
     }

     public void  set(int index, int value){
        data[index]= value;
     }
     public int remove(){
        return data[--size];
     }
     public int size(){
        return size;
     }


    
}
