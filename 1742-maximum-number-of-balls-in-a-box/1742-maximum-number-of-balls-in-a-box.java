class Solution {
    private int digSum(int n)
    {
         int sum = 0;
       while (n!=0){
           sum+=n%10;
           n=n/10;
       }
        return sum;
    }
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> frequencyMap=new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++){

            int temp=digSum(i);
            if(!frequencyMap.containsKey(temp)){
                frequencyMap.put(temp,1);
            }
            else{
                frequencyMap.put(temp,frequencyMap.get(temp)+1);
            }
        }
        return Collections.max(frequencyMap.values());
    }
}