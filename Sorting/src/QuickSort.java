
import java.util.*;
public class QuickSort {
   static void swap(int[] arr, int i, int j)
    {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high) 
    {   
      
    int pivot = arr[high]; 
    int i = (low - 1); 
  
    for(int j = low; j <= high - 1; j++)
    {
        if (arr[j] < pivot) 
        {
            i++; 
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return (i + 1);
}
    static void quicksort(int[] arr, int low, int high)
    {
        if (low < high) 
        {
          
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
    }
}
  
    static void printArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
          
        System.out.println();
}
    public static void main(String[] args) {
        int [] array={19,12,20,3,4,5};
        int n=array.length;
        quicksort(array,0,n-1);
        System.out.println("Sorted Array:-");
        printArray(array,n);
    }
}
