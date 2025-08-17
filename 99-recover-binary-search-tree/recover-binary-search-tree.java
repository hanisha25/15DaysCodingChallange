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
    TreeNode prev=null;
    TreeNode first=null;
    TreeNode second=null;
    public void recoverTree(TreeNode root) {
        recovery(root);
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
    }
    public void recovery(TreeNode root)
    {
        if(root==null) 
        {
            return;
        }
        recovery(root.left);
        if(prev!=null && prev.val>root.val)
        {
            if(first!=null) second=root;
            else{
            first=prev;
            second=root;
            }
        }
        prev=root;
        recovery(root.right);
    }
}