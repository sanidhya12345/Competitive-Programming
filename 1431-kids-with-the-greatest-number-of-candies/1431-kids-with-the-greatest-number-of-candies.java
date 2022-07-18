class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int [] dummy=new int[candies.length];
        for(int i=0;i<candies.length;i++){
            dummy[i]=candies[i];
        }
        Arrays.sort(candies);
        int max=candies[candies.length-1];
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<dummy.length;i++){
            dummy[i]+=extraCandies;
            if(dummy[i]>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}