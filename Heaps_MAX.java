import java.util.ArrayList;
import java.util.Arrays;
public class Heaps_MAX {
    int []arr;
    int size;
    int i;

    Heaps_MAX(int l){
        size=l;
        i=0;
        arr= new int[l];
    }

    public void insert(int element){
        if(i>=size){
            System.out.println("Can't insert in heap as heap is full");
            return;
        }
        arr[i]=element;
        // is used to keep track of last inserted element
        int current= i;
        i++;

        while(current>0 && arr[current]> arr[(current-1)/2]){
            // swap both the element as current/2 is parent element;
            int temp= arr[current];
            arr[current]= arr[(current-1)/2];
            arr[(current-1)/2]= temp;
            current=(current-1)/2;
        }
    }

    
    public void display(){
         System.out.println("Max heap is " + Arrays.toString(Arrays.copyOf(arr, i)));

    }

    public static void main(String[] args) {
        Heaps_MAX heap= new Heaps_MAX(5);
        heap.insert(12);
        heap.insert(45);
        heap.insert(7);
        heap.insert(95);
        heap.insert(1);
        heap.display();
    }
}
