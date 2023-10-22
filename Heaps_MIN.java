import java.util.Arrays;

public class Heaps_MIN {
    int size;
    int i;
    int [] arr;

    Heaps_MIN(int l){
        size= l;
        i=0;
        arr= new int[size];
    }

    public void insert(int element){
        if(i>=size){
            System.out.println("Cannot insert in heap as its full");
            return;
        }

        arr[i]= element;
        int current= i;
        i++;

        while(current>0 && arr[current]<arr[(current-1)/2]){
            // swap them as  the child is smaller than the parent and we are doing minimum heap
            int temp= arr[current];
            arr[current]= arr[(current-1)/2];
            arr[(current-1)/2]= temp;
            current= (current-1)/2;
        }
    }

    public void display(){
        System.out.println(Arrays.toString(Arrays.copyOf(arr, size)));
    }

    public static void main(String[] args) {
        Heaps_MIN heaps= new Heaps_MIN(6);
        heaps.insert(14);
        heaps.insert(78);
        heaps.insert(11);
        heaps.insert(40);
        heaps.insert(34);
        heaps.insert(7);
        heaps.display();
    }
}
