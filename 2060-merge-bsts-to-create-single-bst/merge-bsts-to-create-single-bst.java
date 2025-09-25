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
    ArrayList<Integer> arr=new ArrayList<>();
    public TreeNode canMerge(List<TreeNode> trees) {
        TreeNode par=null;
        if(trees.size()==1) return trees.get(0);
        HashMap<Integer,TreeNode> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<trees.size();i++)
        {
            TreeNode cur=trees.get(i);
            if(cur.left!=null)
            {
                set.add(cur.left.val);
            }
            if(cur.right!=null)
            {
                set.add(cur.right.val);
            }
        }
        for(int i=0;i<trees.size();i++)
        {
            TreeNode cur=trees.get(i);
            if(!set.contains(cur.val))
            {
                // if(par!=null)  return null;
                par=cur;
                break;
            }
        }
        for(int i = 0; i<trees.size(); i++){
            TreeNode temp = trees.get(i);
            map.put(temp.val, temp);
        }
        helper(par,map);
        if(map.size()!=1) return null;
        validate(par);
        for(int i = 1; i< arr.size(); i++){
            if(arr.get(i) <= arr.get(i-1)) return null;
        }
        return par;
    }
    public TreeNode helper(TreeNode root,HashMap<Integer,TreeNode> map)
    {
        if(root==null) return null;
        if(root.left!=null && map.containsKey(root.left.val))
        {
            root.left=map.get(root.left.val);
            map.remove(root.left.val);
            helper(root.left,map);
        }
         if(root.right!=null && map.containsKey(root.right.val))
        {
            root.right=map.get(root.right.val);
            map.remove(root.right.val);
            helper(root.right,map);
        }
        return root;
    }
    public void validate(TreeNode root){
        if(root == null) return;

        validate(root.left);
        arr.add(root.val);
        validate(root.right);

    }
}