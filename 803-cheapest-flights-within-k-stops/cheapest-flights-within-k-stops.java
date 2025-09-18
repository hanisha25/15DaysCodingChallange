class Solution {
    class Pair
    {
        int dest,wt;
        public Pair(int dest,int wt)
        {
            this.dest=dest;
            this.wt=wt;
        }
    }
    class Tuple
    {
        int src,stops,cost;
        public Tuple(int src,int stops,int cost)
        {
            this.src=src;
            this.stops=stops;
            this.cost=cost;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
       List<List<Pair>> list=new ArrayList<>(); 
        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<Pair>());
        }
        for(int[] f:flights)
        {
            int a=f[0],b=f[1],wt=f[2];
            list.get(a).add(new Pair(b,wt));
        }
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        Queue<Tuple> q=new LinkedList<>();
        q.add(new Tuple(src,0,0));
        while(!q.isEmpty())
        {
            Tuple cur=q.remove();
            int s=cur.src;
            if (cur.stops > k) continue;
            for(Pair neigh:list.get(s))
            {
                if((cur.cost+neigh.wt)<dist[neigh.dest])
                {
                    dist[neigh.dest]= cur.cost+neigh.wt;
                    q.add(new Tuple(neigh.dest,cur.stops+1,cur.cost+neigh.wt));
                }
            }
        }
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}