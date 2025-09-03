class Solution {
    ArrayList<Integer> sizes;
    public long countPairs(int n, int[][] edges) {
        if(edges.length==0) return (long) n * (n - 1) / 2;
        sizes=new ArrayList<>();
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges)
        {
            int a=e[0];
            int b=e[1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
               int size=dfs(adj,i,vis);
               sizes.add(size);
            }
        }
        long ans=0;
        for(int i=0;i<sizes.size();i++)
        {
            int el=sizes.get(i);
             for(int j=i+1;j<sizes.size();j++)
             {
                ans+=((long)el*sizes.get(j));
             }
        }
        return ans;
    }
    public int dfs(List<List<Integer>> adj,int edge,boolean[] vis)
    {
        vis[edge]=true;
        int size=1;
        for(int neigh:adj.get(edge))
        {
            if(!vis[neigh])
            {
                size+=dfs(adj,neigh,vis);
            }
        }
        return size;
    }
}