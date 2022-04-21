class Solution {
    public int smallestEqual(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                list.add(i);
            }
        }
        Collections.sort(list);
        if(list.size()==0){
            return -1;
        }
        return list.get(0);
    }
}