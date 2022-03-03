/*
 * Copyright (c) 3-3/3/22, 9:11 AM by Sanidhya Varshney
 */

public class Minimum_Time_trips {
    public static long minimumTime(int[] time, int totalTrips) {
        long low = 0;
        long high = (long)(1e14);
        while(low<=high){
            long mid=low+(high-low)/2;
            if(count(time,mid)>=totalTrips){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static long count(int [] time,long currenttime){
        long counttrips=0;
        for(int t:time){
            counttrips+=(currenttime/t);
        }
        return counttrips;
    }
    public static void main(String[] args) {
        int []time = {1,2,3};
        int totalTrips = 5;
        long ans=minimumTime(time,totalTrips);
        System.out.println(ans);
    }
}
