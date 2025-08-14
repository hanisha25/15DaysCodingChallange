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
    int idx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,preorder.length-1);
    }
    public TreeNode build(int[] preorder, int[] inorder,int si,int ei)
    {
        if(si>ei) return null;
        TreeNode root=new TreeNode(preorder[idx++]);
        int mid=search(root.val,inorder);
        root.left=build(preorder,inorder,si,mid-1);
        root.right=build(preorder,inorder,mid+1,ei);
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