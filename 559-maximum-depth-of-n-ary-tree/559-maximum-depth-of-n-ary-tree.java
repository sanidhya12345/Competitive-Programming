/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root==null)
            return 0;
        int x = 0;
        for(Node child:root.children)
            x = Math.max(x, maxDepth(child));
        return x+1;
    }
}