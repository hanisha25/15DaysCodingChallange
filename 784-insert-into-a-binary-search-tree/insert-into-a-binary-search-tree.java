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
    public void insert(TreeNode root,int val)
    {
        if(root==null)
        {
            return;
        }
        else if(root.left==null && val<root.val)
        {
            root.left=new TreeNode(val);
        }
        else if(root.right==null && val>root.val)
        {
            root.right=new TreeNode(val);
        }
        else if(root.val<val)
        {
            insert(root.right,val);
        }
        else 
        {
            insert(root.left,val);
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
        {
            return new TreeNode(val);
        }
        insert(root,val);
        return root;
    }
}