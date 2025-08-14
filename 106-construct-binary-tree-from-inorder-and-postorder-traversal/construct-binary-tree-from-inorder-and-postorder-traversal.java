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
    int idx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx=postorder.length-1;
        return build(postorder,inorder,0,postorder.length-1);
    }
     public TreeNode build(int[] postorder, int[] inorder,int si,int ei)
    {
        if(si>ei) return null;
        TreeNode root=new TreeNode(postorder[idx--]);
        int mid=search(root.val,inorder);
        root.right=build(postorder,inorder,mid+1,ei);
        root.left=build(postorder,inorder,si,mid-1);
        return root;

    }
    public int search(int val,int[] inorder)
    {
        for(int i=0;i<inorder.length;i++)
        {
            if(inorder[i]==val)
            {
                return i;
            }
        }
        return -1;
    }
}