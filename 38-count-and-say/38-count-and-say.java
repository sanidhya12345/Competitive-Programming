class Solution {
    public  String countAndSay(int n) {
        return solve(n,1,"1");
    }
    public String solve(int n,int i,String ans ){
        if (i==n){
            return ans;
        }
        HashMap<Character,Integer> hashMap = new HashMap<>();
        String s = "";
        int start = 0; int end = 0;
        while (end<ans.length()) {
            if (ans.charAt(start) == ans.charAt(end)) {
                if (!hashMap.containsKey(ans.charAt(start)))
                    hashMap.put(ans.charAt(start), 1);
                else hashMap.put(ans.charAt(start), hashMap.get(ans.charAt(start)) + 1);
                end++;
            }
            else {
                s = s + hashMap.get( ans.charAt(start)) + ans.charAt(start);
                hashMap.clear();
                start=end;
            }
        }
        s = s+hashMap.get(ans.charAt(start)) +ans.charAt(start);

        return solve(n,i+1,s);

    }
}