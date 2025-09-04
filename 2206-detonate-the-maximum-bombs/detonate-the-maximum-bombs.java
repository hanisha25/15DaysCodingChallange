class Solution {
    //     dist=(x1​−x2​)2+(y1​−y2​)2
    // ​    (x1​−x2​)2+(y1​−y2​)2≤r2 Euclidean distance formula
    public int maximumDetonation(int[][] bombs) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = bombs.length;
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                long x=bombs[i][0]-bombs[j][0];
                long y=bombs[i][1]-bombs[j][1];
                long dist= (x*x) + (y*y); 
                long r=bombs[i][2];
                long radius=(r*r);
                if(dist<=radius)
                {
                    adj.get(i).add(j);
                }
            }
        }
        int maxCount=0;
        for(int i=0;i<n;i++)
        {
            boolean[] vis = new boolean[n];
            int count = dfs(i, adj, vis);
            maxCount = Math.max(maxCount, count);
        }
        return maxCount ;
    }

    public int dfs(int i, List<List<Integer>> adj, boolean[] vis) {
        int count=1;
        vis[i] = true;
        for (int neigh : adj.get(i)) {
            if(!vis[neigh])
            {
               count+=dfs(neigh,adj,vis);
            }
        }
        return count;
    }
}