import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MedianOftwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> merge=new ArrayList<>();
        double median=0.000;
        for (int i:
             nums1) {
            merge.add(i);
        }
        for (int i:
             nums2) {
            merge.add(i);
        }
        Collections.sort(merge);
        int size= merge.size();
        if(size%2==0){
            median=merge.get(size/2)+ merge.get((size/2)-1);
            median=median/2;
        }
        else{
            median=merge.get((size/2));
        }
        return median;
    }

    public static void main(String[] args) {
        MedianOftwoSortedArrays obj=new MedianOftwoSortedArrays();
        int [] array1={1,3};
        int [] array2={2};
        double result=obj.findMedianSortedArrays(array1,array2);
        System.out.println(result);
    }
}
