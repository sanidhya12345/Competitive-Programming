class Solution {
    public int fillCups(int[] amount) {
        int sum=amount[0]+amount[1]+amount[2];
        int max=amount[0];
        for(int i=1;i<amount.length;i++){
            if(max<amount[i]){
                max=amount[i];
            }
        }
        if(sum-max<=max){
            return max;
        }
        else if(sum%2==0){
            return sum/2;
        }
        else{
            return sum/2+1;
        }
    }
}