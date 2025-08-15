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
class BSTIterator {
    Stack<TreeNode> st;
    public BSTIterator(TreeNode root) {
        st=new Stack<TreeNode>();
        TreeNode cur=root;
        while(cur!=null)
        {
            st.push(cur);
            cur=cur.left;
        }
    }
    
    public int next() {
        TreeNode cur=st.pop();
        int value=cur.val;
        TreeNode temp=cur.right;
        while(temp!=null)
        {
            st.push(temp);
            temp=temp.left;
        }
        return value;
    }
    
    public boolean hasNext() {
        if(st.isEmpty())
        {
            return false;
        }
        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */