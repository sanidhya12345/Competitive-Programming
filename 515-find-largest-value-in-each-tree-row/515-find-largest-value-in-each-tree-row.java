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
    Map<Integer, Integer> levelValueMap = new HashMap<>();    
    public List<Integer> largestValues(TreeNode root) {
        dfs(root, 0);        
        return new ArrayList<Integer>(levelValueMap.values());
    }
    
    private void dfs(TreeNode root, int level) {
        if(root == null) return;
        if(!levelValueMap.containsKey(level)) {
            levelValueMap.put(level, root.val);
        } else {
            levelValueMap.put(level, Math.max(levelValueMap.get(level), root.val));
        }
        
        if(root.left != null) {
            dfs(root.left, level + 1);
        }
        if(root.right != null) {
            dfs(root.right, level + 1);
        }
    }
}