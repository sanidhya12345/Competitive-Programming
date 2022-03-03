/*
 * Copyright (c) 3-3/3/22, 4:13 PM by Sanidhya Varshney
 */

public class CountObtain {
    public static int countOperations(int num1, int num2) {
        int count=0;
        if(num1==num2){
            return 1;
        }
        if(num1==0 && num2==0){
            return 0;
        }
        else{
            while(num1!=0 && num2!=0){
                if(num1>num2){
                    num1=num1-num2;
                    count+=1;
                }
                else{
                    num2=num2-num1;
                    count+=1;
                }

            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums1=2;
        int nums2=3;
        int result=countOperations(nums1,nums2);
        System.out.println(result);

    }
}
