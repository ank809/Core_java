public class Heapify {
    public static void main(String[] args) {
        int arr[]={12, 54, 67 ,2, 90, 85};
        int n= arr.length;
        buildheap(arr, n);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }

        
    }
     static void buildheap(int arr[], int n){
        for(int i=(n/2)-1; i>=0; i--){
            heapify(arr, n, i);
        }
    }
    static void heapify(int arr[], int n, int i){
        int largest= i;
        int l=  2*i+1;
        int r= 2*i+2;
        if(l<n&& arr[l]>arr[largest]){
            largest=l;
        }
        if(r<n&& arr[r]>arr[largest]){
            largest=r;
        }
        if(largest!=i){
            int temp= arr[largest];
            arr[largest]= arr[i];
            arr[i]=temp;
            heapify(arr, n, largest);
        }

    }
    
}
