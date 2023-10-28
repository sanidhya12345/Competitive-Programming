package Prep.src;
public class RotateAnArrayTowardsRightNtimes {
    private static void printarray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void rotateByUsingIntermediateArray(int [] nums,int k){
        if(k>nums.length){
            k=k%nums.length;  //If value of k is greater than the array length.
        }
        int [] result=new int[nums.length];
        for(int i=0;i<k;i++){
            result[i]=nums[nums.length-k+i];
        }
        int j=0;
        for(int i=k;i< nums.length;i++){
            result[i]=nums[j];
            j++;
        }
        System.arraycopy(result,0,nums,0,nums.length);
    }

    public static void bubbleRotate(int [] arr,int order){
        for(int i=0;i<order;i++){
            for(int j= arr.length-1;j>0;j--){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        int [] arr={1,2,3,4,5};
        int k=2;
        System.out.println("After Using InterMediate Array:- ");
        rotateByUsingIntermediateArray(nums,k);
        printarray(nums);
        System.out.println("Without Using InterMediate Array");
        bubbleRotate(arr,k);
        printarray(arr);
    }
}
