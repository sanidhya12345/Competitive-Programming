class Solution {
    public int majorityElement(int[] a) {
        int n=a.length;
         HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(a[i])){
                hm.put(a[i],1);
            }
            else{
                hm.put(a[i],hm.get(a[i])+1);
            }
        }
        int ans=0;
        for(int i:hm.keySet()){
            if(hm.get(i)>n/2){
                ans=i;
            }
        }
        return ans;
    }
}