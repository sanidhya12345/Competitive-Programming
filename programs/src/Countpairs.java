/*
 * Copyright (c) 3-3/8/22, 7:59 PM by Sanidhya Varshney
 */

public class Countpairs {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        int k=2;
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j< nums.length;j++){
                if(i<j && nums[i]*nums[j]%2==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
