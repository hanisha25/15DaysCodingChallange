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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean past = false;
        while (!q.isEmpty()) {
            int s = q.size();
            for (int i = 0; i < s; i++) {
                TreeNode cur = q.remove();
                if(cur.left!=null)
                {
                    if(past)
                    {
                        return false;
                    }
                    else
                    {
                        q.add(cur.left);
                    }
                }
                else
                {
                    past=true;
                }
                if(cur.right!=null)
                {
                    if(past)
                    {
                        return false;
                    }
                    else
                    {
                        q.add(cur.right);
                    }
                }
                else
                {
                    past=true;
                }
            }
        }
        return true;
    }
}