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
    List<Integer> preorder;
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder=new ArrayList<>();
        if(root==null)
        {
            return preorder;
        }
        util(root);
        return preorder;
    }
    public void util(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        preorder.add(root.val);
        util(root.left);
        util(root.right);
    }
}