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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> in=new ArrayList<>();
        if(root==null)
        {
            return in;
        }
        Stack<TreeNode> st=new Stack<>();
        TreeNode node=root;
        while(true)
        {
            if(node!=null)
            {
                st.push(node);
                node=node.left;
            }
            else
            {
                if(st.isEmpty()) break;
                TreeNode cur=st.pop();
                in.add(cur.val);
                node=cur.right;
            }
        }
        return in;
    }
}