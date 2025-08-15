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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int p:preorder)
        {
            root=build(root,p);
        }
        return root;
    }
    public TreeNode build(TreeNode root,int val)
    {
        if(root==null) 
        {
            return new TreeNode(val);
        }
        else if(root.val>val)
        {
            root.left=build(root.left,val);
        }
        else
        {
            root.right=build(root.right,val);
        }
        return root;
    }
}