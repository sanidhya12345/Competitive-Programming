# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrderBottom(self, root: Optional[TreeNode]) -> List[List[int]]:
        #run the level order traversal and return the answer in reverse order
        
        def level_order_traversal(root):
            if not root:
                return []

            result = []
            queue = [root]

            while queue:
                level_size = len(queue)
                level_nodes = []

                for _ in range(level_size):
                    node = queue.pop(0)
                    level_nodes.append(node.val)

                    if node.left:
                        queue.append(node.left)
                    if node.right:
                        queue.append(node.right)

                result.append(level_nodes)
            return result
        l=level_order_traversal(root)
        return l[::-1]
        
