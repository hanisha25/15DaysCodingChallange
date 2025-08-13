/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // track parent nodes
        HashMap<TreeNode, TreeNode> par = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        par.put(root, null);
        while (!q.isEmpty()) {
            TreeNode cur = q.remove();
            if (cur.left != null) {
                par.put(cur.left, cur);
                q.add(cur.left);
            }
            if (cur.right != null) {
                par.put(cur.right, cur);
                q.add(cur.right);
            }
        }
        // main logic
        q.clear();

        HashSet<TreeNode> vis = new HashSet<>();
        q.add(target);
        vis.add(target);
        int dist = 0;
        while (!q.isEmpty()) {
            if (dist == k)
                break;
            int s = q.size();
            for (int i = 0; i < s; i++) {
                //par
                TreeNode cur = q.remove();
                TreeNode p = par.get(cur);
                if (p != null && !vis.contains(p)) {
                    q.add(p);
                    vis.add(p);
                }
                //children
                if (cur.left != null && !vis.contains(cur.left)) {
                    q.add(cur.left);
                    vis.add(cur.left);
                }
                if (cur.right != null && !vis.contains(cur.right)) {
                    q.add(cur.right);
                    vis.add(cur.right);
                }
            }
            dist++;
        }
        //add elements from queue to list
        List<Integer> list = new ArrayList<>();
        while (!q.isEmpty()) {
            list.add(q.remove().val);
        }
        return list;
    }
}