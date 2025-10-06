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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> res=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int num:to_delete)
        {
            set.add(num);
        }
        deleteHelper(root,set,res);
        if(!set.contains(root.val))
        {
            res.add(root);
        }
        return res;
    }
    public TreeNode deleteHelper(TreeNode root,HashSet<Integer> set,List<TreeNode> res)
    {
        if(root==null) return null;
        root.left=deleteHelper(root.left,set,res);
        root.right=deleteHelper(root.right,set,res);
        if(set.contains(root.val))
        {
            if(root.left!=null) res.add(root.left);
            if(root.right!=null) res.add(root.right);
            return null;
        }
        else
        {
            return root;
        }
    }
}