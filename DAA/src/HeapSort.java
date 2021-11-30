package DAA.src;

public class HeapSort {
    public static void sort(int [] arr) {
        int n=arr.length;
        for (int i = n/2-1; i>=0; i--) {
            heapify(arr,n,i);
        }
        for (int i = n-1; i>0; i--) {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,i,0);
        }
    }
    public static void heapify(int [] arr,int n,int i) {
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        if (left<n && arr[left]>arr[largest]) {
            largest=left;
        }
        if (right<n && arr[right]>arr[largest] ) {
            largest=right;
        }
        if (largest!=i) {
            int swap=arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;

            heapify(arr, n, largest);
        }

    }

    public static  void printArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int [] arr= {4,5,6,2,1,4,5};
        sort(arr);
        System.out.println("sorted array:-");
        printArray(arr);
    }

}
