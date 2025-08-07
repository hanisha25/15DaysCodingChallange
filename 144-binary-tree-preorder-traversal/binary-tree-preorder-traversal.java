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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        Stack<TreeNode> st=new Stack<>();
        if(root==null)
        {
            return res;
        }
        st.push(root);
        while(!st.isEmpty())
        {
            TreeNode cur=st.pop();
            res.add(cur.val);
            if(cur.right!=null)
            {
                st.push(cur.right);
            }
            if(cur.left!=null)
            {
                st.push(cur.left);
            }
        }
        return res;
    }
}