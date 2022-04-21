/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = Integer.MIN_VALUE;
    public void helper(TreeNode root,HashMap<Integer,Integer> map){
        if(root == null) return;
      
         if(map.containsKey(root.val)){
            int a = map.get(root.val)+1;
            map.put(root.val,a);
            max = Math.max(max,a);
        }
        else{
            map.put(root.val,1);
            max = Math.max(max,1);
        }
        
        helper(root.left,map);
        helper(root.right,map);
    }
    
    public int[] findMode(TreeNode root) {
        max = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        helper(root,map);
        ArrayList<Integer> al = new ArrayList<>();
        for(Map.Entry x : map.entrySet()){
            if((Integer)x.getValue() == max){
                al.add((Integer)x.getKey());
            }
        }
        int[] ans = new int[al.size()];
        for(int i=0; i<al.size(); i++){
            ans[i] = al.get(i);
        }
        return ans;
    }
}