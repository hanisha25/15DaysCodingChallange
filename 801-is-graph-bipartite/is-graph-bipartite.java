class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        boolean[] vis=new boolean[n];
        int[] col=new int[n];
        col[0]=0;
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                if(!Bipartite(graph,i,vis,col)) return false;
            }
        }
        return true;
    }
    public boolean Bipartite(int[][] graph,int i, boolean[] vis,int[] col) {
        int n=graph.length;
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        while(!q.isEmpty())
        {
            int cur=q.remove();
            vis[cur]=true;
            for(int neigh:graph[cur])
            {
                if(!vis[neigh])
                {
                    col[neigh]=(col[cur]==0)?1:0;
                    q.add(neigh);
                }
                else
                {
                    if(col[cur]==col[neigh])
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}