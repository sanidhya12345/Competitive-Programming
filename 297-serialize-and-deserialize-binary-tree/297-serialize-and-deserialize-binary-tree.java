/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "x";
        }
        String leftserialized=serialize(root.left);
        String rightserialized=serialize(root.right);
        return root.val+","+leftserialized+","+rightserialized;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> nodes=new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(",")));
        return helper(nodes);
    }
    private TreeNode helper(Queue<String> nodes){
        String value=nodes.poll();
        if(value.equals("x")) return null;
        TreeNode newNode=new TreeNode(Integer.valueOf(value));
        newNode.left=helper(nodes);
        newNode.right=helper(nodes);
        return newNode;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));