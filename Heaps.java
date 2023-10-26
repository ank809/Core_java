public class Heaps {
    int arr[];
    int n;
    int i;
    Heaps(int l){
        i=0;
        arr= new int[l];
        n=l;
    }

    void insert(int element){
        if(i==n){
            System.out.println("Can't insert in heap is full");
            return;
        }
        arr[i]=element;
        int current=i;
        i++;
        while(current>0 && arr[current]>arr[(current-1)/2]){
            // swap them
            int temp= arr[current];
            arr[current]=arr[(current-1)/2];
            arr[(current-1)/2]=temp;
            current= (current-1)/2;

        }
    }

    void display(){
        for(int i=0; i<n; i++){
          System.out.println(arr[i]+" ");
        }
    }

    int delete(){
        int remove= arr[0];
        arr[0]=arr[n-1];
       int j=0;
       while(2 * j + 1 < n){
        int left= arr[2*j+1];
        int right= arr[2*j+2];
        int largest= left>right? 2*j+1: 2*j+2;
        if(arr[j]<arr[largest]){
            int temp= arr[j];
            arr[j]=arr[largest];
            arr[largest]=temp;
            j=largest; 
        }
       }
       n--;
       return remove;

    }
    public static void main(String[] args) {
        Heaps heap= new Heaps(6);
        heap.insert(25);
        heap.insert(35);
        heap.insert(10);
        heap.insert(14);
        heap.insert(2);
        heap.insert(2);
        heap.display();
        System.out.println(heap.delete());

    }
}

