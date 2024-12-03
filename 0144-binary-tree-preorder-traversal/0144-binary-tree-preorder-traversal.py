# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:

    def preorder(self,root,l):
        if root:
            l.append(root.val)
            self.preorder(root.left,l)
            self.preorder(root.right,l)
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        l=[]
        self.preorder(root,l)
        return l