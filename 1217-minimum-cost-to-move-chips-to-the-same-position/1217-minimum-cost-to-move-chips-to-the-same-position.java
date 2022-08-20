class Solution {
    public int minCostToMoveChips(int[] position) {
        int oddcount=0;
        int evencount=0;
        for(int i:position){
            if(i%2!=0) oddcount++;
            else evencount++;
        }
        return Math.min(evencount,oddcount);
    }
}