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
    class Info{
        int sum;
        int nodes;
        Info(int sum,int nodes)
        {
            this.sum=sum;
            this.nodes=nodes;
        }
    }
    int count=0;
    public int averageOfSubtree(TreeNode root) {
        postorder(root);
        return count;
    }
    public Info postorder(TreeNode root)
    {
        if(root==null)
        {
            return new Info(0,0);
        }
        Info left=postorder(root.left);
        Info right=postorder(root.right);
        int left_sum=left.sum;
        int right_sum=right.sum;
        int total_nodes=left.nodes+right.nodes+1;
        int avg=(left_sum+right_sum+root.val)/total_nodes;
        if(avg==root.val)
        {
            count++;
        }
        return new Info(left_sum+right_sum+root.val,total_nodes);
    }
}