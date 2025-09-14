class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;
        while (!q.isEmpty()) {
            int cur = q.remove();
            for (int neigh : rooms.get(cur)) {
                if(!vis[neigh])
                {
                    vis[neigh]=true;
                    q.add(neigh);
                }
            }
        }
        for (boolean v : vis) {
            if (v == false) {
                return false;
            }
        }
        return true;
    }
}