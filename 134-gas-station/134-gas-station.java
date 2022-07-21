class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int diff=0;
        int curr=0;
        int start=0;
        for(int i=0;i<n;i++){
            diff+=(gas[i]-cost[i]);
            curr+=(gas[i]-cost[i]);
            if(curr<0){
                curr=0;
                start=i+1;
            }
        }
        if(diff<0){
            return -1;
        }
        return start;
        
    }
}