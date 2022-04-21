class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         HashSet<Integer> temp1 = new HashSet<>();
		for (int a : nums1) { 
            temp1.add(a);
        }
        HashSet<Integer> temp2 = new HashSet<>();
        for (int b : nums2) {
            temp2.add(b);
        }

        ArrayList<List<Integer>> ans = new ArrayList<>();
        List<Integer> subAns = new ArrayList<>(); 
        for (int j : nums1) {
            if (!temp2.contains(j) && !subAns.contains(j)) {  
                subAns.add(j);
            }
        }
        ans.add(subAns);
        List<Integer> subAns1 = new ArrayList<>();
        for (int j : nums2) {
            if (!temp1.contains(j) && !subAns1.contains(j)) {
                subAns1.add(j);
            }
        }
        ans.add(subAns1);
        return ans;
    }
}